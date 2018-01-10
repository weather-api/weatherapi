import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        RequestHandler rh = new RequestHandler();
        try {
            System.out.println("Tell me a city");
            Scanner input = new Scanner(System.in);
            String c = input.next();
            City city = rh.executeRequest(c);
            System.out.println(city.name+","+city.main.getTemp());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
