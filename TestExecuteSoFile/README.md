<!-- omit in toc -->
# Test - Execute .so File

<!-- omit in toc -->
## Table of contents

- [Abbreviation](#abbreviation)
- [Note](#note)
- [Pathway](#pathway)
- [Project structure](#project-structure)
- [Resources](#resources)

## Abbreviation

- `.so`: Dynamically linked shared object libraries, 簡稱 shared objects
- `ELF`: Executable and Linkable Format
- `JNI`: Java Native Interface

## Note

- 從 Android 10 開始，不能值些執行 `.exe` 或一般的 `ELF` 執行檔，因為
  `W^X policy` 防止在 writable 的目錄中執行檔案。
  - 可行的作法：將第三方程式編譯成 `.so`，再透過 JNI 從 Kotlin 呼叫。

## Pathway

- Create app project.
- Create folder.
- Create the C program as a function, instead of a main program.
- Create JNI interface to connect Kotlin and C language.
- Create `CMakeLists.txt`.
- Update and sync the `build.gradle.kts (:app)`.
- Build, run the app. Get message in the text component.

## Project structure

``` bash
app/
├── build
│   └── intermediates
│       └── cxx
│           └── Debug
│               └── 4uz5g4q4
│                   └── obj
│                       └── arm64-v8a
│                           └── libget-lib.so  # Generated file
└── src
    ├── main
    │   ├── AndroidManifest.xml
    │   ├── cpp
    │   │   ├── CMakeLists.txt  # CMake 編譯腳本，告訴系統如何編譯 .c 檔為 .so 檔
    │   │   ├── get_msg.c       # 純 C 的邏輯實作檔案，處理實際邏輯（如：回傳字串）
    │   │   ├── get_msg.h       # 對應的 C header 檔，宣告 get_msg.c 中的函式，供其他檔案引用
    │   │   └── hello_jni.c     # JNI 實作檔案，負責接收 Java/Kotlin 呼叫，轉發給 C 函式
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── testexecutesofile
    │   │               ├── MainActivity.kt
    │   │               ├── ui
    │   │               │   └── theme
    │   │               │       ├── Color.kt
    │   │               │       ├── Theme.kt
    │   │               │       └── Type.kt
    │   │               └── view
    │   │                   └── App.kt

430 directories, 627 files
```

## Resources

- [Removed execute permission for app home directory](https://developer.android.com/about/versions/10/behavior-changes-10?authuser=1#execute-permission)
