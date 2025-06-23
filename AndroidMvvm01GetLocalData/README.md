<!-- omit in toc -->
# Android MVVM 01 - Get Local Data

<!-- omit in toc -->
## Table of contents

- [App Architecture](#app-architecture)
- [Dependencies](#dependencies)
- [Pathway](#pathway)
- [Resources](#resources)

## App Architecture

<img src="../images/mvvm01_app_architecture.png" alt="The App Architecture" width="400"/>

## Dependencies

- AndroidBasicWithCompose/AndroidMvvm01GetLocalData/app/build.gradle.kts

  ```kts
  dependencies {
    ...
    implementation("androidx.compose.runtime:runtime-livedata:1.8.1")
  }
  ```

## Pathway

- Create app.
- Update ui.
  - Add basic ui components you need.
- Create model.
- Create viewmodel.
- Create user repository to get datas from the API.
- Call the repository method.
- Call get user data and the data will reflected in the UI.
- Update ui.
  - Add progress bar till datas are loaded.

## Resources

- YouTube
  - [Simple MVVM App 🔥 | Android | Jetpack Compose](https://www.youtube.com/watch?v=9eIhMFTs1Q8)
- [State and Jetpack Compose - Other supported types of state](https://developer.android.com/develop/ui/compose/state#use-other-types-of-state-in-jetpack-compose)
