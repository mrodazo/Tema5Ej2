open class Persona (val nombre: String, val edad: Int, val id: String){

    open fun mostrarRol() {
        println("Soy una persona")
    }

    override fun toString(): String {
        return "Persona: $nombre, con una edad de $edad años e ID $id"
    }
}