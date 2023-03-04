package bangunruang;

import bidangdatar.PersegiPanjang;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double t;

    public Balok(double p, double l,double t) {
        super(p,l);
        setT(t);
    }
    
    public void setT(double t) {
        this.t = t;
    }
    
    @Override
    public double luasPermukaan() {
        return 2*(super.getP()*super.getL() + super.getP()*t + super.getL()*t);
    }

    public double luasPermukaan(double p, double l,double t) {
        return 2*(p*l + p*t + l*t);
    }

    @Override
    public double volume() {
        return super.luas()*t;
    }
    
    public double volume(double p , double l) {
        return p*l*t;
    }


    
}
