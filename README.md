# VersatiaStarter

One dependency for a [Versatia](https://github.com/VersatiaFramework) plugin, in the spirit of a
Spring Boot starter: no code, only the artifacts a plugin compiles against.

```kotlin
dependencies {
    implementation("com.github.marcoral.versatia:VersatiaStarter:0.0.1")
    ksp("com.github.marcoral.versatia:VersatiaAPI-ksp:0.0.1")
}
```

| Exported artifact                                       | What it is                                                     |
|---------------------------------------------------------|----------------------------------------------------------------|
| `com.github.marcoral.versatia:VersatiaAPI`              | the framework API: annotations, `VersatiaPlugin`, utilities; brings the Paper API and Kotlin |
| `com.github.marcoral.versatia:VersatiaModule-Messages`  | the [Messages module](https://versatiaframework.github.io/VersatiaDocs/docs/modules/messages) API: messages and text with runtime arguments |

The code generator (`VersatiaAPI-ksp`) cannot be exported: it belongs on the `ksp` configuration,
which Gradle does not fill transitively, so it stays a second line.

Nothing from the starter ends up in a plugin's JAR: on the server the classes come from
VersatiaCore and the module plugins, which the plugin lists under `depend:` as before. The
starter changes the build only. A plugin that uses no module may keep depending on `VersatiaAPI`
alone.

Documentation: [Installation](https://versatiaframework.github.io/VersatiaDocs/docs/getting-started/installation).

## Building

Requires JDK 21 and VersatiaAPI and VersatiaModule-Messages in your local Maven repository
(`./gradlew publishToMavenLocal` in each checkout):

```bash
./gradlew publishToMavenLocal
```
