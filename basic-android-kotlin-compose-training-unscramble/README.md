# Unscramble app

Single player game app that displays scrambled words. To play the game, player
has to make a word using all the letters in the displayed scrambled word. This
code demonstrates the Android Architecture component- ViewModel and StateFlow.

## Pre-requisites

- Experience with Kotlin syntax.
- How to create and run a project in Android Studio.
- How to create composable functions

## Getting Started

1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.

## 2025/06/20 My Note

- `WordsData.kt` contains a list of the words used in the game, constants for
  the maximum number of words per game, and the number of points the player
  scores for every correct word.
- `MainActivity.kt` contains mostly template generated code. You display the
  `GameScreen` composable in the `setContent{}` block.
- `GameScreen.kt` defined all the UI composables. It containsthe `GameStatus`
  and `GameLayout`.
- `GameStatus` is a composable function that displays the game score at the
  bottom of the screen. The composable function contains a text composable in a
  Card. For now, the score is hardcoded to 0.
- `GameLayout` is a composable function that displays the main game
  functionality, which includes the scrambled word, the game instructions, and a
  text field that accepts the user's guesses.
-
