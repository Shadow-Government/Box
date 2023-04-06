group   =   "com.thecrownstudios"
version =   "0.1-SNAPSHOT"

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
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

    /*
    tasks.withType<Jar> {
        println(message = "ARCHIVE INFORMATION")
        println(message = "rootname:   ${rootProject.name}")
        println(message = "basename:   ${archiveBaseName.get()}")
        println(message = "version:    ${archiveVersion.get()}")
        println(message = "extension:  ${archiveExtension.get()}")
        println()

        archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}.${archiveExtension.get()}")
    }
    */
}

repositories {
    mavenCentral()
}

dependencies {
    shadow("org.jetbrains:annotations:24.0.1")
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}