<!-- omit in toc -->
# Unit 5 - Race Tracker

<!-- omit in toc -->
## Table of contents

- [App Screenshots](#app-screenshots)
- [Dependencies](#dependencies)
- [Steps](#steps)
- [Note](#note)
- [Resources](#resources)

## App Screenshots

## Dependencies

- `build.gradle.kts (:app)`

  ```kts
  dependencies {
    // Compose Runtime
    implementation (libs.androidx.runtime)
    implementation (libs.androidx.runtime.livedata)
  }
  ```

- `gradle/libs.versions.toml`

  ```toml
  [versions]
  runtime = "1.8.3"

  [libraries]
  androidx-runtime = { module = "androidx.compose.runtime:runtime", version.ref = "runtime" }
  androidx-runtime-livedata = { module = "androidx.compose.runtime:runtime-livedata", version.ref = "runtime" }

  [plugins]
  ```

## Steps

## Note

## Resources
