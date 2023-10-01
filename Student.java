
import java.util.Scanner;

public class Student{
	String nombre,apellido;
    
    public Student(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void ingresarDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese el Apellido: ");
        apellido=sc.nextLine();
    }

}
