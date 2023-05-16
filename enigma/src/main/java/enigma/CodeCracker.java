package enigma;


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

      // System.out.println(output.substring(CompleteIn.length() - Salt.length(), CompleteIn.length()));
      if (output.compareToIgnoreCase(saltIn) == 0) {
        testRotors.SetRotors(positions[0], positions[1], positions[2]);
        testRotors = reverseRotors(testRotors);
        int InWordLength = (26*26*26) - (CompleteIn.length() - Salt.length());
        for (int i2 = 0; i2 < InWordLength; i2++) { // go back string length 
          testRotors.RollRotors();
        }
        positions = testRotors.getPosition();

        System.out.print(positions[0] + " " + positions[1] + " " + positions[2] + " "); 
        System.out.println(testRotors.runThrough(CompleteIn));
      }

      MasterRotors.RollRotors();
    }
  }

  static void reverseRotors(Rotors rotorsIn) {
    int[] origPatt;
    origPatt = rotorsIn.R1.Pattern;
    for (int i = 0; i < origPatt.length; i++) {
      rotorsIn.R1.Pattern[origPatt[i]] = i;
    }

    origPatt = rotorsIn.R2.Pattern;
    for (int i = 0; i < origPatt.length; i++) {
      rotorsIn.R2.Pattern[origPatt[i]] = i;
    }
    origPatt = rotorsIn.R3.Pattern;
    for (int i = 0; i < origPatt.length; i++) {
      rotorsIn.R3.Pattern[origPatt[i]] = i;
    }
  }
  return rotorsIn;
}