package prog_java;

public class AreaRectangulo {
    public static void main(String[] args) {
        int base, altura, areaRectangulo;

        System.out.println("Ingrese la base: ");
        base = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la altura: ");
        altura = Integer.parseInt(System.console().readLine());

        areaRectangulo = base * altura;

        System.out.println(" El area del rectangulo es: " +areaRectangulo);

    }
}
