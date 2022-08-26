import java.util.List;

public class Titulo {
    //variables
    public String titulo;
    public String edicion;
    public String isbn;
    List<Autor> autores;
    List<Categoria> categorias;

    public Titulo() {
        System.out.println("El objeto titulo se creo");
    }

    //sobrecarga de metodo contructor
    public Titulo(String titulo, String edicion) {
        this.titulo = titulo;
        this.edicion = edicion;
    }
}
