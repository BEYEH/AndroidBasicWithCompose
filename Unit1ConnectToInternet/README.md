<!-- omit in toc -->
# Unit 1 - Your first Android app

<!-- omit in toc -->
## Table of contents

- [Pathway](#pathway)

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
### Build a basoc layout

## Resources

- [Unit 1: Your first Android app](https://developer.android.com/courses/android-basics-compose/unit-1)
- [Kotlin Playground](https://play.kotlinlang.org/)

