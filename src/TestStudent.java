public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ricardo");
        student.setLastname("lira");
        student.setControlNumber(22670046);
        student.setCareer("ing.informatica");
        System.out.println("nombre:" + student.getName());
        System.out.println("apellido:" + student.getLastname());
        System.out.println("numero de control"+student.getControlNumber());
        System.out.println("carrera:"+student.getCareer());

        Student ricardo = new Student();
        ricardo.setName("Evelyn");
        ricardo.setLastname("lira");
        ricardo.setControlNumber(22670067);
        ricardo.setCareer("ing.informatica");
        System.out.println("nombre:" + ricardo.getName());
        System.out.println("apellido:" + ricardo.getLastname());
        System.out.println("numero de control" +ricardo.getControlNumber());
        System.out.println("carrera:"+ricardo.getCareer());


    }
}
