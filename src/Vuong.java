import java.util.Scanner;

public class Vuong extends AbstractClass {
    private double c;
    public Vuong() {}
    public Vuong( double _c ) { c = _c;}
    public void Input (Scanner scanner) {
        System.out.print("Nhap canh hinh vuong : ");
        c = scanner.nextDouble();
        if ( !check()) {
            System.out.println("Canh hinh vuong nhap khong hop le , vui long thu lai : ");
            do {
                System.out.print("Nhap canh hinh vuong : ");
                c = scanner.nextDouble();
            }while(!check());
        }
    }
    public double getC() {return c;}

    public void setC(double c) {this.c = c;}

    @Override
    public double ChuVi() {
        return c*4;
    }

    @Override
    public double DienTich() {
        return c*c;
    }
    @Override
    public void Show() {
        System.out.println("Chu vi : " + ChuVi());
        System.out.println("Dien tich : " + DienTich());
    }
    public boolean check() {
        return c > 0;
    }
}
