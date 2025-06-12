package prueba.clase;

public class CursoRegular
{
    private static int ids = 0;
    private String idCurso;
    private String nombreCurso;
    private String estadoMatricula;

    public CursoRegular(String nombreCurso, String estadoMatricula) {
        this.nombreCurso = nombreCurso;
        this.estadoMatricula = estadoMatricula;
        CursoRegular.ids = CursoRegular.ids+1;
        this.idCurso = "CuR" + CursoRegular.ids;
    }

    @Override
    public String toString() {
        return "idCurso = " + idCurso +
                ", nombreCurso = " + nombreCurso +
                ", estadoMatricula = " + estadoMatricula;
    }
}
