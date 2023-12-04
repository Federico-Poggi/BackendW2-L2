package ExeptionHandling;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(int number){
        super("Il numero" + number + " non è compreso tra 1 e 10");
        System.out.println();
    }

}
