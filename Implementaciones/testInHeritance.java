package Implementaciones;
public class testInHeritance {

    public static void main(String[] args) {
        Person [] persons = new Person[7]; 

        Person student = new extendPerson("Alice", "S001");
        student.greet();

        Person student2 = new Person("Chaleal");
        student2.greet();

        persons[0] = student;
        persons[1] = student;
        persons[2] = student2;
    }
}