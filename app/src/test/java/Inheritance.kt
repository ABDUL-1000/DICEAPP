class Inheritance {fun main (){
    val benz = Benz(300000)
    val honda=Honda(300000)
    with(benz){
        println("\nBenz\n-----------")
        println("color:${color}")
        println("availableCash:${availableCash}")
        println("numberOfseats:${numberOfseats}")
        println("can Afford? ${canAfford()}")
    }
    with(honda){
        println("\nHonda\n-----------")
        println("color:${color}")
        println("availableCash:${availableCash}")
        println("numberOfseats:${numberOfseats}")
        println("can Afford? ${canAfford()}")
    }
}
    abstract class Car(private var carCost : Int){
        abstract val color : String
        abstract val availableCash : Int
        abstract val numberOfseats: Int
        fun canAfford() : Boolean {
            return availableCash<carCost
        }
    }
    class Benz(carCost:Int):Car(carCost){
        override val color= "Red"
        override val numberOfseats=5
        override val availableCash= 200000
    }
    class Honda(carCost:Int):Car(carCost){
        override val color= "Black"
        override val numberOfseats=4
        override val availableCash= 500000
    }
}