
import jdk.internal.joptsimple.internal.Strings

fun main() {
    val pets = mutableListOf<Strings>()

    pets.add( "Dog")
    pets.add("Gecko")
    pets.add("Turtle")

    while (true) {
        // show the current pets
        show(pets)

        // get user action
        val action = menu()

        // Act upon it
        when  (action) {
            'Q' -> break
            'A' -> getNewPet(pets)
//            'D' -> deletePet()
        }

    }
}

/**
 * get a pet name from the user
 * and add to the given list of pets
 */
fun getNewPet(pets: MutableList<String>) {
    val newPet = getString("New pet: ")
    pets.add(newpet)
}




/**
 * show a menu and get the users choice
 * Return this as a char
 */
fun menu(): Char {
   println("[A]dd a new pet")
   println("[D]elete a pet")
   println("[Q]uit")

   while (true) {
       println("choice")
       val input = readln()
       // typed nothing? try again?
       if (input.isBlank()) continue
       // Grab the first letter
       val choice = input.lowercase().first()
       // Check it is a valid option
       if (validChoices.contains(choice)) return choice
   }
}







fun show(list: List<Any>) {
    for ((i, item) in list.withIndex()){
        println("${i+1}: $item")
}



