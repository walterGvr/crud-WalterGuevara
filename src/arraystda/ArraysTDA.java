
package arraystda;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArraysTDA {

    public static void main(String[] args) {
        //p1. declarar los arreglos
        int numeros [] = new int[5];
        int numeros2 [] = new int [numeros.length];
        String palabras [] = new String [5];
        
        //p2. captuarar los datos que el usuario ingrese
        int i;
            //de  hasta incremento
        for (i=0; i<5; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del indice: " + i));
        }
        
        //p3. mostrar los datos del arreglo
        System.out.println("los datos sin ordenar son: ");
        for(i=0; i<5; i++){
            System.out.println("[" +numeros[i]+ "]");
        }
        
        //p4. ordenar los elementos del array numero
        System.out.println("los elementos ordenados son: ");
        Arrays.sort(numeros);//aca se ordenan los elementos del arreglo
        for(i=0; i<5; i++){ 
            System.out.println("["+numeros[i]+"]");
        }
        
        //p5. Rellenar el arreglo con palabras
        Arrays.fill(palabras, "voy a pasar la materia");
        for(i=0; i<5; i++){
            System.out.println("["+palabras[i]+"]");
        }
        
        //p6. copiando los elementos del arreglo numeros a numeros2
        System.arraycopy(numeros, 0, numeros2, 0, numeros.length);
        System.out.println("los datos copiados del arreglo numeros a numeros2");
        for(i=0; i<5; i++){
            System.out.println("["+numeros2[i]+"]");
        }
    }
    
}
