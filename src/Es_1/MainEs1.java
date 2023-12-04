package Es_1;

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
        for (int i = 0; i<interi.length; i++){

            System.out.println("Inserisci dei numeri interi da 1 a 10");
            int inArr=Integer.parseInt(scan.nextLine());

//
//        }
    }


}