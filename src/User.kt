data class User(
    val nombreCompleto: String,
    val edad: Int,
    val altura: Double,
    val peso: Double,
    val email: String,
    val ciudad: String
) {
    fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }

    fun getResumen(): String {
        val nombreMayus = nombreCompleto.uppercase()
        val nombreMinus = nombreCompleto.lowercase()
        val dominioEmail = email.substringAfter("@")

        return """
            --- RESUMEN DEL USUARIO ---
            Nombre completo: $nombreCompleto
            En mayúsculas: $nombreMayus
            En minúsculas: $nombreMinus
            Edad: $edad (${if (esMayorDeEdad()) "Mayor de edad" else "Menor de edad"})
            Altura: $altura m
            Peso: $peso kg
            IMC: ${"%.2f".format(calcularIMC())}
            Email: $email
            Dominio del email: $dominioEmail
            Ciudad: $ciudad
        """.trimIndent()
    }
}
