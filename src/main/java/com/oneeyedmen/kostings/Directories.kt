package com.oneeyedmen.kostings

import java.io.File


object Directories {
    val resultsDir = File("results").apply { mkdirs() }
    val canonicalResultsDir = File("canonical-results")
    val imagesDir = resultsDir
}