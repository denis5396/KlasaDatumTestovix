import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dan, mjesec, godina;
        int test = 1;
        System.out.println("Hello World!");


        do {
            dan = input.nextInt();
            mjesec = input.nextInt();
            godina = input.nextInt();
            try {
                Datum datumObj = new Datum(dan, mjesec, godina);
                test = 2;
                datumObj.pomjeriZaJedanDanUnazad();
                System.out.println("");
                System.out.print(datumObj.toString());
                System.out.println("");
                Datum datumObj1 = new Datum(5,3,1996);
                System.out.println("");
                System.out.println(datumObj.equals(datumObj1));
                System.out.print(datumObj.compareTo(datumObj1));

            } catch (Exception e) {
                System.out.println("Pokusaj opet...");
            }
        }while(test == 1);

    }
}
