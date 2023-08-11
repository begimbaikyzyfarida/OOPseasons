import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1den 12ge cheyin sandy tandasanyz kaisyl bir sezondun ayin chygaryp beret : ");
        int monthNumber = scanner.nextInt();

        String season = Seasons.getSeasonByMonth(monthNumber);
        System.out.println("Season: " + season);
    }
}
