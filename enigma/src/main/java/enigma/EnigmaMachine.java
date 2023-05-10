package enigma;

public class EnigmaMachine {
    public static void runStuff() {
      Rotors m_rotors = new Rotors();
      EnigmaMachine m_enigmaMachine = new EnigmaMachine();
      for (int i = 0; i < (26*26*26*5); i++) {
        System.out.print(m_rotors.getPosition(m_rotors.m_rotor1, m_rotors.m_rotor2, m_rotors.m_rotor3) + " | ");
        System.out.println(m_enigmaMachine.intToChar(m_rotors.RunThrough(m_enigmaMachine.charToInt('A'))));
      }
    }

  char intToChar(int input) {
    input = input % 26;
    if (input == 0) {
      return 'A';
    } else if (input == 1) {
      return 'B';
    } else if (input == 2) {
      return 'C';
    } else if (input == 3) {
      return 'D';
    } else if (input == 4) {
      return 'E';
    } else if (input == 5) {
      return 'F';
    } else if (input == 6) {
      return 'G';
    } else if (input == 7) {
      return 'H';
    } else if (input == 8) {
      return 'I';
    } else if (input == 9) {
      return 'J';
    } else if (input == 10) {
      return 'K';
    } else if (input == 11) {
      return 'L';
    } else if (input == 12) {
      return 'M';
    } else if (input == 13) {
      return 'N';
    } else if (input == 14) {
      return 'O';
    } else if (input == 15) {
      return 'P';
    } else if (input == 16) {
      return 'Q';
    } else if (input == 17) {
      return 'R';
    } else if (input == 18) {
      return 'S';
    } else if (input == 19) {
      return 'T';
    } else if (input == 20) {
      return 'U';
    } else if (input == 21) {
      return 'V';
    } else if (input == 22) {
      return 'W';
    } else if (input == 23) {
      return 'X';
    } else if (input == 24) {
      return 'Y';
    } else if (input == 25) {
      return 'Z';
    } else {
      return ' ';
    }
  }

  int charToInt(char input) {
    if (input == 'A') {
      return 0;
    } else if (input == 'B') {
      return 1;
    } else if (input == 'C') {
      return 2;
    } else if (input == 'D') {
      return 3;
    } else if (input == 'E') {
      return 4;
    } else if (input == 'F') {
      return 5;
    } else if (input == 'G') {
      return 6;
    } else if (input == 'H') {
      return 7;
    } else if (input == 'I') {
      return 8;
    } else if (input == 'J') {
      return 9;
    } else if (input == 'K') {
      return 10;
    } else if (input == 'L') {
      return 11;
    } else if (input == 'M') {
      return 12;
    } else if (input == 'N') {
      return 13;
    } else if (input == 'O') {
      return 14;
    } else if (input == 'P') {
      return 15;
    } else if (input == 'Q') {
      return 16;
    } else if (input == 'R') {
      return 17;
    } else if (input == 'S') {
      return 18;
    } else if (input == 'T') {
      return 19;
    } else if (input == 'U') {
      return 20;
    } else if (input == 'V') {
      return 21;
    } else if (input == 'W') {
      return 22;
    } else if (input == 'X') {
      return 23;
    } else if (input == 'Y') {
      return 24;
    } else if (input == 'Z') {
      return 25;
    } else {
      return 0;
    }
  }
}