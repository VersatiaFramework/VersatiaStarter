plugins {
    `java-library`
    `maven-publish`
}

group = "com.github.marcoral.versatia"
version = providers.gradleProperty("versatiaVersion").get()

// No code: the starter only exports the artifacts a Versatia plugin compiles against; see README.md.
// compileOnlyApi keeps them off the runtime classpath, so not even a shading plugin can pack them
dependencies {
    compileOnlyApi(libs.versatia.api)
    compileOnlyApi(libs.versatia.messages)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "VersatiaStarter"
            from(components["java"])
        }
    }
}
