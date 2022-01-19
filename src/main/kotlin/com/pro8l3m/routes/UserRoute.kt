package com.pro8l3m.routes

import com.pro8l3m.data.mocks.Mocks
import com.pro8l3m.data.model.User
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.users() {

    get("/users") {
        if (Mocks.users.isNotEmpty()) {
            call.respond(HttpStatusCode.OK, Mocks.users)
        } else {
            call.respondText("No users found", status = HttpStatusCode.NotFound)
        }
    }

    route("/user") {

        get("{id}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                "Missing or malformed id",
                status = HttpStatusCode.BadRequest
            )
            val user = Mocks.users.find { it.id.toString() == id } ?: return@get call.respondText(
                "No user with id $id",
                status = HttpStatusCode.NotFound
            )
            call.respond(HttpStatusCode.OK, user)
        }

        post {
            val customer = call.receive<User>()
            val newId = Mocks.users.maxOfOrNull { it.id!! }?.plus(1) ?: 0
            Mocks.users.add(customer.copy(id = newId))
            call.respondText("User stored correctly", status = HttpStatusCode.Created)
        }

        delete("{id}") {
            val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
            if (Mocks.users.removeIf { it.id.toString() == id }) {
                call.respondText("User removed correctly", status = HttpStatusCode.Accepted)
            } else {
                call.respondText("Not Found", status = HttpStatusCode.NotFound)
            }
        }
    }

}