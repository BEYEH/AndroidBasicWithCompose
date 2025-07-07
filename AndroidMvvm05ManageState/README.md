<!-- omit in toc -->
# Android MVVM 05 - Manage State

<!-- omit in toc -->
## Table of contents

- [App Sreeenshots](#app-sreeenshots)
- [App Architecture](#app-architecture)
- [Dependencies](#dependencies)
- [My Note](#my-note)
- [Resources](#resources)
- [Appendix](#appendix)

## App Sreeenshots

## App Architecture

## Dependencies

```kts
// build.gradle.kts (:app)
dependencies {
  ...
  // Compose Runtime
  val rt_version = "1.8.3"
  implementation ("androidx.compose.runtime:runtime:$rt_version")
  implementation ("androidx.compose.runtime:runtime-livedata:$rt_version")
}
```

## My Note

- State and composition
  - Compose is declarative and as such the only way to update it is by calling
    the same composable with new arguments. These arguments are representations
    of the UI state. Any time a state is updated a recomposition takes place.
  - Key Term
    - `Composition`: a description of the UI built by Jetpack Compose when it
      executes composables.
    - `Initial composition`: creation of a Composition by running composables
      the first time.
    - `Recomposition`: re-running composables to update the Composition when
      data changes.
- State in composables

  - Composable functions can use the `remember` API to store an object in
    memory. A value computed by `remember` is stored in the Composition during
    initial composition, and the stored value is returned during recomposition.
    `remember` can be used to store both mutable and immutable objects.
  - `mutableStateOf` creates an observable `MutableState<T>`, which is an
    observable type integrated with the compose runtime.
  - Any changes to `value` schedules recomposition of any composable functions
    that read `value`.
  - Three ways to declare a `MutableState` object in a composable. These
    declarations are equivalent, and are provided as syntax sugar for different
    uses of state.

    - `val mutableState = remember { mutableStateOf(default) }`
    - `var value by remember { mutableStateOf(default) }`

      - The `by` delegate syntax requires the following imports:

        ```kt
        import androidx.compose.runtime.getValue
        import androidx.compose.runtime.setValue
        ```

    - `val (value, setValue) = remember { mutableStateOf(default) }`

  - While `remember` helps you retain state across recompositions, the state is
    not retained across configuration changes. For this, you must use
    `rememberSaveable`. `rememberSaveable` automatically saves any value that
    can be saved in a `Bundle`. For other values, you can pass in a custom saver
    object.

- Other supported types of state
  - `Flow`: `collectAsState()`
  - `LiveData`: `observeAsState()`
  - `RxJava2`: `subscribeAsState()`
  - `RxJava3`: `subscribeAsState()`
- State hoisting
  - State hoisting in Compose is a pattern of moving state to a composable's
    caller to make a composable stateless. The general pattern for state
    hoisting in Jetpack Compose is to replace the state variable with two
    parameters:
    - `value: T`
    - `onValueChange: (T) -> Unit`
  - The pattern where the state goes down, and events go up is called a
    **unidirectional data flow**. In this case, the state goes down from
    `AppScreen` to `AppContent` and events go up from `AppContent` to
    `AppScreen`. By following **unidirectional data flow**, you can decouple
    composables that display state in the UI from the parts of your app that
    store and change state.
- Restoring state in Compose
  - The `rememberSaveable` API behaves similarly to `remember` because it
    retains state across recompositions, and also across activity or process
    recreation using the saved instance state mechanism. For example, this
    happens, when the screen is rotated.
    - `rememberSaveable` will not retain state if the activity is completely
      dismissed by the user. For example, it does not retain state if the user
      swipes the current activity up from the recents screen.
  - Way to store state
    - All data types that are added to the Bundle are saved automatically. If
      you want to save something that cannot be added to the Bundle, there are
      several options. There are `Parcelize`, `MapSaver` and `ListSaver`.

## Resources

- [How to manage State in Jetpack Compose 🚀 | Android Studio | 2024](https://www.youtube.com/watch?v=ekB0w7tkG7k&list=PLgpnJydBcnPA5aNrlDxxKWSqAma7m3OIl&index=5&ab_channel=EasyTuto)
- [State and Jetpack Compose](https://developer.android.com/develop/ui/compose/state)
- [ViewModel overview](https://developer.android.com/topic/libraries/architecture/viewmodel)
- [LiveData overview](https://developer.android.com/topic/libraries/architecture/livedata)

## Appendix
