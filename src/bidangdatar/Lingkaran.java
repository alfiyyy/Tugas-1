package bidangdatar;

public class Lingkaran implements MenghitungBidang{

    private double r;

    public Lingkaran(double r){
        setR(r);
        
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR(){
        return r;
    }
    

    @Override
    public double keliling() {
        return 2*Math.PI*r;
    }
    
    public double keliling(double r) {
        double kel = 2*Math.PI*r;
        return kel;
    }


    @Override
    public double luas() {
        return Math.PI*r*r;
    }
    
    public double luas(double r) {
        double luas = Math.PI*r*r; 
        return luas;
    }



    
}
