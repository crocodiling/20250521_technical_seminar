package basiccodes;
public class IfSample {
    public static void main(String[] args) {
        int score = 85;
        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 70) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Trying!");
        }
    }
}