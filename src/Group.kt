class Group (val groupName: String) {
    val students = mutableListOf<Student>()
    init {
        println("Создана группа")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }

    fun listStudents() {
        println("Студенты группы $groupName:")
        for (student in students) {
            student.introduce()
        }
    }

    fun celebrateBirthdays() {
        println("В группе $groupName празднуют дни рождения!")
        for (student in students) {
            student.haveBirthday()
        }
        println()
    }
}

fun main() {
    val student1 = Student("Иван", 19)
    val student2 = Student("Денис", 20)

    val group = Group("ИСП-231")

    group.addStudent(student1)
    group.addStudent(student2)

    group.listStudents()

    group.celebrateBirthdays()

    group.listStudents()
}
