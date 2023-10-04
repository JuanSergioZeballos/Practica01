// Creamos la clase Student, para gurdar los datos de los estudiantes
public class Student {
    private String Name;
    private String Materno;
    private String Paterno;
    private String Gender;
    private String CUI;
    private String Status;
    private String Email;
    private String Edad;

    // Constructor
    public Student(String CUI, String Email, String Name, String Paterno, String Materno, String Edad, String Status, String Gender) {
        this.Name = Name;
        this.Materno = Materno;
        this.Paterno = Paterno;
        this.Gender = Gender;
        this.CUI = CUI;
        this.Status = Status;
        this.Email = Email;
        this.Edad = Edad;
    }

    // Getters
    public String getName() {
        return Name;
    }

    public String getMaterno() {
        return Materno;
    }

    public String getPaterno() {
        return Paterno;
    }

    public String getGender() {
        return Gender;
    }

    public String getCUI() {
        return CUI;
    }

    public String getStatus() {
        return Status;
    }

    public String getEmail() {
        return Email;
    }

    public String getEdad() {
        return Edad;
    }

    // Setters
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
    public String toString() {
        return "Nombre: " + Name +
               "Apellido Paterno: " + Paterno +
               "Apellido Materno: " + Materno +
               "Género: " + Gender +
               "CUI: " + CUI +
               "Estado: " + Status +
               "Email: " + Email +
               "Edad: " + Edad;
    }
}