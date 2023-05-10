package enigma;

// 1 - EKMFLGDQVZNTOWYHXUSPAIBRCJ - R
// 2 - AJDKSIRUXBLHWTMCQGZNPYFVOE - F
// 3 - BDFHJLCPRTXVZNYEIWGAKMUSQO - W
public class Rotors {
  private class Rotor1 {
    int Position = 1;
    // E K M F L G D Q V Z N T O W Y H X U S P A I B R C J
    final int[] Pattern = { 4, 10, 12, 5, 11, 6, 3, 16, 21, 25, 13, 19, 14, 22, 24, 7, 23, 20, 18, 15, 0, 8, 1, 17, 2,
        9 };

    void setPosition(int input) {
      Position = input;
    }
  }

  private class Rotor2 {
    int Position = 1;
    // A J D K S I R U X B L H W T M C Q G Z N P Y F V O E
    final int[] Pattern = { 0, 9, 3, 10, 18, 8, 17, 20, 23, 1, 11, 7, 22, 19, 12, 2, 16, 6, 25, 13, 15, 24, 5, 21, 14,
        4 };

    void setPosition(int input) {
      Position = input;
    }
  }

  private class Rotor3 {
    int Position = 1;
    // B D F H J L C P R T X V Z N Y E I W G A K M U S Q O
    final int[] Pattern = { 1, 3, 5, 7, 9, 11, 2, 15, 17, 19, 23, 21, 25, 13, 24, 4, 8, 22, 6, 0, 10, 12, 20, 18, 16,
        14 };

    void setPosition(int input) {
      Position = input;
    }
  }

  Rotor1 m_rotor1 = new Rotor1();
  Rotor2 m_rotor2 = new Rotor2();
  Rotor3 m_rotor3 = new Rotor3();

  void RollRotors(Rotor1 InRotor1, Rotor2 InRotor2, Rotor3 InRotor3) {
    if (InRotor1.Position < 25) {
      InRotor1.setPosition(InRotor1.Position + 1);
    } else {
      InRotor1.setPosition(0);
      if (InRotor2.Position < 25) {
        InRotor2.setPosition(InRotor2.Position + 1);
      } else {
        InRotor2.setPosition(0);
        if (InRotor3.Position < 25) {
          InRotor3.setPosition(InRotor3.Position + 1);
        } else {
          InRotor3.setPosition(0);
        }
      }
    }
  }

  void SetRollers(int Pos1, int Pos2, int Pos3) {
    m_rotor1.Position = Pos1;
    m_rotor2.Position = Pos2;
    m_rotor3.Position = Pos3;
  }

  int RunThrough(int input) {
    int output = (m_rotor1.Pattern[(m_rotor2.Pattern[(m_rotor3.Pattern[(m_rotor3.Pattern[(m_rotor2.Pattern[(m_rotor1.Pattern[(input
        + m_rotor1.Position) % 26] + m_rotor2.Position) % 26] + m_rotor3.Position) % 26] + m_rotor3.Position) % 26]
        + m_rotor2.Position) % 26] + m_rotor1.Position) % 26]) % 26;
    RollRotors(m_rotor1, m_rotor2, m_rotor3);
    return output;
  }

  String getPosition(Rotor1 InRotor1, Rotor2 InRotor2, Rotor3 InRotor3) {
    return InRotor1.Position + " " + InRotor2.Position + " " + InRotor3.Position;
  }
}