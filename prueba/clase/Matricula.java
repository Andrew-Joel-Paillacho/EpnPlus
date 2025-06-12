package prueba.clase;

public class Matricula
{
    private static int ids = 0;
    private String idMatricula;
    private String idEstudiante;
    private String idDocente;
    private String idCurso;

    public Matricula(String idEstudiante, String idDocente, String idCurso) {
        this.idEstudiante = idEstudiante;
        this.idDocente = idDocente;
        this.idCurso = idCurso;
        Matricula.ids = Matricula.ids+1;
        this.idMatricula = "MA" + Matricula.ids;
    }
}
