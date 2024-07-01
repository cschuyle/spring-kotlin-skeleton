# Simple Spring Web App, using Kotlin and Gradle

This is minimal webapp built using:

- Spring Boot
- Kotlin (not Java)
- Gradle (not Maven (mvn))
- PostgreSQL

## Purpose

As a template or starter for a larger webapp, with nontrivial, yet minimal, dependencies.

To test deployment to various cloud providers.

## Roadmap

- Add Security
- Add a frontend (e.g. React)

## Issues

- Trying to get deployed to Heroku. Current error:

  ```console
  2024-07-01T05:36:11.736554+00:00 heroku[web.1]: State changed from crashed to starting
  2024-07-01T05:36:16.403547+00:00 heroku[web.1]: Starting process with command java -Dserver.port=51142 $JAVA_OPTS -jar build/libs/ktskull-0.0.1-SNAPSHOT.jar
  2024-07-01T05:36:17.034937+00:00 app[web.1]: Setting JAVA_TOOL_OPTIONS defaults based on dyno size. Custom settings will override them.
  2024-07-01T05:36:17.039819+00:00 app[web.1]: Picked up JAVA_TOOL_OPTIONS: -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8
  2024-07-01T05:36:17.103389+00:00 app[web.1]: Error: Could not find or load main class com.example.ktskull.AppKt
  2024-07-01T05:36:17.103390+00:00 app[web.1]: Caused by: java.lang.ClassNotFoundException: com.example.ktskull.AppKt
  2024-07-01T05:36:17.174760+00:00 heroku[web.1]: Process exited with status 1
  2024-07-01T05:36:17.198709+00:00 heroku[web.1]: State changed from starting to crashed
  ```
