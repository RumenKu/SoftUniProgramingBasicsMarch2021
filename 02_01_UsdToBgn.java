import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на данни
        double usd = Double.parseDouble(scanner.nextLine());

        // Пресмятане на резултат
        double bgn = usd * 1.79549;

        //Извеждане на резултата
        System.out.println(bgn);
    }
}
