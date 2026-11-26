package Implementaciones;
public class extendPerson extends Person{
    private String studentId;

    public extendPerson(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
    @Override 
    public void greet() {
        System.out.println("Hello, student " + name);
    }
}
