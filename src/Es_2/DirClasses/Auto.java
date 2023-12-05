package Es_2.DirClasses;

import Es_2.MARCA;

public abstract class Auto {
    int kmTravelled;
    float consumedFuel;
    String brand;
    protected Auto(int km, float consumedFuel, String brand1){
        this.kmTravelled=km;
        this.consumedFuel=consumedFuel;
        this.brand = brand1;
    }

    public float getConsumedFuel() {
        return consumedFuel;
    }

    public int getKmTravelled() {
        return kmTravelled;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
