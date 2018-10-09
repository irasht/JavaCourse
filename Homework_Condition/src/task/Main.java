package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Application app = new Application();
        app.inputData(br);

        HTTPError error = HTTPError.NOT_FOUND;
        System.out.println("Enter HTTP status codes");
        int code = Integer.parseInt(br.readLine());
        switch (code) {
            case 400:
                error = HTTPError.BAD_REQUEST;
                break;
            case 401:
                error = HTTPError.UNAUTHORISED;
                break;
            case 402:
                error = HTTPError.PAYMENT_REQUIRED;
                break;
            case 404:
                error = HTTPError.NOT_FOUND;
                break;
            default:
                System.out.println("Don't know this code");
                System.exit(0);
        }
        System.out.println(code + " - "+error);
    }
}