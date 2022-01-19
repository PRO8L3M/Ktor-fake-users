package com.pro8l3m.plugins

import com.pro8l3m.routes.users
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    

    routing {
        users()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
