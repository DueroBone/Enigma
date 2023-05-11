package enigma;

public class CodeCracker {
  Rollers MasterRotors = new Rollers();
  Rollers testRotors = new Rollers();
  for (int i = 0; i < (26*26*26); i++) {
    testRotors.SetRollers(MasterRotors.getPosition);
    // test
    // check
    // if good, i = (26*26*26)
    MasterRotors.RollRotors();
  }
  testRotors.SetRollers(MasterRotors.getPosition);
  System.out.println()
}