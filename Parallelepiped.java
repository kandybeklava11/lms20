public class Parallelepiped extends Parametry {
    public Parallelepiped(int dlina, int shirina, int vysota, int radius) {
        super(dlina, shirina, vysota, radius);
    }

    @Override
    public void Vychis() {
        System.out.println("Паралелепипеп: " +
                "\nДлина:   " +getDlina()+
                "\nШирина:  "+getShirina()+
                "\nВысота:  "+getVysota()+
                "\nРадиус:  "+getRadius());
        System.out.println("Ayanty: "+2*((getVysota() * getDlina()) + (getDlina() * getShirina()) + (getVysota()* getShirina())));
        System.out.println("Kolomy: "+(getDlina()*getShirina()*getVysota()));

    }

}
