plugins {
    id("io.github.solid-resourcepack.binder") version "1.1.1"
}

sourceSets.main {
    kotlin.srcDir("build/generated")
}

dependencies {
    implementation(rootProject.libs.solid)
}

packBinder {
    packPath.from(layout.projectDirectory.dir("pack-sample"))
    nameDepth = 1
    namespaces.add("example")
    dest.set(layout.buildDirectory.dir("generated"))
}