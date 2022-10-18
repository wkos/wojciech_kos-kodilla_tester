import java.util.Locale;
import java.util.Scanner;

public class UserDialogs {
    public static String getUserColor(){
        System.out.println("Podaj literę koloru: N - niebieski, P - pomarańczowy, C - czerwony, Z - zielony");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String firstLetterOfColor = scanner.nextLine().trim().toUpperCase();
            switch (firstLetterOfColor){
                case "N": return "niebieski";
                //problem z upperCase na ż
                case "P": return "pomarańczowy";
                case "C": return "czerwony";
                case "Z": return "zielony";
                default:
                    System.out.println("Zły wybór. Wybierz któryś z podanych kolorów!");
            }
        }
    }
}
