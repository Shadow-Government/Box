allprojects {
    group   = "com.thecrownstudios"
    version = "0.1-SNAPSHOT"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "maven-publish")

    repositories {
        mavenCentral()

        maven {
            name = "JitPack"
            url  = uri("https://jitpack.io")
        }
    }

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17

        tasks.withType<JavaCompile> {
            options.encoding = "UTF-8"
            options.compilerArgs.addAll(listOf("-Xlint:none", "-Xlint:-deprecation", "-Xlint:-unchecked"))
        }

        tasks.withType<Javadoc> {
            options.encoding = "UTF-8"
        }
    }

    configure<PublishingExtension> {
        publications {
            create<MavenPublication>("mavenJava") {
                groupId     = project.group as String?
                artifactId  = project.name
                version     = project.version as String?

                from(components["java"])

                pom {
                    name.set(project.name)
                    description.set("A concise description of my library")
                    url.set("http://www.example.com/library")

                    print(project.name)

                    developers {
                        developer {
                            id.set("The-Crown-Studios")
                            name.set("The Crown Studios")
                            email.set("business@thecrownstudios.it")
                            url.set("https://github.com/The-Crown-Studios")
                        }
                    }
                }
            }
        }
    }
}