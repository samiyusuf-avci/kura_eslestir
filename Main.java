import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 3;
        Kura kura = new Kura(n);

        kura.isimleriAl(scanner);
        kura.karistir();
        kura.sonuclariYazdir();
    }
}