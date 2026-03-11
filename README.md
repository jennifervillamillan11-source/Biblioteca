# Biblioteca
PARCIAL I

## Sistema de Gestión de Biblioteca

Este proyecto implementa un sistema de gestión de biblioteca en Java aplicando los principios de Programación Orientada a Objetos (POO): abstracción, encapsulamiento y herencia.

## Diagrama de Clases

```mermaid
classDiagram
    class Libro {
        -titulo: String
        -autor: String
        -numeroEjemplares: int
        -numeroEjemplaresPrestados: int
        +Libro()
        +Libro(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int)
        +getTitulo(): String
        +setTitulo(titulo: String): void
        +getAutor(): String
        +setAutor(autor: String): void
        +getNumeroEjemplares(): int
        +setNumeroEjemplares(numeroEjemplares: int): void
        +getNumeroEjemplaresPrestados(): int
        +setNumeroEjemplaresPrestados(numeroEjemplaresPrestados: int): void
        +prestamo(): boolean
        +devolucion(): boolean
        +toString(): String
    }

    class LibroTexto {
        -curso: String
        +LibroTexto()
        +LibroTexto(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String)
        +getCurso(): String
        +setCurso(curso: String): void
        +toString(): String
    }

    class LibroTextoUNIAC {
        -facultad: String
        +LibroTextoUNIAC()
        +LibroTextoUNIAC(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String, facultad: String)
        +getFacultad(): String
        +setFacultad(facultad: String): void
        +toString(): String
    }

    class Novela {
        -tipo: TipoNovela
        +Novela()
        +Novela(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, tipo: TipoNovela)
        +getTipo(): TipoNovela
        +setTipo(tipo: TipoNovela): void
        +toString(): String
    }

    class TipoNovela {
        <<enumeration>>
        HISTORICA
        ROMANTICA
        POLICIACA
        REALISTA
        CIENCA_FICCION
        AVENTURAS
    }

    class Main {
        +main(args: String[]): void
    }

    Libro <|-- LibroTexto : hereda
    LibroTexto <|-- LibroTextoUNIAC : hereda
    Libro <|-- Novela : hereda
    Novela --> TipoNovela : usa
```

## Guia de uso

Este proyecto se ejecuta por consola y muestra un ejemplo de uso de las clases
del sistema de biblioteca. No tiene menu interactivo; los datos de ejemplo se
configuran en `Main.java`.

### Requisitos

- Java 11 (JDK)
- Maven

### Ejecutar con Maven

```bash
mvn -q compile exec:java
```

Si quieres ver el comando completo sin `-q`, usa:

```bash
mvn compile exec:java
```

### Que hace el programa

Al ejecutar, se imprimen en consola:

- Un libro general, con prestamo y devolucion.
- Un libro de texto.
- Un libro de texto UNIAC.
- Una novela con su tipo.
- Un ciclo que intenta prestar hasta agotar ejemplares.

### Cambiar los datos de ejemplo

Edita las instancias dentro de `Main.java` y vuelve a ejecutar con Maven.
