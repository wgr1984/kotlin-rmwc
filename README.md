# kotlin-rmwc

### Project Summary

FORKED: https://github.com/rivasdiaz/kotlin-rmwc

CHANGED: NPM support, kotlin-react version updated

This project is a Kotlin Wrapper for [React Material Web Components](https://github.com/jamesmfriedman/rmwc),
which is a React wrapper for [Google Material Components for the Web](https://material.io/components/web/)

## Use (npm)

To use this project, you need to use [JetBrains official wrapper for React](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-react)

To install run on root of you [Kotlin react project (reate-react-kotlin-app)](https://github.com/JetBrains/create-react-kotlin-app)
```
npm install -s kotlin-rmwc rmwc
```

Afterwards ensure css is set correctly e.g. inside ```index.kt```
```kotlin
fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    //======================-Material-CSS-=================================
    require("material-components-web/dist/material-components-web.min.css")
    //=====================================================================

    render(document.getElementById("root")) {
        app()
    }
}
```

Now it can be used simply via DSL inside render function:
```kotlin
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        ...
        button (unelevated = true) {
            +"Click me!"
        }
        ...
    }
}
```

### Use (gradle)

To use this project, you need to use [JetBrains official wrapper for React](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-react)

This project is accessible via jitpack repository.

Step 1: Define the JitPack repository in your project

```groovy
repositories {
    maven { url 'https://jitpack.io' }
    // other repositories
}
```

Step 2: Include this project as a dependency

```groovy
dependencies {
    compile "com.github.rivasdiaz:kotlin-rmwc:$kotlin_rmwc_version"
    // other dependencies
}
```

where `kotlin_rmwc_version` can be set to:

* [master-SNAPSHOT](https://jitpack.io/#rivasdiaz/kotlin-rmwc/master-SNAPSHOT) to use the latest version in master
* any release version to use that specific version
* any commit checksum to use the version in that specific commit

Check the [Project in JitPack](https://jitpack.io/#rivasdiaz/kotlin-rmwc/) to see all possible versions.

### Documentation

This project tries to follows the same specification as RMWC.
All accessible properties are the same as the ones exposed in RMWC.
Please check the documentation for RMWC [here](https://jamesmfriedman.github.io/rmwc/).

