package bangunruang;

import bidangdatar.Lingkaran;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double t;
    
    public Tabung(double r,double t) {
        super(r);
        setT(t);

    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double luasPermukaan() {
        return super.keliling()*(super.getR()+t);
    }
    
    public double luasPermukaan(double kel){
        return kel*(super.getR()+t);
    }
    
    public double luasPermukaan(int r){
        return 2*Math.PI*r*(r+t);
    }

    @Override
    public double volume() {
        return super.luas()*t;
    }
    
    public double volume(double luas) {
        return luas*t;
    }
    
    public double volume(int r) {
        return Math.PI*r*r*t;
    }
    
}
