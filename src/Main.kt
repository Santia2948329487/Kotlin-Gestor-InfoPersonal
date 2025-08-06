fun main() {
    println("=== REGISTRO DE USUARIO 1 ===")
    println("Nombre completo:")
    val nombre1 = readLine() ?: ""
    println("Edad:")
    val edad1 = (readLine() ?: "0").toInt()
    println("Altura en metros:")
    val altura1 = (readLine() ?: "0").toDouble()
    println("Peso en kg:")
    val peso1 = (readLine() ?: "0").toDouble()
    println("Email:")
    val email1 = readLine() ?: ""
    println("Ciudad:")
    val ciudad1 = readLine() ?: ""
    val usuario1 = User(nombre1, edad1, altura1, peso1, email1, ciudad1)

    println("=== REGISTRO DE USUARIO 2 ===")
    println("Nombre completo:")
    val nombre2 = readLine() ?: ""
    println("Edad:")
    val edad2 = (readLine() ?: "0").toInt()
    println("Altura en metros:")
    val altura2 = (readLine() ?: "0").toDouble()
    println("Peso en kg:")
    val peso2 = (readLine() ?: "0").toDouble()
    println("Email:")
    val email2 = readLine() ?: ""
    println("Ciudad:")
    val ciudad2 = readLine() ?: ""
    val usuario2 = User(nombre2, edad2, altura2, peso2, email2, ciudad2)

    println("=== REGISTRO DE USUARIO 3 ===")
    println("Nombre completo:")
    val nombre3 = readLine() ?: ""
    println("Edad:")
    val edad3 = (readLine() ?: "0").toInt()
    println("Altura en metros:")
    val altura3 = (readLine() ?: "0").toDouble()
    println("Peso en kg:")
    val peso3 = (readLine() ?: "0").toDouble()
    println("Email:")
    val email3 = readLine() ?: ""
    println("Ciudad:")
    val ciudad3 = readLine() ?: ""
    val usuario3 = User(nombre3, edad3, altura3, peso3, email3, ciudad3)

    // Mostrar resumen de cada usuario
    println("\n=== RESÚMENES ===")

    println("USUARIO 1")
    println("Nombre: ${usuario1.nombre}")
    println("MAY: ${usuario1.nombreMayus}")
    println("min: ${usuario1.nombreMinus}")
    println("Edad: ${usuario1.edad} - ${if (usuario1.esMayorDeEdad) "Mayor de edad" else "Menor de edad"}")
    println("Altura: ${usuario1.altura} m")
    println("Peso: ${usuario1.peso} kg")
    println("IMC: ${usuario1.imc}")
    println("Email: ${usuario1.email}")
    println("Email válido: ${usuario1.emailValido}")
    println("Dominio: ${usuario1.dominio}")
    println("Ciudad: ${usuario1.ciudad}")
    println("--------------------------------")

    println("USUARIO 2")
    println("Nombre: ${usuario2.nombre}")
    println("MAY: ${usuario2.nombreMayus}")
    println("min: ${usuario2.nombreMinus}")
    println("Edad: ${usuario2.edad} - ${if (usuario2.esMayorDeEdad) "Mayor de edad" else "Menor de edad"}")
    println("Altura: ${usuario2.altura} m")
    println("Peso: ${usuario2.peso} kg")
    println("IMC: ${usuario2.imc}")
    println("Email: ${usuario2.email}")
    println("Email válido: ${usuario2.emailValido}")
    println("Dominio: ${usuario2.dominio}")
    println("Ciudad: ${usuario2.ciudad}")
    println("--------------------------------")

    println("USUARIO 3")
    println("Nombre: ${usuario3.nombre}")
    println("MAY: ${usuario3.nombreMayus}")
    println("min: ${usuario3.nombreMinus}")
    println("Edad: ${usuario3.edad} - ${if (usuario3.esMayorDeEdad) "Mayor de edad" else "Menor de edad"}")
    println("Altura: ${usuario3.altura} m")
    println("Peso: ${usuario3.peso} kg")
    println("IMC: ${usuario3.imc}")
    println("Email: ${usuario3.email}")
    println("Email válido: ${usuario3.emailValido}")
    println("Dominio: ${usuario3.dominio}")
    println("Ciudad: ${usuario3.ciudad}")
    println("--------------------------------")
}
