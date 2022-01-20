## Deploy to Heroku

### Setting Ktor project

Before deploying Ktor project to Heroku we need to do 2 things.

1. Firstly, we need to add new gradle task with name `stage`. Just paste code below:

```
tasks {
    task("stage") {
        dependsOn("installDist")
    }
}
```
2. Second thing is to create a file called `Procfile` which is required by Heroku (in project root directory). 
Should be just a text file but without `txt.` suffix. After that, run task `stage` to be sure to install app build. Last step 
is to paste path to this generated build. E.g. 
```
web: build/install/com.pro8l3m.ktor-fake-users/bin/com.pro8l3m.ktor-fake-users
```

### Deploying

- Commit and push changes to project repository on GitHub
- Push previosly commited changes to Heroku with line below:
```sh
git push heroku master
```