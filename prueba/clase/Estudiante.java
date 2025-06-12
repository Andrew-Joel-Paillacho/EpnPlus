package prueba.clase;

import clases.entidades.Postulante;

public class Estudiante
{
    private static int ids = 0;
    private String  idEstudiante;
    private String nombre;
    private String apellido;
    private int edad;

    ///  constructores
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Estudiante.ids = Estudiante.ids+1;
        this.idEstudiante = "Est"+Estudiante.ids;
    }

    ///  getters
    public String getIdEstudiante() {   return idEstudiante;}
    public String getNombre() { return nombre;}
    public String getApellido() {   return apellido;}
    public int getEdad() {  return edad;}

    /// setter
    public void setNombre(String nombre) {  this.nombre = nombre;}
    public void setApellido(String apellido) {  this.apellido = apellido;}
    public void setEdad(int edad) { this.edad = edad;}




    @Override
    public String toString() {
        return "Estudiante: "+
                "idEstudiante = " + idEstudiante +
                ", nombre = " + nombre +
                ", apellido = " + apellido +
                ", edad = " + edad;
    }
}
