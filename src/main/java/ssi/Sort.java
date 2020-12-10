package ssi;

import java.util.Scanner;

/**
*sort class.
*/
public class Sort {
    /*how many times the class was instantiated*/
    private static int count;

    /*get counter*/
    private Scanner scanner = new Scanner(System.in);

    /*get counter*/
    public int getInstanceCount() {
        return count;
    }

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo de Bubble Sort.
     *
     * http://www.universidadejava.com.br/pesquisa_ordenacao/bubble-sort/
     *
     * @param v - Vetor que será ordenado.
     */
    public void sort(int... v) {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for (int i = 0; i < v.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < v.length - 1 - i; j++) {
                /*
                 * Se o valor da posição atual do vetor for maior que o proximo valor, então
                 * troca os valores de lugar no vetor.
                 */
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    /**
     * Reads the values.
     *
     * @return array of int
     */
    public int[] read() {
        int size = this.size();
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Value " + i + ": ");
            values[i] = Integer.valueOf(this.scanner.next());
        }
        return values;
    }

    /**
     * Reads the size of the array.
     *
     * @return the size of the array
     */
    private int size() {
        System.out.print("Size of array: ");
        int size = Integer.valueOf(this.scanner.next());
        return size;
    }

    /**
     * Shows the array.
     *
     * @param values the array
     */
    public void show(int... values) {
        for (int num : values) {
            System.out.print(num + " ");
        }
    }
}
