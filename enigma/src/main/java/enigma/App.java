package enigma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rotors m_rotors = new Rotors();
        for (int i = 0; i<m_rotors.A.Pattern.length; i++) {
            System.out.print(m_rotors.A.Pattern[i] + " ");
        }
    }
}
