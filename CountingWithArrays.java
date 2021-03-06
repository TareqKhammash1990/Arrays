package Arrays;


/**
 * Write a description of CountingWIthArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class CountingWithArrays 
{
    String [] getCommon()
    {
        FileResource resource = new FileResource("C:\\Users\\USER\\Desktop\\online certificates\\duke university\\Java\\Arrays\\common.txt");
        String [] common = new String [20];
        int index = 0;
        for(String word: resource.words())
        {
            common[index] = word;
            index++;
        }
        return common;
    }
    public int indexOf(String[] list, String word)
    {
        for(int k=0; k<list.length ; k++)
        {
            if(list[k].equals(word))
            {
                return k;
            }
        }
        return -1;
    }
    public void countWords(FileResource resource, String[] common, int[] counts)
    {
        for(String word: resource.words())
        {
            word = word.toLowerCase();
            int index = indexOf(common,word);
            if(index != -1)
            {   
                counts[index]++;
            }
        }
        
    }
    public void countShakespear()
    {
        String [] plays = {"caesar.txt","hamlet.txt","macbeth.txt",
            "romeo.txt", "errors.txt", "likeit.txt", "small.txt"};
        String [] common = getCommon();
        int[] counts = new int[common.length];
        for (int k = 0; k< plays.length ; k++ )
        {
            FileResource fr = new FileResource("C:\\Users\\USER\\Desktop\\online certificates\\duke university\\Java\\Arrays\\" + plays[k]);
            countWords(fr,common,counts);
            System.out.println("done with " + plays[k]);
        }
        for (int k =0; k< common.length; k++) 
        {
            System.out.println(common[k] + "\t" + counts[k]);
        }
    }
}
