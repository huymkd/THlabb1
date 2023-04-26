package Cau1a;
import java.util.ArrayList;
import java.util.Scanner;

public class DSXE {
    ArrayList<Vehicle> vh = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
   public void them_xe(Vehicle ve){
        vh.add(ve);
        System.out.println("Them thanh cong");
    }
    
    public void Xuat(){
        for(Vehicle c:vh){
            System.out.println(c.toString());
            
        }
    }    
    public double thuecuaxe(double trigia, int dungtich){
        double thuexe;
        if(dungtich <100) thuexe =(int) (trigia*0.01);
        else if (dungtich >= 100 && dungtich<=200) thuexe = (double) (trigia * 0.03);
        
        else thuexe = (int) (trigia * 0.05);
    
            System.out.println("Thuế xe cần nộp là :" +thuexe);
        return 0;
    }

}