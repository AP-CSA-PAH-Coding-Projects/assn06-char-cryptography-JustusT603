package apcsa.githubtrack;

public class CStringUtil
{
    public static Boolean isPalindrome(CString str)
    {
        // We're going to work inwards through the CString
        int start = 0;
        int end = str.getWord().length;

        while (start < end) // Loop through the Cstring
        {
            // Make sure both letters being compared are in lower case
            char leftChar = Character.toLowerCase(str.getWord()[start]);
            char rightChar = Character.toLowerCase(str.getWord()[end]);

            if (leftChar != ' ' && rightChar != ' ')
            {
                if (leftChar == rightChar)
                // if the opposite characters are equivalent, move on to the next characters
                {
                    start++;
                    end--;
                }
                else
                {
                    return false; // If the opposite characters are not equal, the word does not meet the 
                    // qualifications for being a palindrome and the method returns false.
                }
            }
            else if (leftChar == ' ') // Ignore space
            {
                start++;
            }
            else if (rightChar == ' ') // Ignore space
            {
                end--;
            }
        }
        return true; 
    }

    public static int[] toNumerical(CString str, int offset)
    {
        int[] nums = new int[str.getWord().length]; // Create an empty integer array the same size as str
        for (int i = 0; i < str.getWord().length; i++)
        {
            nums[i] = str.getWord()[i] + offset; // 
        }
        return nums;
    }

    public static int[] memeifyArray(int[] nums)
    {
        /*Returns a new array containing the same numbers in `nums`, but rearranged so that 
        **every 6 is immediately followed by a 7**. Do not move the 6's, 
        but every other number may move. The returned array must contain the same number of 6's and 7's, 
        and every 6 should have a number after it that is not a 6. 7's may appear anywhere 
        in the original array.*/

    }
}
