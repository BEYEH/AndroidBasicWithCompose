<!-- omit in toc -->
# Unit - Jetpack Compose

<!-- omit in toc -->
## Table of contents

- [Steps](#steps)
- [Note](#note)
- [Resources](#resources)

## Steps

- Start a new composer project.
- Tweaking the UI.
- Reusing composables.
- Creating columns and rows.
- State in Compose.
- State hoisting.
- Creating a performant lazy list.

## Note

- Import classes related to Jetpack Compose in this project, use these from:
  - For compiler and runtime classes : `androidx.compose.*`
  - For UI toolkit and libraries : `androidx.compose.ui.*`
- If data changes, Compose re-executes these functions with the new data,
  creating an updated UI—this is called recomposition.
- `remember` is used to guard against recomposition, so the state is not reset.
- Jetpack Compose preview function:
  - Start UI Check Mode.
  - Start Interact Mode.
  - Run Preview.
- In Composable functions, state that is read or modified by multiple functions
  should live in a common ancestor—this process is called **state hoisting**. To
  hoist means to lift or elevate.
- **LazyColumn** and **LazyRow** are equivalent to **RecyclerView** in Android Views.

## Resources

- Android Developers
  - [Jetpack Compose](https://developer.android.com/courses/pathways/compose)
- GitHub
  - [codelab-android-compose](https://github.com/android/codelab-android-compose)
