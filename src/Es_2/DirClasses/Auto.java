package Es_2.DirClasses;

public abstract class Auto {
    int kmTravelled;
    float consumedFuel;
    protected Auto(int km, float consumedFuel){
        this.kmTravelled=km;
        this.consumedFuel=consumedFuel;
    }
}
