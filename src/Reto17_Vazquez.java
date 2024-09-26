/**
 * Vázquez Casaus, Jorge.
 * DAM2
 * Retos de programación
 * Reto 17
 * 
 * Enunciado: Crea un programa que dado un String devuelva el primer carácter
 * que no se repita,
 * en caso de no existir devolver "*"
 */

public class Reto17_Vazquez {

    private static final String WORD1 = "sauron"; // Ninguna letra repetida: se espera como respuesta "s"
    private static final String WORD2 = "orome"; // Letra "o" repetida: se espera como respuesta "r"
    private static final String WORD3 = "soppos"; // Todas las letras repetidas: se espera como respuesta "*"

    public static void main(String[] args) throws Exception {

        System.out.println("La palabra a evaular es: " + WORD2);
        char character = noRepeatCharacter();
        if(character == '*'){
            System.out.println(character);
        }
            
    }

    public static char noRepeatCharacter() {

        for (int i = 0; i < WORD2.length(); i++) {

            if (WORD2.indexOf(WORD2.charAt(i)) < (WORD2.lastIndexOf(WORD2.charAt(i)))) {
                System.out.println((i + 1) + "º" + " Letra repetida: " + WORD2.charAt(i));
            } else {
                System.out.println("La primera letra no repetida es: " + WORD2.charAt(i));
                return WORD2.charAt(i);
            }
        }
        return '*';
    }
}
