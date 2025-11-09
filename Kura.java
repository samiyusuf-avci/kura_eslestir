import java.util.Random;
import java.util.Scanner;

public class Kura {
    private int n;
    private String[] leads;
    private String[] marabalar;

    public Kura(int n) {
        this.n = n;
        leads = new String[n];
        marabalar = new String[n];
    }

    public void isimleriAl(Scanner scanner) {
        System.out.println("Lead isimlerini girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". lead: ");
            leads[i] = scanner.nextLine();
        }

        System.out.println("\nMaraba isimlerini girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". maraba: ");
            marabalar[i] = scanner.nextLine();
        }
    }

    public void karistir() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int rastgeleIndex = random.nextInt(n);
            String temp = marabalar[i];
            marabalar[i] = marabalar[rastgeleIndex];
            marabalar[rastgeleIndex] = temp;
        }
    }

    public void sonuclariYazdir() {
        System.out.println("\n--- Kura Sonuçları ---");
        for (int i = 0; i < n; i++) {
            System.out.println(leads[i] + " ---> " + marabalar[i]);
        }
    }
}