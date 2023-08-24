import static java.lang.Math.PI;

public class Cylinder extends Parametry {
    public Cylinder(int dlina, int shirina, int vysota, int radius) {
        super(dlina, shirina, vysota, radius);
    }

    @Override
    public void Vychis() {
        System.out.println("Цилиндр: " +
                "\nДлина:   " +getDlina()+
                "\nШирина:  "+getShirina()+
                "\nВысота:  "+getVysota()+
                "\nРадиус:  "+getRadius());
        System.out.println("Ayanty: "+2*PI * getRadius()*( getVysota() + getRadius()));
        System.out.println("Kolomy: "+(PI*getRadius()*getRadius()*getVysota()));
    }
}
