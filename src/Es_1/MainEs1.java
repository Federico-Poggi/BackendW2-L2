package Es_1;

import ExeptionHandling.InvalidNumberException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainEs1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Integer[] interi;
        interi=new Integer[5];
        for (int i = 0; i < interi.length; i++) {
            int rand = (int) (Math.random()*10);
            interi[i]=rand;
            System.out.println(interi[i]);
        }



            {
//                for (int i = 0; i<interi.length; i++){
                do {
                    try {
                        System.out.println("Inserisci dei numeri interi da 1 a 10");
                        int inArr = scan.nextInt();
                        System.out.println("Inserisci un valore intero, che sarà la posizione del numero che andrai a sostituire (valore compreso da 1 a 5");
                        int position= scan.nextInt();
                        System.out.println("hai sostituito "+ interi[position] + " con " + inArr );
                        interi[position]=inArr;

                    }catch (InputMismatchException e){
                        System.out.println("Devi inserire un intero");
                    }
                }while ();

//            }

        }
    }


}