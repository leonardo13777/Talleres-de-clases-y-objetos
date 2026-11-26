package Implementaciones;
public class Excepciones {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
        }
        try {
            int value = Integer.parseInt("ABC");
        } catch (NumberFormatException e ){
            System.out.println("Invalid nomber format. ");
        }
    }
}