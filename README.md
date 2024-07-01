# SpringRestfullStatelessStarter

<p>A Spring Restfull (using JWT) &amp; Stateless starter [UP TO DATE]</p>
Based from
<ul>
<li>
https://medium.com/@tericcabrel/implement-jwt-authentication-in-a-spring-boot-3-application-5839e4fd8fac
</li>
<li>
https://github.com/tericcabrel/blog-tutorials/tree/main/springboot-jwt-auth
</li>
</ul>

# How to run ?
Recommended
- MySQL Server 8.2
Required
- JDK 22
- MySQL Server (for other, edit build.gradle.kts)

<p>This project is using Gradle Kotlin, please see `build.gradle.kts`</p>

## Please, before run, check `application.properties`

Custom with your values:
- server.port (Facultative to edit)
- spring.datasource.url
- spring.datasource.username
- spring.datasource.password
- spring.jpa.hibernate.ddl-auto (Facultative to edit)
- spring.jpa.open-in-view=false (Facultative)
- security.jwt.secret-key
- security.jwt.expiration-time (Facultative to edit)

<p>To generate your own SECRET_KEY</p>

```shell
node -e "console.log(require('crypto').randomBytes(32).toString('hex'))"
```
(Source)[https://dev.to/tkirwa/generate-a-random-jwt-secret-key-39j4]

## Run the project

```shell
gradlew bootRun
```
