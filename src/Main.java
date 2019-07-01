import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj porę roku: Lato Jesień Zima Wiosna");
        String sez = scan.nextLine();
        Season season = Season.fromDescription(sez);
        Rok rok = new Rok(season);
        System.out.println(rok);

    }
}
