rootProject.name = "VersatiaStarter"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        // The Versatia artifacts are consumed from the local Maven repository (`./gradlew publishToMavenLocal` in each checkout)
        mavenLocal()
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}
