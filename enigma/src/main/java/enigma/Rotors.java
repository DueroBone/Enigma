package enigma;

// 1 - EKMFLGDQVZNTOWYHXUSPAIBRCJ - R
// 2 - AJDKSIRUXBLHWTMCQGZNPYFVOE - F
// 3 - BDFHJLCPRTXVZNYEIWGAKMUSQO - W
public class Rotors {
  private class Rotor1 {
    int Position = 0;
    // E K M F L G D Q V Z N T O W Y H X U S P A I B R C J
    int[] Pattern = { 4, 10, 12, 5, 11, 6, 3, 16, 21, 25, 13, 19, 14, 22, 24, 7, 23, 20, 18, 15, 0, 8, 1, 17, 2,
        9 };

    void setPosition(int input) {
      Position = input;
    }
  }

  private class Rotor2 {
    int Position = 0;
    // A J D K S I R U X B L H W T M C Q G Z N P Y F V O E
    int[] Pattern = { 0, 9, 3, 10, 18, 8, 17, 20, 23, 1, 11, 7, 22, 19, 12, 2, 16, 6, 25, 13, 15, 24, 5, 21, 14,
        4 };

    void setPosition(int input) {
      Position = input;
    }
  }

  private class Rotor3 {
    int Position = 0;
    // B D F H J L C P R T X V Z N Y E I W G A K M U S Q O
    int[] Pattern = { 1, 3, 5, 7, 9, 11, 2, 15, 17, 19, 23, 21, 25, 13, 24, 4, 8, 22, 6, 0, 10, 12, 20, 18, 16,
        14 };

    void setPosition(int input) {
      Position = input;
    }
  }

  Rotor1 R1 = new Rotor1();
  Rotor2 R2 = new Rotor2();
  Rotor3 R3 = new Rotor3();

  void RollRotors() {
    if (R1.Position < 25) {
      R1.setPosition(R1.Position + 1);
    } else {
      R1.setPosition(0);
      if (R2.Position < 25) {
        R2.setPosition(R2.Position + 1);
      } else {
        R2.setPosition(0);
        if (R3.Position < 25) {
          R3.setPosition(R3.Position + 1);
        } else {
          R3.setPosition(0);
        }
      }
    }
  }

  void SetRotors(int Pos1, int Pos2, int Pos3) {
    R1.Position = Pos1;
    R2.Position = Pos2;
    R3.Position = Pos3;
  }

  private int RunLetThrough(int input) {
    int output = (R1.Pattern[(R2.Pattern[(R3.Pattern[(R3.Pattern[(R2.Pattern[(R1.Pattern[(input + R1.Position) % 26]
        + R2.Position) % 26]
        + R3.Position) % 26]
        - R3.Position + 26) % 26]
        - R2.Position + 26) % 26]
        - R1.Position + 26) % 26]) % 26;
    return output;
  }

  String runThrough(String input) {
    char[] var = input.toUpperCase().toCharArray();
    String output = "";
    for (int i = 0; i < var.length; i++) {
      if (var[i] != ' ') {
        output += intToChar(RunLetThrough(charToInt(var[i]))); // run machine
      } else {
        output += " ";
      }
      RollRotors();
    }
    return output;
  }

  int[] getPosition() {
    int[] positions = { R1.Position, R2.Position, R3.Position };
    return positions;
  }

  private char intToChar(int input) {
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

  private int charToInt(char input) {
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