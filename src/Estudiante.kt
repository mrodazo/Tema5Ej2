class Estudiante (nombre: String, edad: Int, id: String, val curso: String, val caliPromedio: Double): Persona (nombre, edad, id) {

    override fun mostrarRol() {
        println("Soy estudiante")
    }

    fun mostrarCalificacion():String{
        return "Tiene una calificación promedio de $caliPromedio"
    }

    override fun toString(): String {
        return "Estudiante: $nombre, con una edad de $edad años, ID $id, en el curso $curso y ${mostrarCalificacion().lowercase()}"
    }

}