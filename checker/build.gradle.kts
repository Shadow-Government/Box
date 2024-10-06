plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    //id("maven-publish")
}

dependencies {
    val jspecify_annotations_version = findProperty("jspecify_annotations_version")
    val jetbrains_annotations_version = findProperty("jetbrains_annotations_version")

    implementation("org.jspecify", "jspecify", "$jspecify_annotations_version")
    implementation("org.jetbrains", "annotations", "$jetbrains_annotations_version")
}

/*
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
*/

tasks {
    build {
        finalizedBy(shadowJar)
    }
}