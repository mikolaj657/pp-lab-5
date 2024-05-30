import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(10, 5);
        System.out.println("Result of addition: " + result);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("The result of addition is: " + result);
    }
}