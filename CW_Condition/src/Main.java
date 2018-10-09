import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ThreeNumber task = new ThreeNumber();
        System.out.println("----1----");
        task.inputData(br);

        System.out.println("----2----");
        Continent continent=Continent.ASIA;
        System.out.println("Enter the name of the country");
        String countryName = br.readLine();
        switch (countryName) {
            case "China":
            case "India":
                continent = Continent.ASIA;
                break;
            case "Madagascar":
            case "Tunisia":
                continent = Continent.AFRICA;
                break;
            case "Canada":
            case "Brazil":
                continent = Continent.AMERICA;
                break;
            case "Ukraine":
            case "England":
                continent = Continent.EUROPE;
                break;
            case "Australia":
                continent = Continent.AUSTRALIA;
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        System.out.println(countryName+" is in "+continent);

    }
}