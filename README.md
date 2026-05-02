# Trivia — Quiz App with Scoring & Animations

> **Course project** — built while following [The Comprehensive Android App Development Masterclass](https://www.udemy.com/course/android-development-java-android-studio-masterclass/) by [Paulo Dichone](https://www.udemy.com/user/paulodichone/) on Udemy.
>
> This project is not original work. It was created for learning purposes only. Full credit to Paulo Dichone for the course content and instruction.

---

## About

A true/false trivia quiz app that loads questions asynchronously, tracks a running score, and persists a high score between sessions. Correct answers trigger a green fade animation on the card; wrong answers trigger a red shake animation. The question index and high score are both saved so the app resumes where the user left off.

## Concepts Covered

- `CardView` with `AlphaAnimation` (fade) and custom XML shake animation
- Asynchronous data loading using a callback interface (`AnswerListAsyncResponse`)
- MVC-style separation: `Question` model, `QuestionBank` data source, `Score` model
- `SharedPreferences` via a `Prefs` utility class to persist high score and question state
- Score tracking — adding and deducting points with a floor of zero
- `MessageFormat.format()` for dynamic string formatting
- Navigation between questions (next/previous) with wrapping
- `onPause()` lifecycle method to save state when the app is backgrounded

## Tech

- Language: Java
- Min SDK: Android 5.0+
