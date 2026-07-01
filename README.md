# tipcalc-multimodule

Three-module Kotlin Gradle version of Google's tip calculator codelab, split for Buck2 benchmark use.

Derived from [google-developer-training/android-basics-kotlin-tip-calculator-app-solution](https://github.com/google-developer-training/android-basics-kotlin-tip-calculator-app-solution) at commit `0f54d0edf7dbe66a2c45a0608f0a7a2b693026b3`, Apache 2.0 licensed.

## Modules

- **core** — pure JVM Kotlin, no Android imports. Tip calculation math and currency formatting.
- **ui** — Android library, reusable compound view `TipResultView` displaying formatted tip. Owns its layout and strings, viewBinding enabled.
- **app** — Android application, MainActivity wires core calculation into ui widget. applicationId `com.example.tiptime`.

## Build

```sh
./gradlew :app:assembleDebug
```

Output: `app/build/outputs/apk/debug/app-debug.apk`

## Versions

Kotlin 2.0.21, AGP 8.6.1, Gradle 8.9, JDK 17, compileSdk 34, minSdk 24, targetSdk 34.

## License

Apache License 2.0 — see LICENSE file. Original tip-calc attribution preserved.
