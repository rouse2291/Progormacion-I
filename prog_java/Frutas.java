package prog_java;

public class Frutas {
    public static void main(String[] args) {
        int cantidad;
        double precio,total;

        System.out.println("Ingrese el precio del articulo: ");
        cantidad = Integer.parseInt(System.console().readLine());

        System.out.println("Ingresa la cantidad del articulo: ");
        precio = Integer.parseInt(System.console().readLine());

        total = precio * cantidad;

        System.out.println("El cliente debe abonar: " +total);
    }
}
