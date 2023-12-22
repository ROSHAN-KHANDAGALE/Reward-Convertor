import java.util.Scanner;

public class RewardValue {
    public RewardValue(double cashValue) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Cash: ");
        Integer cashValue = sc.nextInt();
        System.out.println("Enter the value of Miles: ");
        Integer milesValue = sc.nextInt();
    }
}
