plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.3"
    //id("maven-publish")
}

dependencies {
    val jspecify_annotations_version = findProperty("jspecify_annotations_version")
    val jetbrains_annotations_version = findProperty("jetbrains_annotations_version")

    implementation("org.jspecify", "jspecify", "$jspecify_annotations_version")
    implementation("org.jetbrains", "annotations", "$jetbrains_annotations_version")
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}