package Arrays;


/**
 * Write a description of Decryption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Decryption 
{
    
    public void Counter(String message)
    {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int [] counts = new int[26];
        for (int k=0; k < message.length(); k++)
        {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if (dex != -1)
            {
                counts[dex]++;
            }
        }
    }
}

