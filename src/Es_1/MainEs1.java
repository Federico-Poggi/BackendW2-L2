package Es_1;

import ExeptionHandling.InvalidNumberException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainEs1 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Interi[] interi;
        interi=new Interi[5];
        for (int i = 0; i < interi.length; i++) {
            int rand = (int) (Math.random()*10);
            interi[i]=new Interi(rand);
            System.out.println(interi[i].getNumber());
        }



        {

            do {
                int inArr;
                    try {
                            System.out.println("Inserisci dei numeri interi da 1 a 10");
                            inArr = scan.nextInt();
                            System.out.println("Inserisci un valore intero, che sarà la posizione del numero che andrai a sostituire (valore compreso da 1 a 4");
                            int position= scan.nextInt();
                            System.out.println("hai sostituito "+ interi[position].getNumber() + " con " + inArr );
                            interi[position]= new Interi(inArr);
                            interi[position].getNumber();
                            if(product(inArr)) {
                                System.out.println("stop");
                                break;
                            }
                    }catch (InputMismatchException e){
                        System.out.println("Devi inserire un intero");
                    }
            }while(true);

                System.out.println(Arrays.toString(interi));

            }

        }
    public static boolean product(int num) {

        if (num == 0) {
            System.out.println("Il risultato è 0");
            return true;
        }else
            return false;
    }


    }


