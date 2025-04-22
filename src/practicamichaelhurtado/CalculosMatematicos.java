package practicamichaelhurtado;

import java.util.ArrayList;

/**
 * Clase que contiene varios métodos de matematicas.
 * Se puede usar para sacar factores primos, saber si un número es primo
 * y también calcular el máximo común divisor entre dos números.
 * @version 1.0
 * @author  Michael Roberto Hurtado
 */
public class CalculosMatematicos {

    /**
     * Constructor vacío de la clase.
     * No hace nada.
     */
    public CalculosMatematicos() {
    }

    /**
     * Método principal que hace los cálculos matemáticos.
     * Muestra los factores primos del número que se introduce
     * y también dice si es primo o no.
     * 
     * @param numero número que introduce el usuario
     */
    public void calculosRefactorizados(int numero) {
        ArrayList<Integer> factoresPrimos = calcularFactorialesPrimos(numero);
        System.out.println("Los factoriales primos del número introducido son: " + factoresPrimos);

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " SÍ es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }

    /**
     * Calcula los factores primos del número que se pasa.
     * Se guarda en un ArrayList y se devuelve al final.
     * 
     * @param numero número del que queremos saber los factores primos
     * @return devuelve una lista con los factores primos
     */
    private ArrayList<Integer> calcularFactorialesPrimos(int numero) {
        ArrayList<Integer> miArray = new ArrayList<>();
        miArray.add(1); // siempre añadimos el 1

        for (int i = 2; i < numero; i++) {
            if (esPrimo(i) && numero % i == 0) {
                miArray.add(i);
            }
        }

        return miArray;
    }

    /**
     * Comprueba si un número es primo o no.
     * Siguiendo la lógica de que un número primo solo es divisible por 1 y por él mismo.
     * 
     * @param numero número que queremos comprobar
     * @return true si es primo, false si no lo es
     */
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

    /**
     * Calcula el MCD (máximo común divisor) entre dos números.
     * 
     * @param numA primer número
     * @param numB segundo número
     */
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
