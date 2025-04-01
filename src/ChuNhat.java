import java.util.Scanner;

public class ChuNhat extends AbstractClass {
    private double c1 , c2;
    public ChuNhat(){}
    public ChuNhat( double _c1 , double _c2) {
        c1 = _c1;
        c2 = _c2;
    }
    public void Input (Scanner scanner) {
        System.out.print("Nhap canh s1 : ");
        c1 = scanner.nextDouble();
        System.out.print("Nhap canh s2 : ");
        c2 = scanner.nextDouble();
        if ( !check()) {
            System.out.println("Canh nhap khong hop le , vui long nhap lai : ");
            do {
                System.out.print("Nhap canh s1 : ");
                c1 = scanner.nextDouble();
                System.out.print("Nhap canh s2 : ");
                c2 = scanner.nextDouble();
            }while ( !check());
        }
    }
    public double getC1() {return c1;}

    public void setC1(double c1) {this.c1 = c1;}

    public double getC2() {return c2;}

    public void setC2(double c2) {this.c2 = c2;}

    @Override
    public double ChuVi() {
        return (c1 + c2)*2;
    }
    @Override
    public double DienTich () {
        return c1 * c2;
    }
    @Override
    public void Show() {
        System.out.println("Chu vi : " + ChuVi());
        System.out.println("Dien tich : " + DienTich());
    }
    public boolean check() {
        return c1 > 0 && c2 > 0;
    }
}
