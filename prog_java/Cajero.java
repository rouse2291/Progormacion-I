package prog_java;

public class Cajero {
    public static void main(String[] args) {
        int monto, cant10, cant20, cant50;
        
        System.out.println("Ingrese la cantidad de dinero: ");
        monto = Integer.parseInt(System.console().readLine());

        cant50 = monto / 50;
        monto = monto % 50;

        cant20 = monto / 20;
        monto = monto % 20;

        cant10 = monto / 10;
        monto = monto % 10;

        System.out.println("Los billetes en 50 son: " +cant50);
        System.out.println("Los billetes en 20 son: " +cant20);
        System.out.println("Los billetes en 10 son: " +cant10);

    }
}

