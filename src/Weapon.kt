class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo() {
        println("Название: $name")
        println("Урон: $damage")
        println("Прочность: $durability")
        println("Тип: $type")
    }

    fun use() {
        durability -= 10
        if (durability <= 0) {
            println("Оружие сломано!")
        }
    }

    fun upgrade(bonus: Int) {
        damage += bonus
    }
}

fun main() {
    val weapon = Weapon()
    weapon.showInfo()
}
