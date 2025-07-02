<!-- omit in toc -->
# Test - Execute .so File

<!-- omit in toc -->
## Table of contents

- [Note](#note)
- [Pathway](#pathway)
- [Resources](#resources)

## Note

- 從 Android 10 開始，不能值些執行 `.exe` 或一般的 `ELF` 執行檔，因為
  `W^X policy` 防止在 writable 的目錄中執行檔案。
  - 可行的作法：將第三方程式編譯成 `.so` (dynamically linked shared object
    libraries, 簡稱 shared objects)，在透過 JNI 從 Kotlin 呼叫。

## Pathway

- Create app project.
- Create lib in C language.
- Create `CMakeLists.txt`.
- Update `build.gradle.kts (module:app)`.
- Call the function in the lib.
- Build & run the app.

## Resources

- [Removed execute permission for app home directory](https://developer.android.com/about/versions/10/behavior-changes-10?authuser=1#execute-permission)
