package company.implementations;

import company.interfaces.Messenger;

public class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}
