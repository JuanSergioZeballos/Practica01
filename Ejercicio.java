import java.io.*;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Datos.csv"));
            String line = null;
            int count = 0;

            // Contar las líneas en el archivo para determinar el tamaño del array
            while ((line = reader.readLine()) != null) {
                count++;
            }

            // Reiniciar el lector para volver al principio del archivo
            reader.close();
            reader = new BufferedReader(new FileReader("Datos.csv"));

            students = new Student[count];
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                Student estudiante = new Student(
                    parts[0], parts[1], parts[2], parts[3], parts[4], Integer.parseInt(parts[5]), parts[6], parts[7]
                );
                students[index] = estudiante;
                index++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (students != null) {
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].toString());
            }

            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Ingrese el nombre del alumno a buscar: ");
            String nombre = sc.next();
            int pos = busquedaSecuencialNombre(students, nombre);

            if (pos != -1) {
                System.out.println(students[pos].toString());
            } else {
                System.out.println("No encontrado");
            }
        }
        // Ordenar estudiantes por edad usando el algoritmo de ordenamiento de burbuja
        ordenarPorEdad(students);

        // Imprimir estudiantes ordenados por edad
        System.out.println("Estudiantes ordenados por edad:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }

    public static int busquedaSecuencialNombre(Student[] students, String s) {
        for (int i = 0; i < students.length; i++) {
            if (s.equals(students[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public static void ordenarPorEdad(Student[] students) {
        int n = students.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (students[i].getEdad() > students[i + 1].getEdad()) {
                    // Intercambiar estudiantes
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
    }
}