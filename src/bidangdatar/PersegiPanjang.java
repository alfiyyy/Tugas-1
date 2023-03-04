package bidangdatar;

public class PersegiPanjang implements MenghitungBidang{
    private double p,l;

    public PersegiPanjang(double p, double l) {
        setP(p);
        setL(l);
    }
    
    public void setP(double p) {
        this.p = p;
    }

    

    public void setL(double l) {
        this.l = l;
    }
    
    public double getP() {
        return p;
    }

    public double getL() {
        return l;
    }

    @Override
    public double keliling() {
        double luas = (p+l)*2; 
        return luas;
    }
    
    //Overload
    public double keliling(int p, int l){
        
        return (p+l)*2;
    }
    
    @Override
    public double luas() {
        double luas = p*l; 
        return luas;
    }
    
    //Overload
    public double luas(int p, int l) {
        return p*l;
    }





    

}
