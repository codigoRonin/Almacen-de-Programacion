/*
 * Reto #13
 * LLEVANDO CAJAS
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Disponemos de N cajas vacías, cada una con capacidad para almacenar 
 * un número de bolas creciente, de 1 a N (la primera caja almacena 1 bola, 
 * la siguiente 2... hasta la N ésima caja que almacena N bolas). 
 * 
 * Disponemos de un número infinito de bolas con que llenar las cajas.
 * 
 * En cada viaje, podemos llevar las bolas que queramos, pero sólo podemos poner 
 * el mismo número de bolas en las cajas que elijamos. Por ejemplo, si ponemos 2 bolas 
 * en una caja, sólo podemos llenar otras cajas con 2 bolas, sin que sobre ninguna.
 * 
 * Escribir un programa que calcule el número mínimo de viajes para llenar las N cajas.
 * 
 * EJEMPLO
 * -------
 * Si tenemos N = 3 cajas, en la primera cabría 1 bola, en la segunda 2 bolas 
 * y en la tercera 3 bolas. 
 * 
 * El número mínimo de viajes es de 2: en el primer viaje ponemos 2 bolas en 
 * las cajas 2 y 3, y en el segundo viaje ponemos 1 bola en las cajas 1 y 3
 *
 */

public class Reto13 {
public static void main(String[] args) {

    System.out.println(numeroMinimoViajes(7));
    
}


// Aplicamos una estrategia divide y vencerás : vamos dividiendo el problema en
// versiones más simples que, combinadas, resuelven el problema general.

// Aplicamos una función recursiva:
// Si sólo hay 1 caja, hacemos un viaje.
// Si hay más cajas, haremos un viaje más los que resulten de rellenar la mitad
// de las cajas.

public static int numeroMinimoViajes(int cajas){
    if(cajas == 1)
        return 1;
    return 1 + numeroMinimoViajes(cajas/2);
    }
}