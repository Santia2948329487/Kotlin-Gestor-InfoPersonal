class User(
    val nombre: String,
    val edad: Int,
    val altura: Double,
    val peso: Double,
    val email: String,
    val ciudad: String
) {
    val imc = peso / (altura * altura)
    val esMayorDeEdad = edad >= 18
    val nombreMayus = nombre.uppercase()
    val nombreMinus = nombre.lowercase()
    val dominio = if (email.contains("@")) email.substringAfter("@") else "desconocido"
    val emailValido = email.contains("@") && email.contains(".")
}
