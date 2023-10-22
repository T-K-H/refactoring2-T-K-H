import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    BufferedReader reader;
    String username;
    String hostname;

    public Input() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void processUserRequest() throws InvalidInputException {
        boolean flag;

        String hostname = null;
        flag = true;
        for (int i = 0 ; flag && i<3 ; i++) {
            this.showPrompt("Host");
            hostname = this.getString();
            if (hostname != null && hostname.length() > 0) {
                flag = false;
            }
        }

        if (flag) {
            throw new InvalidInputException();
        }

        String username = null;
        flag = true;
        for (int i = 0 ; flag && i<3 ; i++) {
            this.showPrompt("User");
            username = this.getString();
            if (username != null && username.length() > 0) {
                flag = false;
            }
        }

        if (flag) {
            throw new InvalidInputException();
        }

        this.hostname = hostname;
        this.username = username;
    }

    public void showPrompt(String prompt) {
        System.out.print(prompt + "> ");
    }

    public String getString() {
        try {
            return reader.readLine();
        } catch(IOException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Input inputObj = new Input();
        try {
            inputObj.processUserRequest();
            System.out.println("Hostname: " + inputObj.hostname);
            System.out.println("Username: " + inputObj.username);
        } catch (InvalidInputException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
