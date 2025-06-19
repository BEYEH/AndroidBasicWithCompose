<!-- omit in toc -->
# Unit 4: Navigation and app architecture

<!-- omit in toc -->
## Table of contents

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
  - With current best practices, one activity might display multiple screens by swapping them in and out as needed.
  - The activity lifecycle extends from the creation of the activity to its destruction, when the system reclaims that activity's resources. As a user navigates in and out of an activity, each activity transitions between different states in the activity lifecycle.
  - The asterisk on the onRestart() method indicates that this method is not called every time the state transitions between Created and Started. It is only called if onStop() was called and the activity is subsequently restarted.
  
    <img src="../images/activity_lifecycle.png" alt="The Activity Lifecycle" width="300"/>

| **情境** | **Lifecycle 呼叫順序**                      |
| ------- | ------------------------------------------ |
| 開啟 App | `onCreate()` → `onStart()` → `onResume()`  |
| 切換 App | `onPause()` → `onStop()`                   |
| 回到 App | `onRestart()` → `onStart()` → `onResume()` |
| 關閉 App | `onPause()` → `onStop()` → `onDestroy()`   |

### Navigation in Jetpack Compose

### Adapt for different screen sizes

## Resources

- [Unit 4: Navigation and app architecture](https://developer.android.com/courses/android-basics-compose/unit-4)