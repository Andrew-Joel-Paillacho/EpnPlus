package prueba.clase;

public class CursoCertificado extends CursoRegular
{
    private double evaluacion;
    private String estadoCurso;

    public CursoCertificado(String nombreCurso, String estadoMatricula, double evaluacion, String estadoCurso) {
        super(nombreCurso, estadoMatricula);
        this.evaluacion = evaluacion;
        this.estadoCurso = estadoCurso;
    }

    @Override
    public String toString() {
        return "Curso Certificado: " + super.toString() +
                ", evaluacion = " + evaluacion +
                ", estado del Curso = " + estadoCurso;
    }
}
