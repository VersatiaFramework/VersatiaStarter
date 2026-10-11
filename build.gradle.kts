plugins {
    `java-library`
    `maven-publish`
}

group = "com.github.marcoral.versatia"
version = "0.0.1"

// No code: the starter only exports the artifacts a Versatia plugin compiles against; see README.md
dependencies {
    api("com.github.marcoral.versatia:VersatiaAPI:0.0.1")
    api("com.github.marcoral.versatia:VersatiaModule-Text:0.0.1")
    api("com.github.marcoral.versatia:VersatiaModule-Messages:0.0.1")
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
