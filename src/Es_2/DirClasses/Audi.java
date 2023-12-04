package Es_2.DirClasses;

import Es_2.AUDI;
import Es_2.Interface.ConsumiPerKM;
import Es_2.MARCA;

public class Audi extends Auto implements ConsumiPerKM {
    MARCA brand;
    AUDI model;
    float kmLitro;
    public Audi(int km, float consumedFuel, MARCA AUDI){
        super(km,consumedFuel);
        this.brand=AUDI;
    }

    public AUDI getModel() {
        return model;
    }

    public void setModel(AUDI model) {
        this.model = model;
    }

    @Override
    public void ConsumiPerKM() {
        this.kmLitro=this.kmTravelled/this.consumedFuel;
    }
}
