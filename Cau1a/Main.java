package Cau1a;
import java.util.Scanner;
public class Main {
 public static void main(String[]args){
     DSXE ds = new DSXE();
        Scanner sc = new Scanner(System.in);
        int menu;
           do{
               System.out.println("Menu lua chon chuc nang---------------------------");
               System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, x3");
               System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe ");
               System.out.println("3. Thoát");
               System.out.print("Nhap: ");
               menu = sc.nextInt();
               
             switch (menu){
              case 1: 
                  sc.nextLine();
                    System.out.print("Nhap ten chu xe: ");
                    String TenChuXe = sc.nextLine();
                    

                    System.out.print("Nhap loai xe: ");
                    String LoaiXe = sc.nextLine();
                    
                    System.out.print("Nhap gia tri xe: ");
                    double TriGia = sc.nextDouble();
                    
                    System.out.print("Nhap dung tich xe: ");
                    double DungTich = sc.nextDouble();
                    double thuexe = ds.thuecuaxe(TriGia, menu);
                    
                    Vehicle vh = new Vehicle(LoaiXe, TenChuXe, menu, menu, DungTich, thuexe);
                    ds.them_xe(vh);
                    break;
                case 2:
                    ds.Xuat();
                    break;

                default:
                    if(menu !=0){
                        System.out.println("Nhap lai chuc nang");
                    }else{
                        System.out.println("Thoat chuong trinh thanh cong");
                    }
            }
        }while(menu != 0);
    }
}