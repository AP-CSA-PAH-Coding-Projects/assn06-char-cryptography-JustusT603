package apcsa.githubtrack;

// Implement your CString class here
public class CString // Class header
{
    private int length;
    private String[] word;
    
    // Accessor Methods
    public int getLength()
    {
        return this.length;
    }

    public String[] getCString()
    {
        return this.word;
    }

    public CString(String str) // Object constructor
    {
        String[] cstring = new String[str.length()]; // Initialize an array of size str
        for (int i=0; i<str.length() - 1; i++)
        {
            cstring[i] = str.substring(i, i+1); // Add each character to the array
        }
        this.length = cstring.length;
        this.word = cstring;
    }

    // Method/behavior 1: reversing the characters in the CString parameter
    public void reverse(CString str)
    {
        // Use an array reversal algorithm with a temp variable
        int start = 0;
        int end = str.length - 1;
        
        while (start < end) // The loop swaps the first and last elements in the array and works inward
        {
            String temp = str.word[start];
            str.word[start] = str.word[end];
            str.word[end] = temp;
            
            start++;
            end--;
        }
    }

    // Method/behavior 2: Sorting the characters in ascending alphabetical order using Selection Sort
    public void sortAscending(CString str)
    {
        for (int j = 0; j < str.length - 1; j++) // loop through all the characters in the CString
        {
            int minIndex = j;
            for (int k = j + 1; k < str.length; k++) 
            {
                if (str.word[k].compareTo(str.word[minIndex]) < 0) 
                // If the character at k is lexicographically less than the one at minIndex...
                {
                    minIndex = k; // Move the minIndex to index k
                }
            }
            // Swap the elements at j and minIndex
            String temp = str.word[j];
            str.word[j] = str.word[minIndex];
            str.word[minIndex] = temp;
        }
    }

    // Method/behavior 3: Sorting the characters in descending alphabetical order using Selection Sort
    public void sortDescending(CString str)
    {
        for (int j = 0; j < str.length - 1; j++) // loop through all the characters in the CString
        {
            int minIndex = j;
            for (int k = j + 1; k < str.length; k++) 
            {
                if (str.word[k].compareTo(str.word[minIndex]) > 0) 
                // If the character at k is lexicographically more than the one at minIndex...
                {
                    minIndex = k; // Move the minIndex to index k
                }
            }
            // Swap the elements at j and minIndex
            String temp = str.word[j];
            str.word[j] = str.word[minIndex];
            str.word[minIndex] = temp;
        }
    }
}