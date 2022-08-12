fun main(){
    pyramid()
    println()
    pyramidReverse()
    diamond()
    halfPyramid()
    println()
    xPattern()
    test()
}

fun pyramid(){
    val rows = 5
    var k = 0

    for (i in 1..rows){
        for (space in 1..rows - i){
            print("  ")
        }
        while (k != 2 * i - 1){
            print("* ")
            ++k
        }
        println()
        k = 0
    }
}

fun test(){
    val rows = 5
    var k = 0

    for (i in 1..rows){
        for (space in 1..rows - i){
            print("  ")
        }
        while (k != 2 * i - 1){
            print("* ")
            ++k
        }
        println()
        k = 0
    }
    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i until 2 * i) {
            print("* ")
        }

        for (j in 0 until i - 1) {
            print("* ")
        }

        println()

    }
}

internal fun pyramidReverse(){
    val rows = 5

    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i until 2 * i) {
            print("* ")
        }

        for (j in 0 until i - 1) {
            print("* ")
        }

        println()

    }

}

fun diamond(){
    val height = 5
    val width = height * 2 - 1

    for (i in 0..height){
        for (a in 0..width + 1){
            if (a >= height - i && a <= height + i){
                print("*")
            } else{
                print(" ")
            }
        }
        println()
    }
    for (i in height - 1 downTo 0){
        for (a in width + 1 downTo 0){
            if (a >= height - i && a <= height + i){
                print("*")
            } else{
                print(" ")
            }
        }
        println()
    }
}

fun halfPyramid(){
    val rows = 5

    for (i in 1..rows){
        for (a in 1..i){
            print("* ")
        }
        println()
    }
}

fun xPattern(){
    val size = 3
    val count = size * 2 -1

    for (a in 1..count){
        for (j in 1..count){
            if (j == a || (j == count - a + 1)){
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
