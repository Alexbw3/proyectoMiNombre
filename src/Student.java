public class Student {
    private String name;
    private String lastname;
    private long controlNumber;
    private String career;


    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }

    public String getCareer() {
        return career;
    }

    public long getControlNumber() {
        return controlNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setCareer(String career) {
        this.career = career; }
    public double generalAvg(long controlNumber){
        return 0.0;

    }
    public double semesterAvg(long controlNumber, int semester){
        return 0.0;

    }

    public double subjetcGrade(long controlNumber, String subject){
        
        return 0.0;
    }
    public String toString() {
        System.out.println("Los datos del estudiante:");
        System.out.println("nombre:"+ getName());
        System.out.println("apellido"+ getLastname());
        return "";
    }
} 
    

