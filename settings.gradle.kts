rootProject.name = "codility-lessons"

include(":commons")
project(":commons").projectDir = file("commons")

file("lessons").listFiles()?.forEach { d1 ->
    if (d1.isDirectory) {
        d1.listFiles()?.forEach { d2 ->
            if (d2.isDirectory) {
                val path = ":lessons:${d1.name}:${d2.name}"
                include(path)
                project(path).projectDir = d2
            }
        }
    }
}
