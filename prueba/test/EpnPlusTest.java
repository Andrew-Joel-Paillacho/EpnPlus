package prueba.test;

import prueba.clase.CursoCertificado;
import prueba.clase.CursoRegular;
import prueba.clase.Docente;
import prueba.clase.Estudiante;

public class EpnPlusTest
{
    public static void main(String[] args)
    {
        Estudiante est = new Estudiante("Mielle","Rosent",18);
        Estudiante est2 = new Estudiante("Aria","Piast",19);
        Estudiante est3 = new Estudiante("Artizia","Lablac",20);

        Docente doc = new Docente("Belle Castiello", 3, "Ing. en Sistemas Computacionales");
        Docente doc2 = new Docente("Atanazio Chrisel", 6, "Doctorado en ciencias de la Computacion");
        Docente doc3 = new Docente("Seris Vritra", 5, "Maestria en Quimica Organica");

    }
}
