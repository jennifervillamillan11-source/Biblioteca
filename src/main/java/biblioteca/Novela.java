package biblioteca;

/**
 * Enum para los tipos de novela.
 */
enum TipoNovela {
    HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCA_FICCION, AVENTURAS
}

/**
 * Clase Novela que hereda de Libro y añade el atributo tipo.
 * Representa novelas de diferentes géneros.
 */
public class Novela extends Libro {
    // Atributo adicional
    private TipoNovela tipo;

    /**
     * Constructor vacío.
     */
    public Novela() {
        super(); // Llama al constructor vacío de Libro
        this.tipo = null;
    }

    /**
     * Constructor con parámetros, incluyendo los de la clase padre.
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param numeroEjemplares Número total de ejemplares
     * @param numeroEjemplaresPrestados Número de ejemplares prestados
     * @param tipo Tipo de novela
     */
    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de Libro
        this.tipo = tipo;
    }

    // Método get y set para tipo
    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }

    /**
     * Redefinición del método toString para incluir el tipo de novela.
     * @return Cadena con la información de la novela
     */
    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados() +
                ", tipo=" + (tipo != null ? tipo : "No especificado") +
                '}';
    }
}