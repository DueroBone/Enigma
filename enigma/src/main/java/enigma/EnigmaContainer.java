package enigma;

public class EnigmaContainer {
  public static void runStuff() {
    Rotors m_rotors = new Rotors();
    EnigmaMachine m_enigmaMachine = new EnigmaMachine();
    for (int i = 0; i < (26*26*26*5); i++) {
      m_enigmaMachine.intToChar(m_rotors.RunThrough(m_enigmaMachine.charToInt('A')));
    }
  }
}