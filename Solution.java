package solution;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int N = (int) ((Math.random() * (200000 - 1)) + 1);
        
        String T = "";
        for (int i = 0; i < N; i++) {
            T+="S";
            T+="M";
            T+="L";
        }

        System.out.println(T);
        
//String T = teclado.next();
        T = T.toUpperCase();
        String cadenaordenada = "";
        int contS = 0, contM = 0, contL = 0;

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == 'S') {
                contS++;
            }
            if (T.charAt(i) == 'M') {
                contM++;
            }
            if (T.charAt(i) == 'L') {
                contL++;
            }
        }

        //bucle S
        for (int i = 0; i < contS; i++) {
            cadenaordenada += "S";
        }
        //bucle M
        for (int i = 0; i < contM; i++) {
            cadenaordenada += "M";
        }
        //bucle L
        for (int i = 0; i < contL; i++) {
            cadenaordenada += "L";
        }

        System.out.println(cadenaordenada);
    }

}
