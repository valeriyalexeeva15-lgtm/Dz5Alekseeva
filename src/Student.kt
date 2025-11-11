class Student (val name: String, var age: Int) {
    init {
        println("Создан студент")
    }

    fun introduce() {
        println("Меня зовут $name, мне $age лет")
    }

    fun haveBirthday() {
        age += 1
        println("$name празднует день рождения! Теперь ему $age лет")
    }
}

fun main() {
    val student = Student("Денис", 18)
    student.introduce()
    student.haveBirthday()
}
