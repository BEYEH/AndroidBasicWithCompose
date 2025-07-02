<!-- omit in toc -->
# Test - Execute .so File

<!-- omit in toc -->
## Table of contents

- [Abbreviation](#abbreviation)
- [Note](#note)
- [Pathway](#pathway)
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
- Create the C program as a function, instead of a main program.
- Use the Android NDK to compile program into a `.so` file.
- Call the function from Kotlin using JNI.
- Build, run the app. Print the string in the app.

## Resources

- [Removed execute permission for app home directory](https://developer.android.com/about/versions/10/behavior-changes-10?authuser=1#execute-permission)
