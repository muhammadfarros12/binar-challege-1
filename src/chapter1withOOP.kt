fun main(){

    val pyramid = Pyramid()
    val pyramidReverse = PyramidReverse()
    val diamond = Diamond()
    val halfPyramid = HalfPyramid()
    val xPattern = XPattern()
    pyramid.pattern()
    pyramidReverse.pattern()
    diamond.pattern()
    halfPyramid.pattern()
    xPattern.pattern()

}

abstract class Pattern{
    val rows = 5
    var k = 0
    abstract fun pattern()
}

open class Pyramid: Pattern() {
    override fun pattern() {
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
        println()
    }

}

open class PyramidReverse: Pattern(){
    override fun pattern() {

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
}

open class Diamond: Pattern(){

    private val width = rows * 2 - 1

    override fun pattern() {
        for (i in 0..rows){
            for (a in 0..width + 1){
                if (a >= rows - i && a <= rows + i){
                    print("*")
                } else{
                    print(" ")
                }
            }
            println()
        }
        for (i in rows - 1 downTo 0){
            for (a in width + 1 downTo 0){
                if (a >= rows - i && a <= rows + i){
                    print("*")
                } else{
                    print(" ")
                }
            }
            println()
        }
        println()
    }
}

open class HalfPyramid: Pattern(){
    override fun pattern() {

        for (i in 1..rows){
            for (a in 1..i){
                print("* ")
            }
            println()
        }
        println()
    }
}


class XPattern: Pattern(){
    override fun pattern() {
        val count = rows * 2 -1

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
}



