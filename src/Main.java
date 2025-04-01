import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChuNhat chunhat = new ChuNhat();
        Vuong vuong = new Vuong();
        Tron tron = new Tron();
        TamGiac tamgiac = new TamGiac();
        Scanner scanner = new Scanner(System.in);
        tamgiac.Input(scanner);
        tamgiac.Show();
        tron.Input(scanner);
        tron.Show();
    }
}