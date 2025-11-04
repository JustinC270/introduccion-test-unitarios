package es.fpsumma.dam1.utils;

public class NumberUtils {

    // Operaciones básicas con enteros
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }

    // Par/impar
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Máximo de dos
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Suma de un array (si está vacío, devuelve 0)
    public static int sumArray(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    // Cuenta cuántos pares hay en el array
    public static int countEven(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (isEven(n)) {
                count++;
            }
        }
        return count;
    }

    // Devuelve una copia del array en orden inverso
    public static int[] reverse(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            out[i] = nums[nums.length - 1 - i];
        }
        return out;
    }
}
