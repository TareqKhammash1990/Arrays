package Arrays;


/**
 * Write a description of WordLengths here.
 * Word lengths
 * @author Tareq Khammash
 * @version (a version number or a date)
 */
import edu.duke.* ;
public class WordLengths 
{
    public void testCountWordLengths()
    {
        FileResource resource = new FileResource();
        int [] counts = new int [31];
        countWordLengths(resource, counts);
        //int [] values = new int [4];
        //int [] values = {400,1,12,0};
        int idx = indexOfMax(counts);
        System.out.println(idx);
    }
    public int indexOfMax(int [] values)
    {
        int index = 0;
        int max = 0 ;
        for (int k = 0; k < values.length; k++)
        {
            if(values[k] > max)
            {
                max = values[k];
                index = k;
            }
        }
        return index;
    }
    public void countWordLengths(FileResource resource, int [] counts)
    {
        int index = 0;
        String [] words= new String [50000];
        int [] counts2 = new int[50000];
        for (String word: resource.words())
        {
           words[index] = word; 
           for (int k=0; k< word.length(); k++)
           {
               char ch = word.charAt(k);
               if(Character.isLetter(ch) || ch == '\'' )
               {
                  counts2[index]++;
               }
           }
           counts[counts2[index]]++;
           //counts[counts[index]]++;
           //System.out.println(words2[counts[index]]);
           //System.out.println(words[index]+ " "+index+" "+ "The length of word is " + counts[index]);
           index++;
        }
        for(int k=0; k< counts.length; k++)
        {
            if(counts[k] > 0)
            {
                System.out.println(counts[k]+ " words of length "+ k);
            }
        }
        //for(int k = 0; k< counts.length; k++)
        //{
        //    System.out.println("word length is " + counts[k] + " the word is " + words[k]);
        //}
    }
}