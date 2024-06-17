plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    //id("maven-publish")
}

dependencies {
    val annotations_version = findProperty("jetbrains_annotations_version")

    implementation("org.jetbrains", "annotations", "$annotations_version")
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}