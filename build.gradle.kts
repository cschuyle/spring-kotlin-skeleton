plugins {
    id("org.springframework.boot") version "3.3.1"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("com.ninja-squad:springmockk:4.0.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// Don't do this - it breaks the executable jar (results in main ClassNotFound).
//    tasks.withType<Jar> {
//        manifest {
//            attributes["Main-Class"] = "com.example.ktskull.AppKt"
//        }
//    }

// Use this instead of tasks,withType<Jar>
springBoot {
    mainClass.set("com.example.ktskull.AppKt")
}

// Disable generation of plain jar - it confuses poor old Heroku unless you use a Procfile (override the startup command),
// because Heroku uses build.libs/*.jar as its target for the java -jar command.
// See https://docs.spring.io/spring-boot/gradle-plugin/packaging.html#packaging-executable.and-plain-archives
tasks.named("jar") {
    enabled = false
}

