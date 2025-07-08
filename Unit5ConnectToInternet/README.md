<!-- omit in toc -->

# Unit 5 - Connect to the internet

<!-- omit in toc -->

## Table of contents

- [Unit 5 - Connect to the internet](#unit-5---connect-to-the-internet)
  - [Table of contents](#table-of-contents)
  - [App Screenshots](#app-screenshots)
  - [App Architecture](#app-architecture)
  - [Dependencies](#dependencies)
  - [Pathway](#pathway)
  - [My Note](#my-note)
  - [Resources](#resources)
  - [Appendix](#appendix)

## App Screenshots

## App Architecture

## Dependencies

## Pathway

- Get data from the internet
  - `Concurrency` involves performing multiple tasks in your app at the same
    time.
    - To do work concurrently in your app, you will be using Kotlin
      `coroutines`. Coroutines make it easier to write `asynchronous` code.
    - Suspend function 'delay' should be called only from a coroutine or another
      suspend function.
    - `runBlocking()` is synchronous. It runs an event loop, which can handle
      multiple tasks at once by continuing each task where it left off when it's
      ready to be resumed.
    - Android has privided an event loop for app to process resumed work. You do
      not need to call `runBlocking()`. Only use `runBlocking()` within a
      `main()` function.
- Load and display images from the internet

## My Note

- Concept
  - Concurrency (併發)
    - Structured concurrency
  - Asynchronous (非同步)
  - Parallel decomposition (並行分解)
- Techniques
  - Kotlin coroutines
    - Synchronous code
      - delay
      - runBlocking + delay
      - runBlocking + suspend + delay
    - Asynchronous code
      - runBlocking + launch + suspend
      - runBlocking + Deferred + async + suspend
      - runBlocking + coroutineScope + suspend + async

## Resources

- [Unit 5: Connect to the internet](https://developer.android.com/courses/android-basics-compose/unit-5)

## Appendix
