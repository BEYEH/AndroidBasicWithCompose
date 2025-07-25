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
    - Pathway 1: Get data from the internet
      - Example - Race Tracker
      - Example - Mars Photos
    - Pathway 2:  Load and display images from the internet
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
      - Use `MutableLiveData` + `LiveData`.
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

  // Retrofit
  val rf_version = "3.0.0"
  implementation("com.squareup.retrofit2:retrofit:$rf_version")
  implementation("com.squareup.retrofit2:converter-gson:$rf_version")

  // Coil
  val coil_version = "2.7.0"
  implementation("io.coil-kt:coil-compose:$coil_version")
}
```

## My Practice

- MVVM
  - Android MVVM 01 - Get Local Data
  - Android MVVM 02 - Counter
  - Android MVVM 03 - Input Field
  - Android MVVM 04 - Navigation
  - Android MVVM 05 - Manage State
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

- Android Developers
  - [Jetpack Compose for Android Developers](https://developer.android.com/courses/pathways/compose)
  - [Training Courses](https://developer.android.com/courses)
    - For beginners
      - [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course)
    - For experienced Android developers
      - [Jetpack Compose for Android developers](https://developer.android.com/courses/jetpack-compose/course)
      - [Android app architecture](https://developer.android.com/courses/pathways/android-architecture)
      - [Accessibility](https://developer.android.com/courses/pathways/make-your-android-app-accessible)
  - [Jetpack](https://developer.android.com/jetpack)
    - [Libraries](https://developer.android.com/jetpack/androidx/explorer)
      - [Compose Runtime - Declaring dependencies](https://developer.android.com/jetpack/androidx/releases/compose-runtime#declaring_dependencies)
      - [Navigation - Declaring dependencies](https://developer.android.com/jetpack/androidx/releases/navigation#declaring_dependencies)
    - [Compose Roadmap](https://developer.android.com/jetpack/androidx/compose-roadmap)
- [Kotlin](https://kotlinlang.org/)
  - [Playground](https://play.kotlinlang.org/)
- GitHub
  - [Google Developer Training](https://github.com/google-developer-training)
  - [Square / Retrofit](https://github.com/square/retrofit)
- YouTube
  - [Easy Tuto - Jetpack Compose](https://youtube.com/playlist?list=PLgpnJydBcnPA5aNrlDxxKWSqAma7m3OIl&si=7rFhu96CfRllxo5E)

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

- Measure the execution time of code block.

  ``` kt
  import kotlin.time.measureTime

  fun main() {
      val duration = measureTime {
          Thread.sleep(1000)
      }
      println("Code execution took: $duration")
  }
  ```

- Try-catch exceptions

  ``` kt
  try {
      // Code that may throw an exception
      val data = api.fetchData()
  } catch (e: IOException) {
      Log.e("Network", "Network error: ${e.message}")
  } catch (e: Exception) {
      Log.e("General", "Unknown error: ${e.message}")
  }
  ```
