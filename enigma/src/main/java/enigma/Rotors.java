package enigma;

// 1 - EKMFLGDQVZNTOWYHXUSPAIBRCJ - R
// 2 - AJDKSIRUXBLHWTMCQGZNPYFVOE - F
// 3 - BDFHJLCPRTXVZNYEIWGAKMUSQO - W
public class Rotors {
  static class Rotor1 {
    static int intPosition = 1;
    static char Positon = (char) (intPosition + '@');
    char[] Pattern = "EKMFLGDQVZNTOWYHXUSPAIBRCJ".toCharArray();

    static void setPosition(int input) {
      intPosition = input;
      Positon = (char) (intPosition + '@');
    }
  }

  static class Rotor2 {
    static int intPosition = 1;
    static char Positon = (char) (intPosition + '@');
    char[] Pattern = "AJDKSIRUXBLHWTMCQGZNPYFVOE".toCharArray();

    static void setPosition(int input) {
      intPosition = input;
      Positon = (char) (intPosition + '@');
    }
  }

  static class Rotor3 {
    static int intPosition = 1;
    static char Positon = (char) (intPosition + '@');
    char[] Pattern = "BDFHJLCPRTXVZNYEIWGAKMUSQO".toCharArray();

    static void setPosition(int input) {
      intPosition = input;
      Positon = (char) (intPosition + '@');
    }
  }

  Rotor1 rotor1 = new Rotor1();
  Rotor2 rotor2 = new Rotor2();
  Rotor3 rotor3 = new Rotor3();

  void RollRotors() {
    if (Rotor1.intPosition != 26) {
      Rotor1.setPosition(Rotor1.intPosition + 1);
    } else {
      Rotor1.setPosition(1);
      if (Rotor1.intPosition != 26) {
        Rotor1.setPosition(Rotor1.intPosition + 1);
      } else {
        Rotor1.setPosition(1);
      }
    }
  }

  void SetRollers(char Pos1, char Pos2, char Pos3) {
    Rotor1.Positon = Pos1;
    Rotor2.Positon = Pos2;
    Rotor3.Positon = Pos3;
  }
}