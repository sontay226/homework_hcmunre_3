import java.util.Scanner;

public class Tron extends AbstractClass{
    private double r;
    public Tron() {}
    public Tron( double _r ) { r = _r;}
    public void Input (Scanner scanner) {
        System.out.print("Nhap ban kinh : ");
        r = scanner.nextDouble();
        if ( !check()) {
            System.out.println("Ban kinh nhap khong hop le , vui long thu lai : ");
            do {
                System.out.print("Nhap ban kinh : ");
                r = scanner.nextDouble();
            }while ( !check());
        }
    }
    public double getR() {return r;}

    public void setR(double r) {this.r = r;}

    @Override
    public double ChuVi() {
        return  2*Math.PI*r;
    }

    @Override
    public double DienTich() {
        return Math.PI*r*r;
    }
    @Override
    public void Show() {
        System.out.println("Chu vi : " + ChuVi());
        System.out.println("Dien tich : " + DienTich());
    }
    public boolean check () {
        return r > 0;
    }
}
