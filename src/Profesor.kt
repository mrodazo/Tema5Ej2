

class Profesor (nombre: String, edad: Int, id: String, val departamento: String, val aniosExp: Int): Persona
    (nombre,edad, id) {

    override fun mostrarRol() {
        println("Soy profesor")
    }

    fun mostrarExperiencia() {
        println("Tiene una una experiencia de $aniosExp años")
    }

    override fun toString(): String {
        return "Estudiante: $nombre, con una edad de $edad años, ID $id, en el departamento $departamento y  ${mostrarExperiencia()}"
    }

}