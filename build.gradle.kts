plugins {
    base
}

allprojects {
    group = "com.github.kisaragieffective"

    version = "0.1"

    repositories {
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}
