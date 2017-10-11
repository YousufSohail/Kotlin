package com.yousufsohail.demos.kotlin.clean


fun createSegment(obj: Any) {
    if (obj is View) {
        obj.initialise()
    }
}

fun main(args: Array<String>) {


}