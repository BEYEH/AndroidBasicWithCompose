<!-- omit in toc -->
# Unit 5 - Mars Photos

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
    ...
    // Compose Runtime
    implementation (libs.androidx.runtime)
    implementation (libs.androidx.runtime.livedata)
    // Retrofit
    implementation(libs.retrofit)
    // Retrofit with Scalar Converter
    implementation(libs.converter.scalars)
  }
  ```

- `gradle/libs.versions.toml`

  ```toml
  [versions]
  converterScalars = "3.0.0"
  retrofit = "3.0.0"
  runtime = "1.8.3"

  [libraries]
  androidx-runtime = { module = "androidx.compose.runtime:runtime", version.ref = "runtime" }
  androidx-runtime-livedata = { module = "androidx.compose.runtime:runtime-livedata", version.ref = "runtime" }
  converter-scalars = { module = "com.squareup.retrofit2:converter-scalars", version.ref = "converterScalars" }
  retrofit = { module = "com.squareup.retrofit2:retrofit", version.ref = "retrofit" }

  [plugins]
  ```

## Steps

## Note

## Resources

- GitHub
  - [basic-android-kotlin-compose-training-mars-photos](https://github.com/google-developer-training/basic-android-kotlin-compose-training-mars-photos/tree/starter)
- Data
  - [A list of available real estate properties on Mars](https://android-kotlin-fun-mars-server.appspot.com/realestate)
  - [A list of Mars photos](https://android-kotlin-fun-mars-server.appspot.com/photos)
