package Es_2;

import Es_2.DirClasses.Audi;
import Es_2.DirClasses.Auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Che Auto hai (BRAND):\n");
        String brand = scan.nextLine().toUpperCase();
        System.out.print("Inserisci anche il modello:\n");
        String model=scan.nextLine();
//        System.out.println(brand);
        switch (brand){
            case "AUDI"->{
                Auto audi=new Audi(50,5,brand, model);
                System.out.println(audi.toString());
            }
        }
        for (int i = 0; i < MARCA.values().length; i++) {
            System.out.println(MARCA.values().length);
        }





    }
}
