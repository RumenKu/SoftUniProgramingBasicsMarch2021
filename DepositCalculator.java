import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на данни
        Double deposit = Double.parseDouble(scanner.nextLine());
        Integer mounts = Integer.parseInt(scanner.nextLine());
        Double rate = Double.parseDouble(scanner.nextLine());

        //Изчисляване на резултата
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        Double lihva = mounts * deposit * rate / 1200;
        Double result = deposit + lihva;

        // Извеждане на резултата
        System.out.println(result);

    }
}
