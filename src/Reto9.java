/*
 * Reto #9
 * ¡ORDENANDO!
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que ordene y retorne una array de números.
 * - La función recibirá un listado (por ejemplo [2, 6, 4, 9, 8]) y un parámetro adicional
 *   "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
 * 
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

public class Reto9 {
    // Los tipos enumerado permiten a una variable comportarse
    // como un conjunto de constantes predefinidas.
    enum Ordenacion {
        ASC, DESC;
    }

    public static void main(String[] args) {
        int[] vector = { 2, 6, 4, 9, 8 };

        vector = ordenarVector(vector, Ordenacion.ASC);

        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i] + " ");
    }

    public static int[] ordenarVector(int[] vector, Ordenacion tipo) {

        // Ordenamos el array con el método de la burbúja de forma ascendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }

        // En caso de que haya que ordenar el array de forma descendente
        // simplemente le damos la vuelta

        if (tipo == Ordenacion.DESC) {
            for (int i = 0, j = vector.length - 1; i < vector.length / 2; i++, j--) {
                int aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }
        return vector;
    }
}