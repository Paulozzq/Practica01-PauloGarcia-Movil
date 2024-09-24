package com.garcia.paulo.laboratoriocalificado01

class Ejercicio01Kotlin {
    // Aquí definimos la palabra de entrada que vamos a analizar
    val input = "hello"

    // Creamos un mapa mutable para guardar la frecuencia de cada carácter
    val frequencyMap = mutableMapOf<Char, Int>()

    // Esta función se encarga de contar la frecuencia de los caracteres
    fun countFrequency() {
        // Recorremos cada carácter en la palabra de entrada
        for (char in input) {
            // Verificamos si el carácter ya está en nuestro mapa
            if (frequencyMap.containsKey(char)) {
                // Si ya existe, solo incrementamos su contador
                frequencyMap[char] = frequencyMap[char]!! + 1
            } else {
                // Si no está, lo añadimos al mapa con un contador inicial de 1
                frequencyMap[char] = 1
            }
        }
    }

    // Esta función imprime la frecuencia de los caracteres
    fun printFrequency() {
        println("Frecuencia de caracteres:")
        // Recorremos cada entrada (par clave-valor) en el mapa de frecuencias
        for (entry in frequencyMap) {
            // entry.key nos da la clave, que en este caso es el carácter
            // entry.value nos da el valor, que es la cantidad de veces que aparece el carácter
            println("${entry.key}: ${entry.value}")
        }
    }
}

// Función principal para ejecutar el programa
fun main() {
    // Creamos una instancia de nuestra clase
    val ejercicio = Ejercicio01Kotlin()
    ejercicio.countFrequency() // Llamamos a la función para contar los caracteres
    ejercicio.printFrequency()  // Llamamos a la función para mostrar los resultados
}
