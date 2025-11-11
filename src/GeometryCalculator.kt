class GeometryCalculator {
    fun rectangleInfo(width: Int, height: Int) {
        val p = 2 * (width + height)
        val s = width * height

        println("Прямоугольник $width х $height:")
        println("Периметр: $p")
        println("Площадь: $s")

        if (p == s) {
            println("Удивительно! Периметр равен площади!")
        }
    }

    fun triangleInfo(a: Int, b: Int, c: Int) {
        println("Треугольник со сторонами: $a, $b, $c")

        val isRight = (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)

        if (isRight) {
            println("Это прямоугольный треугольник!")
        } else {
            println("Это не прямоугольный треугольник")
        }

        println("Периметр: ${a + b + c}")
    }

    fun circleInfo(radius: Int) {
        val pi = 3.14
        val length = 2 * pi * radius
        val area = pi * radius * radius

        println("Окружность с радиусом $radius:")
        println("Длина окружности: $length")
        println("Площадь круга: $area")
    }
}

fun main() {
    val calc = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    calc.rectangleInfo(4, 5)
    println()
    calc.rectangleInfo(3, 6)
    println()

    println("=== ТРЕУГОЛЬНИКИ ===")
    calc.triangleInfo(3, 4, 5)
    println()
    calc.triangleInfo(5, 5, 5)
    println()
    calc.triangleInfo(2, 3, 4)
    println()

    println("=== ОКРУЖНОСТИ ===")
    calc.circleInfo(5)
    println()
    calc.circleInfo(10)
}