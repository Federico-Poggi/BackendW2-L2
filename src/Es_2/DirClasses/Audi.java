package Es_2.DirClasses;

import Es_2.AUDI;
import Es_2.Interface.ConsumiPerKM;
import Es_2.MARCA;

public class Audi extends Auto implements ConsumiPerKM {
    MARCA brand;
    AUDI model;
    float kmLitro;
    public Audi(int km, float consumedFuel, String brand,String model1){
        super(km,consumedFuel,brand);
        model= AUDI.valueOf(model1);
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    public MARCA getBrand() {
        return brand;
    }


    @Override
    public void ConsumiPerKM() {
        this.kmLitro=this.kmTravelled/this.consumedFuel;
    }

    @Override
    public String toString() {
        return "Brand: " +this.brand + "\n"+ "Model: " + this.model +"\n" + "km: " + this.kmTravelled +"}";
    }
}
