package Task5

fun main () {
    val k = 12 ;
    if (k == 1) {
        println("$k - Плохо")
    } else if (k == 2) {
        println("$k - Неудовлетворительно")
    } else if (k == 3) {
        println("k - Удовлетворительно")
    } else if (k == 4) {
        println("$k - Хорошо")
    } else if (k == 5) {
        println("$k - Отлично")
    } else if (k < 1 || k > 5) {
        println("Ошибка")
    }
}