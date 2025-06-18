<!-- omit in toc -->
# Unit 2 - Building app UI

<!-- omit in toc -->
## Table of contents

- [Pathway](#pathway)
  - [Kotlin fundamentals](#kotlin-fundamentals)
  - [Add a button to an app](#add-a-button-to-an-app)
  - [Interact with UI and state](#interact-with-ui-and-state)
- [Resources](#resources)

## Pathway

### Kotlin fundamentals

- Use nullability in Kotlin
  - Types
    - Nullable types: variables that can hold null.

      ```kotlin
      // Add ? operator to declare nullable variable.
      var name: type? = value
      ```

    - Non-null types: variables that cant' hold null.
  - If there's an attempt to access a member of a variable that's null, the app will crash. This type of crash is known as a runtime error.
  - Use the `?.` safe call operator to access methods or properties of nullable variables.
    
    ```kotlin
    // nullable_variable?.method/property
    var temp: String? = "aaabbbccc"
    println(temp?.length)
    ```

  - Use the `!!` not-null assertion operation to access methods or properties of nullable variables.
  
    ```kotlin
    // nullable_varialbe!!.method/property
    var temp: String? = "cccbbbaaa"
    println(temp!!.length)
    ```

  - Unlike `?.` safe-call operators, the use of a `!!` not-null assertion operator may result in a `NullPointerException` error being thrown if the nullable variable is indeed `null`. Thus, it should be done only when the variable is always non-nullable or proper exception handling is set in place. When not handled, exceptions cause runtime errors. 
  - Conclusion
    - To access methods or properties of nullable variables, you need to use `?.` safe-call operators or `!!` not-null assertion operators.

### Add a button to an app

### Interact with UI and state

## Resources

- [Unit 2: Building app UI](https://developer.android.com/courses/android-basics-compose/unit-2)
- [Kotlin Playground](https://play.kotlinlang.org/)
