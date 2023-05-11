package enigma;

public class EnigmaMachine {
    public static void runStuff() {
      Rotors m_rotors = new Rotors();
      // EnigmaMachine m_enigmaMachine = new EnigmaMachine();
      System.out.println(runThrough("Words", m_rotors));
      /*
      for (int i = 0; i < (26*26*26*5); i++) {
        System.out.print(m_rotors.getPosition(m_rotors.m_rotor1, m_rotors.m_rotor2, m_rotors.m_rotor3) + " | ");
        System.out.println(m_enigmaMachine.intToChar(m_rotors.RunThrough(m_enigmaMachine.charToInt('A'))));
        // String helloWorld = "hello";
        // helloWorld.contains("loo");
      }
      */
    }

  String runThrough(String input, Rotors InRotors) {

    char[] var = input.toUpperCase().toCharArray();
    String output = "";
    for (int i = 0; i < var.length; i++) {
      if (var[i] != " ") {
        output += InRotors.intToChar(InRotors.RunThrough(InRotors.charToInt(var[i]))); // run machine
      } else {
        output += " ";
      }
    }
    return output;
  }
}