# Biblioteca
PARCIAL I

## Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema de gestión de biblioteca en Java aplicando los principios de Programación Orientada a Objetos (POO): abstracción, encapsulamiento y herencia.

### Estructura del Proyecto

- **Libro**: Clase base que maneja la información general de un libro (título, autor, número de ejemplares, ejemplares prestados).
- **LibroTexto**: Hereda de Libro, añade el atributo `curso` para libros de texto asociados a un curso específico.
- **LibroTextoUNIAC**: Hereda de LibroTexto, añade el atributo `facultad` para libros publicados por una facultad de la UNIAC.
- **Novela**: Hereda de Libro, añade el atributo `tipo` para clasificar novelas por género (histórica, romántica, policíaca, realista, ciencia ficción, aventuras).

### Funcionalidades

- Constructores para crear objetos con o sin parámetros.
- Métodos get y set para todos los atributos (encapsulamiento).
- Métodos `prestamo()` y `devolucion()` que gestionan los préstamos con validaciones.
- Método `toString()` redefinido en cada clase para mostrar la información completa.

### Compilación y Ejecución

```bash
# Compilar
mvn compile

# Ejecutar
java -cp target/classes biblioteca.Main
```

### Demostración

El programa `Main.java` incluye ejemplos de creación de diferentes tipos de libros y pruebas de los métodos de préstamo y devolución.
