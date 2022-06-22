import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String time1 = scanner.nextLine();
        String time2 = scanner.nextLine();
        LocalTime time11 = LocalTime.parse(time1);
        LocalTime time12 = LocalTime.parse(time2);
        System.out.println(Math.abs(time11.toSecondOfDay() - time12.toSecondOfDay()));
    }
}
