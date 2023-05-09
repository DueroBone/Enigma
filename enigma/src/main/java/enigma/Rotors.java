package enigma;
// 1 - EKMFLGDQVZNTOWYHXUSPAIBRCJ - R
// 2 - AJDKSIRUXBLHWTMCQGZNPYFVOE - F
// 3 - BDFHJLCPRTXVZNYEIWGAKMUSQO - W
public class Rotors {
  class Rotor1 {
    String Positon = "A";
    char[] Pattern = "EKMFLGDQVZNTOWYHXUSPAIBRCJ".toCharArray();
  }
  class Rotor2 {
    String Positon = "A";
    char[] Pattern = "AJDKSIRUXBLHWTMCQGZNPYFVOE".toCharArray();
  }
  class Rotor3 {
    String Positon = "A";
    char[] Pattern = "BDFHJLCPRTXVZNYEIWGAKMUSQO".toCharArray();
  }
  Rotor1 A = new Rotor1();
  Rotor2 B = new Rotor2();
  Rotor3 C = new Rotor3();
}