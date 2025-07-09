<!-- omit in toc -->
# Android MVVM 06 - Weather App with Retrofit

<!-- omit in toc -->
## Table of contents

- [App Screenshots](#app-screenshots)
- [App Architecture](#app-architecture)
- [Tools](#tools)
- [My Note](#my-note)
- [Resources](#resources)

## App Screenshots

## App Architecture

## Tools

- Dependencies

  ```kts
  dependencies {
    ...
    // Compose Runtime
    val rt_version = "1.8.3"
    implementation ("androidx.compose.runtime:runtime:$rt_version")
    implementation ("androidx.compose.runtime:runtime-livedata:$rt_version")
    implementation ("androidx.compose.runtime:runtime-rxjava2:$rt_version")

    // Retrofit
    val rf_version = "3.0.0"
    implementation("com.squareup.retrofit2:retrofit:$rf_version")
    // Retrofit with Gson Converter
    implementation("com.squareup.retrofit2:converter-gson:$rf_version")
  }
  
  ```

- Plugins
  - JSON To Kotlin Class (JsonToKotlinClass)

- Permission

  ``` xml
  <manifest ...>
    <uses-permission android:name="android.permission.INTERNET"/>
    <application ... >
      ...
    </application>
  </manifest>
  ```

## My Note

- Use plugin `JsonToKotlinClass` to convert JSON to kotlin class.
  - Paste the `response body` from WeatherApi.com into
    `Kotlin data class File from JSON`, then it will generate class
    automatically.

## Resources

- YouTube
  - [Weather app with Retrofit 🔥 | Android Studio | Jetpack Compose 2024](https://youtu.be/Kn6vUH1uJT4?si=zUANLk3E7BbhnyKD)
- GitHub
  - [Square / Retrofit](https://github.com/square/retrofit)
  - [Google / Gson](https://github.com/google/gson)
- Retrofit
  - [Configuration - Converters](https://square.github.io/retrofit/configuration/#converters)
