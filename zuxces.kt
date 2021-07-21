import java.lang.StringBuilder

fun main() {
    val Zux = User(name = "Zuxces", age = 15, occupation = "Developer", nerd = true)
    val user = StringBuilder()
    user.append("Name: ${Zux.name}\n")
    user.append("Age: ${Zux.age}\n")
    user.append("Occupation: ${Zux.occupation}\n")                                                
    user.append("Nerd: ${Zux.nerd}")
    println(user)
}
data class User(val name: String, val age: Int, val occupation: String, val nerd: Boolean)
