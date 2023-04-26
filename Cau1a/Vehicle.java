package Cau1a;

public class Vehicle {
    String loaixe,tenchuxe;
    int maxe,trigia;
    double dungtich,thuexe;

    public Vehicle() {
    }

    public Vehicle(String loaixe, String tenchuxe, int maxe, int trigia, double dungtich, double thuexe) {
        this.loaixe = loaixe;
        this.tenchuxe = tenchuxe;
        this.maxe = maxe;
        this.trigia = trigia;
        this.dungtich = dungtich;
        this.thuexe = thuexe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public int getMaxe() {
        return maxe;
    }

    public void setMaxe(int maxe) {
        this.maxe = maxe;
    }

    public int getTrigia() {
        return trigia;
    }

    public void setTrigia(int trigia) {
        this.trigia = trigia;
    }

    public double getDungtich() {
        return dungtich;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    public double getThuexe() {
        return thuexe;
    }

    public void setThuexe(double thuexe) {
        this.thuexe = thuexe;
    }
    
    public double thuexe(){
        if(dungtich <100) thuexe =(int) (trigia*0.01);
        else if (dungtich >= 100 && dungtich<=200) thuexe = (int) (trigia * 0.03);
        else thuexe = (int) (trigia * 0.05);
        return thuexe;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "loaixe=" + loaixe + ", maxe=" + maxe + ", dungtich=" + dungtich + ", trigia=" + trigia + ", thuexe=" + thuexe + '}';
    }
 void inThuecuaxe(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ", loaixe, maxe,dungtich,trigia,thuexe);
    }

}