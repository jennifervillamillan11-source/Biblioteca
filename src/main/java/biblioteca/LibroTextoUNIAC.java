package biblioteca;

/**
 * Clase LibroTextoUNIAC que hereda de LibroTexto y añade el atributo facultad.
 * Representa libros de texto publicados por una facultad específica de la UNIAC.
 */
public class LibroTextoUNIAC extends LibroTexto {
    // Atributo adicional
    private String facultad;

    /**
     * Constructor vacío.
     */
    public LibroTextoUNIAC() {
        super(); // Llama al constructor vacío de LibroTexto
        this.facultad = "";
    }

    /**
     * Constructor con parámetros, incluyendo los de las clases padre.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numeroEjemplares Número total de ejemplares
     * @param numeroEjemplaresPrestados Número de ejemplares prestados
     * @param curso Curso al que está asociado el libro
     * @param facultad Facultad que publicó el libro
     */
    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso); // Llama al constructor de LibroTexto
        this.facultad = facultad;
    }

    // Método get y set para facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * Redefinición del método toString para incluir la facultad.
     * @return Cadena con la información del libro de texto UNIAC
     */
    @Override
    public String toString() {
        return "LibroTextoUNIAC{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", curso='" + getCurso() + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}