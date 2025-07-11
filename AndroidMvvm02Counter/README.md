<!-- omit in toc -->

# Android MVVM 02 - Counter

<!-- omit in toc -->

## Table of contents

- [App Screenshots](#app-screenshots)
- [Dependencies](#dependencies)
- [Pathway](#pathway)
- [Resources](#resources)

## App Screenshots

<img src="../images/mvvm02_app_screenshot_01.png" alt="The App Architecture" width="130"/>

<img src="../images/mvvm02_app_screenshot_02.png" alt="The App Architecture" width="300"/>

## Dependencies

- AndroidBasicWithCompose/AndroidMvvm02Counter/app/build.gradle.kts

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
- Create empty packages.
  - view, viewmodel, model
- In model, create user repository to get datas from the API.
- In viewmodel, call the repository method.
- In view, observe the data through viewmodel and reflect in the UI.
- In MainActivity, use provider to create an instance for viewmodel.

## Resources

- GitHub
  - [abhineshchandra1234 / CounterMVVM](https://github.com/abhineshchandra1234/CounterMVVM)
- Android
  - [State and Jetpack Compose - Other supported types of state](https://developer.android.com/develop/ui/compose/state#use-other-types-of-state-in-jetpack-compose)
