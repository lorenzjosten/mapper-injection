plugins {
    idea
}

allprojects {
    apply(plugin = "idea")

    group = "de.lj"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    idea {
        module {
            isDownloadSources = true
            isDownloadJavadoc = true
        }
    }
}
