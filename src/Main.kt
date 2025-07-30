import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val usuarios = mutableListOf<User>()

    println("=== REGISTRO DE USUARIOS ===")

    repeat(3) { i ->
        println("\n→ Usuario ${i + 1}")
        val usuario = pedirUsuario(scanner)
        usuarios.add(usuario)
    }

    println("\n=== INFORMACIÓN DE LOS USUARIOS REGISTRADOS ===")
    usuarios.forEach {
        println(it.getResumen())
        println("------------------------------------------------")
    }
}

fun pedirUsuario(scanner: Scanner): User {
    print("Nombre completo: ")
    val nombre = scanner.nextLine()

    val edad = leerEntero(scanner, "Edad (positiva): ") { it > 0 }

    val altura = leerDecimal(scanner, "Altura en metros (> 0): ") { it > 0 }

    val peso = leerDecimal(scanner, "Peso en kg (> 0): ") { it > 0 }

    val email = leerEmail(scanner)

    print("Ciudad de residencia: ")
    val ciudad = scanner.nextLine()

    return User(nombre, edad, altura, peso, email, ciudad)
}

fun leerEntero(scanner: Scanner, mensaje: String, validacion: (Int) -> Boolean): Int {
    while (true) {
        print(mensaje)
        val entrada = scanner.nextLine()
        val numero = entrada.toIntOrNull()
        if (numero != null && validacion(numero)) return numero
        println("❌ Entrada no válida. Intenta de nuevo.")
    }
}

fun leerDecimal(scanner: Scanner, mensaje: String, validacion: (Double) -> Boolean): Double {
    while (true) {
        print(mensaje)
        val entrada = scanner.nextLine()
        val numero = entrada.toDoubleOrNull()
        if (numero != null && validacion(numero)) return numero
        println("❌ Entrada no válida. Intenta de nuevo.")
    }
}

fun leerEmail(scanner: Scanner): String {
    while (true) {
        print("Email: ")
        val email = scanner.nextLine()
        if (email.contains("@") && email.contains(".")) return email
        println("❌ Email inválido. Debe contener '@' y '.'")
    }
}
