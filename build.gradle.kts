plugins {
    id("org.jetbrains.intellij") version "0.4.15"
    java
}

group = "de.espend.idea.localization"
version = "0.0.6"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8

}

intellij {
    updateSinceUntilBuild = false
}


tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    // changeNotes("""Add change notes here.<br><em>most HTML tags may be used</em>""")

    sinceBuild("202.0")
}