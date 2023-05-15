package enigma;

// import java.util.Scanner;

public class CodeCracker {
  public static void crackIt() {
    Rotors MasterRotors = new Rotors();
    Rotors testRotors = new Rotors();
    int[] positions = MasterRotors.getPosition();

    final String CompleteIn = EnigmaContainer.Input;
    final String Salt = EnigmaContainer.salt;
    final String saltIn = CompleteIn.substring(CompleteIn.length() - Salt.length());
    String output = "";

    MasterRotors.SetRotors(0, 0, 0);

    for (int i = 0; i < (26*26*26); i++) {
      positions = MasterRotors.getPosition();
      testRotors.SetRotors(positions[0], positions[1], positions[2]);
      output = testRotors.runThrough(Salt);

      // // // REMOVE SMARTNESS FROM BRUTE FORCE ATTACK
      // System.out.println(output.substring(CompleteIn.length() - Salt.length(), CompleteIn.length()));
      if (output.compareToIgnoreCase(saltIn) == 0) {
        testRotors.SetRotors(positions[0], positions[1], positions[2]);
        int InWordLength = (26*26*26) - (CompleteIn.length() - Salt.length());
        for (int i2 = 0; i2 < InWordLength; i2++) { // go back string length 
          testRotors.RollRotors();
        }
        positions = testRotors.getPosition();

        System.out.println(positions[0] + " " + positions[1] + " " + positions[2] + " "); // was print
        // System.out.println(testRotors.runThrough(CompleteIn));
      }

      MasterRotors.RollRotors();
    } // FSHDXBCIJYXQEHJOQYBYZNXGTFOMPV DFSVLHBUKDJWVSA
    // System.out.println(positions[0] + " " + positions[1] + " " + positions[2]);
  }
}