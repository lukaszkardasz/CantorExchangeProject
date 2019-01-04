/*Napisz program, który będzie pomagał w prowadzeniu kantoru. Kantor powinien obsługiwać wymianę trzech par walutowych:

        PLN - EUR,
        PLN - USD,
        EUR - USD.
        Właściciel kantoru z góry określa przelicznik referencyjny i spread dla każdej pary walutowej. W bardziej rozwiniętej wersji kantor powinien pobierać przelicznik referencyjny używając API. Możesz na przykład użyć tego.

        Napisz ten program używając podejścia TDD.*/


import java.util.Scanner;

public class ExchangeOffice {

    private static int plnValue = 0;
    private static int eurValue = 0;
    private static int usdValue = 0;

    public static int getPlnValue() {
        return plnValue;
    }

    public static void setPlnValue(int plnValue) {
        ExchangeOffice.plnValue = plnValue;
    }

    public static int getEurValue() {
        return eurValue;
    }

    public static void setEurValue(int eurValue) {
        ExchangeOffice.eurValue = eurValue;
    }

    public static int getUsdValue() {
        return usdValue;
    }

    public static void setUsdValue(int usdValue) {
        ExchangeOffice.usdValue = usdValue;
    }

    public static void main(String[] args) {

        printInfo();
        Scanner sc = new Scanner(System.in);
        int chooseOption = sc.nextInt();
        while (chooseOption != 0){
            chooseExchange(chooseOption);
        }









    }

    private static void printInfo() {
        System.out.println("Witamy w kantorze Online!\n" + "Wybierz walutę do przeliczenia: ");
        System.out.println("Wybierz 1 - zamiana PLN na EUR");
        System.out.println("Wybierz 2 - zamiana PLN na USD");
        System.out.println("Wybierz 3 - zamiana EUR na USD");
        System.out.println("Wybierz 4 - aby wyjść z kantora");
    }



    public static void chooseExchange(int chooseOption) {
        switch (chooseOption) {
            case 1:
                System.out.println("Wybrałeś opcję nr. " + chooseOption +  "przelicznik PLN na EUR");
                exchangePLNtoEUR(getPlnValue());
                break;

            case 2:
                System.out.println("Wybrałeś opcję nr. " + chooseOption +  "przelicznik PLN na USD");
                exchangePLNtoUSD(getPlnValue());
                break;

            case 3:
                System.out.println("Wybrałeś opcję nr. " + chooseOption +  "przelicznik EUR na USD");
                exchangeEURtoUSD(getEurValue());
                break;
            case 4:
                System.out.println("Dziękujemy za skorzystanie z naszego kantora!");
                break;

            default:
                System.out.println("Niewlaściwy wybór!");
                chooseOption = 0;
                break;
                //TODO - poprawić wychodzenie - bug z zawieszaniem pętli w nieskończoność
        }
        System.out.println("Dziękujemy za skorzystanie z naszego kantora! Miłego dnia!");

    }

    private static int exchangePLNtoEUR(int plnValue) {
        //TODO - napisać test, nastepnie zaprogramować resztę PLN to EUR
        return 0;
    }

    private static int exchangePLNtoUSD(int plnValue) {
        //TODO - napisać test, nastepnie zaprogramować resztę PLN to USD
        return 0;
    }

    private static int exchangeEURtoUSD(int eurValue) {
        //TODO - napisać test, nastepnie zaprogramować resztę EUR to USD
        return 0;
    }
}
