group   =   "com.thecrownstudios"
version =   "0.1-SNAPSHOT"

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    tasks.withType<Javadoc> {
        options.encoding = "UTF-8"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    shadow(project(":checker"))

    shadow("org.jetbrains:annotations:24.0.1")
    shadow("net.kyori:adventure-api:4.13.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.thecrownstudios"
            artifactId = "tickable"
            version = "0.1-SNAPSHOT"

            from(components["java"])
        }
    }
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}