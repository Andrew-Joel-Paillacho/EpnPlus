package prueba.clase;

public class Docente
{
    private static int ids = 0;
    private String idDocente;
    private String nombreDocente;
    private int nClases;
    private String titulo;

    public Docente(String nombreDocente, int nClases, String titulo) {
        this.nombreDocente = nombreDocente;
        this.nClases = nClases;
        this.titulo = titulo;
        Docente.ids = Docente.ids+1;
        this.idDocente = "Doc" + Docente.ids;
    }

    @Override
    public String toString() {
        return "Docente: " +
                "idDocente = " + idDocente +
                ", nombreDocente = " + nombreDocente +
                ", nClases = " + nClases +
                ", titulo = " + titulo;
    }
}
