import java.util.*;
public class PracNOCSV{
	public static void main (String[]args){
	  	Scanner sc = new Scanner(System.in);
	  	System.out.println("Ingrese la cantidad de estudiantes");
		int n = sc.nextInt();
		Student2 [] alumnos = new Student2 [n];
		System.out.println("INGRESE LOS DATOS DE LOS ESTUDIANTES");
		ingresarDatos(alumnos);
	}

	public static void ingresarDatos(Student2 [] person){
	  	Scanner sc = new Scanner(System.in);
		String nombre,gmail,paterno,materno,fecha;
		int cui,genero,status;
		for(int i=0;i<person.length;i++){
			System.out.print("Ingrese nombre completo: ");
			nombre=sc.nextLine();
			System.out.print("Ingrese el apellido paterno: ");
			paterno=sc.next();
			System.out.print("Ingrese el apellido materno: ");
			materno=sc.next();
			System.out.print("Nacimiento en formato (dd/MM/AAAA): ");
			fecha=sc.next();
			System.out.print("Ingrese el gmail: ");
			gmail=sc.next();
			System.out.print("Ingrese el CUI: ");
			cui=sc.nextInt();
			sc.nextLine();
			System.out.print("Ingrese el genero (0-Femenino 1-Masculino): ");
			genero=sc.nextInt();
			sc.nextLine();
			System.out.print("Ingrese el estado (0-Inhabilitado 1-Habilitado): ");
			status=sc.nextInt();
			sc.nextLine();
			System.out.println("==============================================");
			person[i]=new Student2();
			person[i].setName(nombre);
			person[i].setMaterno(materno);
			person[i].setPaterno(paterno);
			person[i].setCui(cui);
			person[i].setStatus(status);
			person[i].setGmail(gmail);
			person[i].setGender(genero);
			person[i].setFecha(fecha);
		}
	}
}
