plugins {
    id("java")
    //id("com.github.johnrengelman.shadow") version "8.1.1"
    id("maven-publish")
}

dependencies {
    implementation(project(":checker"))

    implementation("org.jetbrains:annotations:24.0.1")
    implementation("net.kyori:adventure-api:4.13.0")
}

repositories {
    maven {
        name = "Adventure"
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.thecrownstudios.box"
            artifactId = "tickable"
            version = "0.1-SNAPSHOT"

            from(components["java"])
        }
    }
}

/*
tasks {
    build {
        finalizedBy(shadowJar)
    }
}
*/