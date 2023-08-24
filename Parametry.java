public abstract class Parametry {
    private int dlina;
    private int shirina;
    private int vysota;
    private int radius;

    public Parametry(int dlina, int shirina, int vysota, int radius) {
        this.dlina = dlina;
        this.shirina = shirina;
        this.vysota = vysota;
        this.radius = radius;
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getVysota() {
        return vysota;
    }

    public void setVysota(int vysota) {
        this.vysota = vysota;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public abstract void Vychis();
}
