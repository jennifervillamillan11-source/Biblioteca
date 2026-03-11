package biblioteca;

/**
 * Clase base Libro que maneja la información de un libro en la biblioteca.
 */
public class Libro {
    // Atributos encapsulados
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    /**
     * Constructor vacío por defecto.
     */
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    /**
     * Constructor con parámetros.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numeroEjemplares Número total de ejemplares
     * @param numeroEjemplaresPrestados Número de ejemplares prestados
     */
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // Métodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    /**
     * Método para realizar un préstamo del libro.
     * Incrementa el número de ejemplares prestados si hay disponibles.
     * @return true si se pudo realizar el préstamo, false en caso contrario
     */
    public boolean prestamo() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Método para realizar una devolución del libro.
     * Decrementa el número de ejemplares prestados si hay alguno prestado.
     * @return true si se pudo realizar la devolución, false en caso contrario
     */
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    /**
     * Método toString para mostrar los datos del libro.
     * @return Cadena con la información del libro
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                '}';
    }
}