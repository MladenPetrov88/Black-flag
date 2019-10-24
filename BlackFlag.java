import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalGainPlunder = 0;
        for (int i = 1; i <= days; i++) {
            totalGainPlunder += dailyPlunder;
            if (i % 3 == 0) {
                totalGainPlunder +=  dailyPlunder / 2;

            }
            if (i % 5 == 0) {
                totalGainPlunder -=  totalGainPlunder * 0.30;
            }
        }

        if (totalGainPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalGainPlunder );
        } else {
            double diff = totalGainPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", diff);
        }

    }
}
