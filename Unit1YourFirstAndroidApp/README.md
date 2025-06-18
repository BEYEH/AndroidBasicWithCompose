<!-- omit in toc -->
# Unit 1 - Your first Android app

<!-- omit in toc -->
## Table of contents

- [Pathway](#pathway)
  - [Introduction to Kotlin](#introduction-to-kotlin)
  - [Set up Android Studio](#set-up-android-studio)
  - [Build a basic layout](#build-a-basic-layout)
- [Resources](#resources)

## Pathway

### Introduction to Kotlin

- Style guide (includes recommendations on use of whitespace, indentation, naming, and more.)
- Finctiion shiuld Indent by 4 scpaces.
- The name of a function should follow camel case convention and start with a lowercase letter.
- Use the `val` keyword to define a variable that is read-only where the value cannot change once it's been assigned.
- Use the `var` keyword to define a variable that is mutable or changeable.
- Syntax for declaring a function with return type:

  ``` kotlin
  // Funtion syntax with return type
  fun funcName(fstParam: fstParamType, secParam: secParamType, ...): funcReturnType {
      funcBody
      return statement
  }
  ```

- By default, if you don't specify a return type, the default return type is `Unit`. `Unit` means the function doesn't return a value. `Unit` is equivalent to void return types in other languages (void in Java and C; Void/empty tuple () in Swift; None in Python, etc.).
- The function name with its inputs (parameters) are collectively known as the function signature. The function signature consists of everything before the return type and is shown in the following code snippet.

  ``` kotlin
  // Function signature
  fun funcName(fstParam: fstParamType, secParam: secParamType, ...)
  ```

### Set up Android Studio

### Build a basic layout

- What is Jetpack Compose ?
  - Jetpack Compose is a modern toolkit for building Android UIs. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin capabilities. With Compose, you can build your UI by defining a set of functions, called composable functions, that take in data and describe UI elements.
- Composable functions are the basic building block of a UI in Compose. A composable function:
  - Describes some part of your UI.
  - Doesn't return anything.
  - Takes some input and generates what's shown on the screen.
  - Function name MUST be a `noun` and using Pascal case.
- Annotations
  - Annotations are means of attaching extra information to code.
  - An annotation is applied by prefixing its name (the annotation) with the @ character at the beginning of the declaration you are annotating.

    ``` kotlin
    // Annotations & Function declaration
    @Composable
    fun funcName(...){...}
    ```

  - Annotations can take parameters. Parameters provide extra information to the tools processing them.

    ``` kotlin
    @Preview(
        showBackground = true,
        showSystemUi = true,
        name = "My Preview"
    )
    ```

  - All composable functions must have `@Composable` function. This annotation informs the Compose compiler that this function is intended to convert data into UI.
- Android apps two different units of measurement:
  - density-independent pixels (DP): a unit of measure for the layout.
  - scalable pixels (SP): a unit of measure for the font size.
- Every composable function should accept an optional `Modifier` parameter. `Modifiers` tell a UI element how to lay out, display, or behave within its parent layout.
- Accessing resources
  - An `R` class is an automatically generated class by Android that contains the IDs of all resources in the project.

    ``` kotlin
    /*
      R: Auto generated R class
      drawable: Subdirectory in 'res' folder
      graphic: Resource ID (mostly same as filename)
    */
    R.drawable.graphic
    ```

## Resources

- [Unit 1: Your first Android app](https://developer.android.com/courses/android-basics-compose/unit-1)
- [Kotlin Playground](https://play.kotlinlang.org/)
