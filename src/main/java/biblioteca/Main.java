package biblioteca;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        // se crean instancias para el funcionamiento del programa 

        // Libro general
        Libro libroG = new Libro("ventajas de ser invisible", "Stephen Chbosky", 10, 2);
        System.out.println("Libro general:");
        System.out.println(libroG);
        System.out.println("Préstamo exitoso: " + libroG.prestamo());
        System.out.println("Después del préstamo: " + libroG);
        System.out.println("Devolución exitosa: " + libroG.devolucion());
        System.out.println("Después de la devolución: " + libroG);
        System.out.println();

        // Libro de texto
        LibroTexto libroTexto = new LibroTexto("Sociales", "pepito perez", 5, 1, "Matemáticas III");
        System.out.println("Libro de texto:");
        System.out.println(libroTexto);
        System.out.println();

        // Libro de texto UNIAC
        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC("Física Cuántica", "Autor Físico", 3, 0, "Física II", "Facultad de Ciencias");
        System.out.println("Libro de texto UNIAC:");
        System.out.println(libroUNIAC);
        System.out.println();

        // Novela
        Novela novela = new Novela("1984", "George Orwell", 8, 3, TipoNovela.CIENCA_FICCION);
        System.out.println("Novela:");
        System.out.println(novela);
        System.out.println("Préstamo exitoso: " + novela.prestamo());
        System.out.println("Después del préstamo: " + novela);
        System.out.println();

        // Probar límites
        System.out.println("Intentando prestar un libro sin ejemplares disponibles:");
        for (int i = 0; i < 10; i++) {
            boolean exito = libroGeneral.prestamo();
            System.out.println("Préstamo " + (i+1) + ": " + exito);
            if (!exito) break;
        }
        System.out.println("Estado final: " + libroGeneral);
    }
}