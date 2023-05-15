package enigma;

import java.util.Scanner;

public class CodeCracker {
  public static void crackIt() {
    Rotors MasterRotors = new Rotors();
    Rotors testRotors = new Rotors();
    int[] positions = MasterRotors.getPosition();

    String CompleteIn = EnigmaContainer.Input;
    String Salt = EnigmaContainer.salt;
    String saltIn = CompleteIn.substring(CompleteIn.length() - EnigmaContainer.salt.toCharArray().length);
    String output = "";

    MasterRotors.SetRotors(0, 0, 0);

    for (int i = 0; i < (26*26*26); i++) {
      positions = MasterRotors.getPosition();
      testRotors.SetRotors(positions[0], positions[1], positions[2]);
      output = testRotors.runThrough(CompleteIn);

      // // // REMOVE SMARTNESS FROM BRUTE FORCE ATTACK
      // if (output.compareToIgnoreCase(saltIn) == 0) {
      System.out.println(output.substring(CompleteIn.length() - Salt.length(), CompleteIn.length()));
      if (output.substring(CompleteIn.length() - Salt.length(), CompleteIn.length()) == Salt) {
        testRotors.SetRotors(positions[0], positions[1], positions[2]);
        // int InWordLength = (26*26*26) - (CompleteIn.length() - Salt.length());
        for (int i2 = 0; i2 < CompleteIn.length(); i2++) { // go back string length 
          testRotors.RollRotors();
        }
        positions = testRotors.getPosition();

        System.out.print(positions[0] + " " + positions[1] + " " + positions[2] + " ");
        System.out.println(testRotors.runThrough(CompleteIn));
      }

      MasterRotors.RollRotors();
    } // FSHDXBCIJYXQEHJOQYBYZNXGTFOMPV DFSVLHBUKDJWVSA
    // System.out.println(positions[0] + " " + positions[1] + " " + positions[2]);
  }
}