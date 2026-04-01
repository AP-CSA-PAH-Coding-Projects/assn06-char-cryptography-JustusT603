package apcsa.githubtrack;

public class CString // Class header
{
    private char[] word;
    
    // Accessor Method
    public char[] getWord()
    {
        return this.word;
    }

    public CString(String str) // Object constructor
    {
        char[] cstring = new char[str.length()]; // Initialize an array of size str so each item can be one character of the string parameter
        for (int i=0; i<str.length(); i++)
        {
            cstring[i] = str.charAt(i); // Add each character to the array
        }
        this.word = cstring;
    }

    // Method/behavior 1: reversing the characters in the CString parameter
    public void reverse()
    {
        // Use an array reversal algorithm with a temp variable
        // Start at the endpoints of the array
        int start = 0; 
        int end = this.word.length - 1;
        
        while (start < end) // The loop swaps the first and last elements in the array and then works inward
        {
            char temp = this.word[start];
            this.word[start] = this.word[end];
            this.word[end] = temp;
            
            start++;
            end--;
        }
    }

    // Method/behavior 2: Sorting the characters in ascending alphabetical order using Selection Sort
    public void sortAscending()
    {
        for (int j = 0; j < this.word.length - 1; j++) // loop through all the characters in the CString
        {
            int minIndex = j;
            for (int k = j + 1; k < this.word.length; k++) // loop through the rest of the characters
            {
                // If the character in question is lexicographically less than the character at the minIndex...
                if (this.word[k] < this.word[minIndex]) 
                {
                    minIndex = k; // Move the minIndex to index k
                }
            }
            // Swap the elements at j and minIndex
            char temp = this.word[j];
            this.word[j] = this.word[minIndex];
            this.word[minIndex] = temp;
        }
    }

    // Method/behavior 3: Sorting the characters in descending alphabetical order using Selection Sort
    public void sortDescending()
    {
        for (int j = 1; j < this.word.length; j++)
        {
            char temp = this.word[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < this.word[possibleIndex - 1])
            {
                this.word[possibleIndex] = this.word[possibleIndex - 1];
                possibleIndex--;
            }
            this.word[possibleIndex] = temp;
        }
    }
}