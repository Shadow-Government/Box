allprojects {
    group   = "com.thecrownstudios"
    version = "0.1-SNAPSHOT"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "maven-publish")

    repositories {
        mavenCentral()
    }

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17

        tasks.withType<JavaCompile> {
            options.encoding = "UTF-8"
        }

        tasks.withType<Javadoc> {
            options.encoding = "UTF-8"
        }
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("maven") {
                groupId     = project.group as String?
                artifactId  = project.name
                version     = project.version as String?

                from(components["java"])
            }
        }
    }
}