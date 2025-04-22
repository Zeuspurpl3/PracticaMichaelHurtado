package practicamichaelhurtado;

import java.util.ArrayList;

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }

    public void calculosRefactorizados(int numero) {
        ArrayList<Integer> factoresPrimos = calcularFactorialesPrimos(numero);
        System.out.println("Los factoriales primos del número introducido son: " + factoresPrimos);

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " SÍ es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }

    private ArrayList<Integer> calcularFactorialesPrimos(int numero) {
        ArrayList<Integer> miArray = new ArrayList<>();
        miArray.add(1); // añadimos el 1

        for (int i = 2; i < numero; i++) {
            if (esPrimo(i) && numero % i == 0) {
                miArray.add(i);
            }
        }

        return miArray;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public void calcularMCD(int numA, int numB) {
        int a = numA, b = numB;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El máximo común divisor de " + numA + " y " + numB + " es " + a);
    }
}
