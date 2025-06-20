<!-- omit in toc -->

# Unit 4: Navigation and app architecture

<!-- omit in toc -->

## Table of contents

- [Unit 4: Navigation and app architecture](#unit-4-navigation-and-app-architecture)
  - [Table of contents](#table-of-contents)
  - [Pathway](#pathway)
    - [Architecture Components](#architecture-components)
    - [Navigation in Jetpack Compose](#navigation-in-jetpack-compose)
    - [Adapt for different screen sizes](#adapt-for-different-screen-sizes)
  - [Resources](#resources)

## Pathway

### Architecture Components

- Stages of the Activity lifecycle

  - In Android, an activity is the entry point for interacting with the user.
  - In the past, one activity would display one screen in an app.
  - With current best practices, one activity might display multiple screens by
    swapping them in and out as needed.
  - The activity lifecycle extends from the creation of the activity to its
    destruction, when the system reclaims that activity's resources. As a user
    navigates in and out of an activity, each activity transitions between
    different states in the activity lifecycle.
  - The asterisk on the onRestart() method indicates that this method is not
    called every time the state transitions between Created and Started. It is
    only called if onStop() was called and the activity is subsequently
    restarted.

    <img src="../images/activity_lifecycle.png" alt="The Activity Lifecycle" width="300"/>

    | **情境**       | **Lifecycle 呼叫順序**                     |
    | -------------- | ------------------------------------------ |
    | 開啟 App       | `onCreate()` → `onStart()` → `onResume()`  |
    | 切換 App       | `onPause()` → `onStop()`                   |
    | 回到 App       | `onRestart()` → `onStart()` → `onResume()` |
    | 關閉、旋轉 App | `onPause()` → `onStop()` → `onDestroy()`   |

  - When the device or emulator rotates the screen, the system calls all the
    lifecycle callbacks to shut down the activity. Then, as the activity is
    re-created, the system calls all the lifecycle callbacks to start the
    activity.
  - Composable functions have their own lifecycle that is independent of the
    Activity lifecycle. Its lifecycle is composed of the events: enters the
    Composition, recomposing 0 or more times, and then leaving the Composition.
  - To let Compose track and trigger recomposition, state must be stored in a
    `State` or `MutableState` object. `State` is read-only, while `MutableState`
    allows both reading and writing.
  - To instruct Compose to retain and reuse its value during recompositions, you
    need to declare it with the `remember` API.
  - Use the `rememberSaveable` function to save values that you need if Android
    OS destroys and recreates the activity.
  - Configuration changes
    - A configuration change occurs when the state of the device changes so
      radically that the easiest way for the system to resolve the change is to
      destroy and rebuild the activity.
    - The most common example of a configuration change is when the user rotates
      the device from portrait to landscape mode, or from landscape to portrait
      mode. A configuration change can also occur when the device language
      changes or a user plugs in a hardware keyboard.
    - When a configuration change occurs, Android invokes all the activity
      lifecycle's shutdown callbacks. Android then restarts the activity from
      scratch, running all the lifecycle startup callbacks.
    - When Android shuts down an app because of a configuration change, it
      restarts the activity with `onCreate()`.
    - To save a value that needs to survive a configuration change, declare its
      variables with `rememberSaveable`.

- ViewModel and State in Compose

  - When apps grow, you should move data and logic away from composables. Learn
    about a robust way to design your app and preserve app data during
    configuration changes by taking advantage of the Android Jetpack library,
    `ViewModel` and Android app architecture guidelines.
  - App architecture is a set of design rules for an app. A good app
    architecture can make your code robust, flexible, scalable, testable, and
    maintainable for years to come.
  - `ViewModel`, one of the architecture components from Android Jetpack
    libraries that can store your app data. The stored data is not lost if the
    framework destroys and recreates the activities during a configuration
    change or other events. However, the data is lost if the activity is
    destroyed because of process death. The `ViewModel` only caches data through
    quick activity recreations.
  - Common architectural principles
    - Separation of concerns (SoC, 關注點分離)
    - Drive UI from data models (由資料模型驅動使用者界面)
    - Single source of truth (單一真實資料來源)
    - Unidirectional Data Flow (UDF, 單向資料流動)
  - `Models` are components responsible for handling the data for an app.
    They're independent from the UI elements and app components in your app, so
    they're unaffected by the app's lifecycle and associated concerns.
  - Recommended app architecture

    <img src="../images/app_architecture.png" alt="The App Architecture" width="300"/>

    - `UI layer` displays the app data on the screen but is independent of the
      data.
    - `Domain layer` simplify and reuse the interactions between the UI and data
      layers.
    - `Data layer` stores, retrieves, and exposes the app data.

    <img src="../images/ui_layer.png" alt="The App Architecture" width="300"/>

    - `UI elements` render the data on the screen. You build these elements
      using **Jetpack Compose**.
    - `State holders` hold the data, expose it to the UI, and handle the app
      logic. An example state holder is **ViewModel**.

  - ViewModel

    - The `ViewModel` component holds and exposes the state the UI consumes. The
      UI state is application data transformed by `ViewModel`. `ViewModel` lets
      your app follow the architecture principle of driving the UI from the
      model.
    - `ViewModel` stores the app-related data that isn't destroyed when the
      activity is destroyed and recreated by the Android framework. Unlike the
      activity instance, `ViewModel` objects are not destroyed. The app
      automatically retains `ViewModel` objects during configuration changes so
      that the data they hold is immediately available after the recomposition.

    <img src="../images/pass_the_data.png" alt="Pass the data" width="250"/>

    <img src="../images/display_the_data.png" alt="Display the data" width="400"/>

    <img src="../images/verify_and_update_data.png" alt="Verify and update the data" width="400"/>

    <img src="../images/update_data.png" alt="Update the data" width="300"/>

### Navigation in Jetpack Compose

### Adapt for different screen sizes

## Resources

- [Unit 4: Navigation and app architecture](https://developer.android.com/courses/android-basics-compose/unit-4)
- [Guide to app architecture](https://developer.android.com/topic/architecture)
