package Arrays;


/**
 * Write a description of RandomNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class RandomNumbers 
{
    public void simulate(int rolls)
    {
        Random rand = new Random();
        int [] counts = new int [13];
        
        for (int k =0; k< rolls; k++)
        {
            int d1 = rand.nextInt(6) +1;
            int d2 = rand.nextInt(6) +1;
            System.out.println(d1+ " " + d2+ " " + (d1+d2));
            counts[d1+d2]++;
        }
        for(int k =2; k<=12; k++)
        {
            System.out.println(k +"'s=\t" + counts[k] + "\t" + 100* counts[k]/rolls);
        }
    }
}
