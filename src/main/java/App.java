import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number:");
        int UserNumber = input.nextInt();
        PingPong pingPong = new PingPong();
        ArrayList<Object> pingPongResult;
        pingPongResult = pingPong.runPingPong(UserNumber);
        System.out.println(pingPongResult);
	System.out.println("Goodbye");
    }
}
