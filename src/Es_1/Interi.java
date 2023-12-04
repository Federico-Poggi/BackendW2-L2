package Es_1;

import ExeptionHandling.InvalidNumberException;

import java.lang.reflect.Array;

public class Interi {

    int number;
    public Interi(int numb1){
        this.number=numb1;
    }

    public int getNumber() throws InvalidNumberException {
        if (number>10|number<0)throw new InvalidNumberException("Il numero deve essere compreso tra 1 e 10");
        return number;
    }

    @Override
    public String toString() {
        return "Interi{" +
                "number=" + number +
                '}';
    }
}

