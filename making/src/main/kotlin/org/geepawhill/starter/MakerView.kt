package org.geepawhill.starter

import tornadofx.*

class MakerView : View("Starter (Making)") {
    override val root = borderpane {
        minWidth = 400.0
        center = label("Hi Mom!")
    }
}