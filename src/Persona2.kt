open class Persona2 (var nombre: String, var edad: Int) {
    protected val id = ++idCont /**Protected = se puede usar en la clase y las herencias, pero fuera de eso no, a diferencia del Private que sólo se puede en la clase, en las herencias no*/

    companion object {
        var idCont = 0
    }

    override fun toString(): String {
        return "Nombre: $nombre, edad: $edad, ID: $id"
    }

    open fun mostrarRol() {
        println("Soy una persona")
    }
}