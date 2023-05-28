plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("maven-publish")
}

dependencies {
    shadow("org.jetbrains:annotations:24.0.1")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.thecrownstudios.box"
            artifactId = "checker"
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