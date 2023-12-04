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
                            System.out.println("Inserisci un valore intero, che sarà la posizione del numero che andrai a sostituire (valore compreso da 1 a 5");
                            int position= scan.nextInt()-1;
                            System.out.println("hai sostituito "+ interi[position] + " con " + inArr );
                            interi[position]= new Interi(inArr);
                            interi[position].getNumber();
                            if(product(inArr)) {
                                System.out.println("stop");
                                break;
                            }
                    }catch (InvalidNumberException e){
                        System.err.println("(Il valore appena inserito non è stato registrato riporova)\n");
                        System.out.println("Devi inserire un intero tra 1 e 10\n");
                    }catch (InputMismatchException e){
                        System.out.println("Inserisci un intero e non una parola\n");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Svegliati ti ho detto da 1 a 5!");
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


