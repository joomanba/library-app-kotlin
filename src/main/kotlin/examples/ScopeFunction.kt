package examples

fun main() {
    val scopeFunction = ScopeFunction()
    scopeFunction.apply()
}

class ScopeFunction {

    fun apply() {
        val crew = Person("elon", 53, "PE in CHEQUER")
        val stringDescription = crew.apply {
            name = "elon"
            age = 54
            about = "SA in CHEQUER"
        }.toString()

        println(crew.about)
    }

}

class Person(var name: String, var age: Int, var about: String) {}
