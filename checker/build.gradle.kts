plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

dependencies {
    shadow("org.jetbrains:annotations:24.0.1")
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}