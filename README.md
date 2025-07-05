<!-- omit in toc -->
# AndroidBasicWithCompose

<!-- omit in toc -->
## Table of contents

- [Courses](#courses)
  - [For beginners](#for-beginners)
  - [For experienced Android developers](#for-experienced-android-developers)
- [App Architecture](#app-architecture)
- [Dependencies](#dependencies)
- [My Practice](#my-practice)
- [My Note](#my-note)
- [Resources](#resources)
- [Appendix](#appendix)

## Courses

### For beginners

- Android Basics with Compose
  - Unit 1. Unit 1: Your first Android app
  - Unit 2: Building app UI
    - Test - Lemonade App
  - Unit 3: Display lists and use Material Design
  - Unit 4: Navigation and app architecture
    - Example - Dessert Clicker
    - Example - Unscramble app
  - Unit 5: Connect to the internet
  - Unit 6: Data persistence
  - Unit 7: WorkManager
  - Unit 8: Views and Compose

### For experienced Android developers

- Jetpack Compose for Android developers
- Android app architecture

## App Architecture

- MVVM
  - MainActivity
    - Use `ViewModelProvider`.
  - View
    - App
      - Use `observeAsState`.
  - ViewModel
    - AppViewModel
      - Use `MutableLiveData`.
      - Use `LiveData`.
  - Model
    - Resources of data
      - Local
      - Remote (Retrofit, firebase or any other api)

## Dependencies

``` kts
// build.gradle.kts (:app)
dependencies {
  ...
  // Navigation
  val nav_version = "2.9.1"
  implementation ("androidx.navigation:navigation-compose:$nav_version")

  // Compose Runtime
  val rt_version = "1.8.3"
  implementation ("androidx.compose.runtime:runtime:$rt_version")
  implementation ("androidx.compose.runtime:runtime-livedata:$rt_version")
  implementation ("androidx.compose.runtime:runtime-rxjava2:$rt_version")
}
```

## My Practice

- MVVM
  - Android MVVM 01 - Get Local Data
  - Android MVVM 02 - Counter
  - Android MVVM 03 - Input Field
  - Android MVVM 04 - Navigation
  - Android MVVM 05 - Login Screen
- Other
  - Test - Execute Binary File
  - Test - Execute .so File

## My Note

- UI layer pipeline
  - App data -> UI data -> UI elements -> UI events -> UI changes > repeat
- Manage state
  - remember
    - persist state on recomposition
  - rememberSaveable
    - persist even on configuration changes
  - ViewModel & Livedata
    - host the state for reusable and testable

- Jetpack Compose
  - `Column`
    - Show all data at once.
  - `LazyColumn`
    - Load and show data which are visible in the screen.
    - Render dynamically. It can boost performance.

## Resources

- [Android Developers Training courses](https://developer.android.com/courses)
- [Download Node.js®](https://nodejs.org/en/download)
- YouTube
  - [Easy Tuto - Jetpack Compose](https://youtube.com/playlist?list=PLgpnJydBcnPA5aNrlDxxKWSqAma7m3OIl&si=7rFhu96CfRllxo5E)
- Android Jetpack Libraries
  - [Compose Runtime - Declaring dependencies](https://developer.android.com/jetpack/androidx/releases/compose-runtime#declaring_dependencies)
  - [Navigation - Declaring dependencies](https://developer.android.com/jetpack/androidx/releases/navigation#declaring_dependencies)

## Appendix

- VSCode format file with shortcut:
  - Windows: `shift` + `alt` + `f`
  - Mac: `shift` + `option` + `f`
  - Linux: `ctrl` + `shift` + `i`
- Format all the markdown files.

  - Add settings in `.prettierrc`.

    ```json
    {
      "printWidth": 80,
      "proseWrap": "always"
    }
    ```

  - Excute the command.

    ```bash
    npx prettier --write "**/*.md"
    ```
