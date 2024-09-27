package prog_java;

public class Opera {
    public static void main(String[] args) {
        
       int num1, num2, num3, num4, suma, producto;

       System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el cuarto numero: ");
        num4 = Integer.parseInt(System.console().readLine());

        suma = num1 + num2;
        producto = num3 * num4;

        System.out.println("La suma es: " +suma);
        System.out.println("El producto es: " +producto);

    }
}
