package prog_java;

public class Perimetro {
    public static void main(String[] args) {
        
        int perimetro, lado;

        System.out.println("Ingrese el lado de un cuadrado: ");
        lado = Integer.parseInt(System.console().readLine());

        perimetro = 4 * lado;

        
        System.out.println("El perimetro es: " +perimetro);



    }
}
