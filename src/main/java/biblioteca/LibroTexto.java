package biblioteca;

/**
 * Clase LibroTexto que hereda de Libro y añade el atributo curso.
 * Representa libros de texto asociados a un curso específico.
 */
public class LibroTexto extends Libro {
    // Atributo adicional
    private String curso;

    /**
     * Constructor vacío.
     */
    public LibroTexto() {
        super(); // Llama al constructor vacío de Libro
        this.curso = "";
    }

    /**
     * Constructor con parámetros, incluyendo los de la clase padre.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numeroEjemplares Número total de ejemplares
     * @param numeroEjemplaresPrestados Número de ejemplares prestados
     * @param curso Curso al que está asociado el libro
     */
    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de Libro
        this.curso = curso;
    }

    // Método get y set para curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Redefinición del método toString para incluir el curso.
     * @return Cadena con la información del libro de texto
     */
    @Override
    public String toString() {
        return "LibroTexto{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", curso='" + curso + '\'' +
                '}';
    }
}