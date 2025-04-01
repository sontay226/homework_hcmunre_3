import java.util.Scanner;

public class TamGiac extends AbstractClass{
    private double c1 , c2 , c3;
    public TamGiac() {}
    public TamGiac( double _c1 , double _c2 , double _c3) {
        c1 = _c1;
        c2 = _c2;
        c3 = _c3;
    }
    public void Input (Scanner scanner ) {
            System.out.print("Nhap canh s1 : ");
            c1 = scanner.nextDouble();
            System.out.print("Nhap canh s2 : ");
            c2 = scanner.nextDouble();
            System.out.println("Nhap canh s3 : ");
            c3 = scanner.nextDouble();
            if ( !check()) {
                System.out.println("Canh tam giac khong hop le , vui long thu lai : ");
                do {
                    System.out.print("Nhap canh s1 : ");
                    c1 = scanner.nextDouble();
                    System.out.print("Nhap canh s2 : ");
                    c2 = scanner.nextDouble();
                    System.out.println("Nhap canh s3 : ");
                    c3 = scanner.nextDouble();
                } while ( !check());
            }
    }
    @Override
    public double ChuVi() {
        return c1 + c2 + c3;
    }

    @Override
    public double DienTich() {
        double p = ChuVi();
        return Math.sqrt( p * ( p - c1 ) * ( p - c2) * ( p - c3));
    }
    @Override
    public void Show() {
        System.out.println("Chu vi : " + ChuVi());
        System.out.println("Dien tich : " + DienTich());
    }
    public boolean check () {
        return c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1;
    }
}
