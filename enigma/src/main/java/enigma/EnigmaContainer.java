package enigma;

import java.util.Random;
import java.util.Scanner;

public class EnigmaContainer {

  public static String Input;
  public static String salt = "inevitable";

  public static void runStuff() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input message: ");
    Input = scanner.nextLine();
    System.out.print("Mode (encode=1 | decode=2): ");
    int Mode = scanner.nextInt();

    // check for custom salt

    long StartTime = System.currentTimeMillis();

    if (Mode == 1) {
      encode();
    } else if (Mode == 2) {
      crack();
    }

    System.out.println((System.currentTimeMillis() - StartTime) + "ms");
    scanner.close();
  }

  public static void encode() {
    System.out.println("Encoding");
    Random rand = new Random();
    Rotors rotors = new Rotors();
    rotors.SetRotors(rand.nextInt(26), rand.nextInt(26), rand.nextInt(26));
    rotors.RollRotors();
    int[] positions = rotors.getPosition();
    System.out.print(positions[0] + " " + positions[1] + " " + positions[2] + " ");
    System.out.println(rotors.runThrough(Input + salt));
  }

  public static void crack() {
    System.out.println("Decoding");
    CodeCracker.crackIt();
  }

  public static void chooser(String type) {
    switch (type) {
      case "e":
        encode();
        break;
      case "c":
        crack();
        break;
    }
  }
}