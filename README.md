<!-- omit in toc -->
# AndroidBasicWithCompose

<!-- omit in toc -->
## Table of contents

- [Courses](#courses)
  - [For beginners](#for-beginners)
  - [For experienced Android developers](#for-experienced-android-developers)
- [My Practice](#my-practice)
- [My Note](#my-note)
- [Resources](#resources)

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

## My Practice

- Android MVVM 01 - Get Local Data
- Android MVVM 02 - Counter

## My Note

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

- MVVM
  - Resources of Model
    - Local
    - Remote (Retrofit, firebase or any other api)
  - UI layer pipeline
    - App data -> UI data -> UI elements -> UI events -> UI changes > repeat
  - Manage state

    | Method                   | Storage Location                           | Retention Duration                         | Survives Configuration Changes | Persistent Storage  |
    | ------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------ | ------------------- |
    | `remember`               | Memory (short-term)                        | Only while the Composable is active        | ✘                              | ✘                   |
    | `rememberSaveable`       | Memory + Bundle (e.g., SavedInstanceState) | Automatically saved/restored by the system | ✔                             | ✘                   |
    | `ViewModel` + `LiveData` | Memory (longer-lived)                      | As long as the Activity/Fragment is alive  | ✔                             | ✘ (manual required) |

## Resources

- [Android Developers Training courses](https://developer.android.com/courses)
- [Download Node.js®](https://nodejs.org/en/download)
