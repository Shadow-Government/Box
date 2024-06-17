allprojects {
    group       = "com.thecrownstudios.box"
    version     = "0.1-SNAPSHOT"
    description = "lorem ipsum"
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21

        tasks.withType<ProcessResources> {
            filteringCharset = "UTF-8"
        }

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

                pom {
                    name.set(project.name)
                    description.set("A library with many tools")
                    url.set("https://github.com/The-Crown-Studios/Box")

                    licenses {
                        license {
                            name.set("GNU General Public License v3.0")
                            url.set("https://www.gnu.org/licenses/gpl-3.0.html")
                        }
                    }

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