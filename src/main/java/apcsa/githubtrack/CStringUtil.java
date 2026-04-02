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
        return true; // if there are no opposite characters that are unequal, it is a palindrome
    }

    public static int[] toNumerical(CString str, int offset)
    {
        int[] nums = new int[str.getWord().length]; // Create an empty integer array the same size as str
        for (int i = 0; i < str.getWord().length; i++)
        {
            nums[i] = str.getWord()[i] + offset; // the character is automatically casted into an int value
            // the int value is then modified by the offset value
        }
        return nums;
    }

    public static int maxMirror(CString str)
    {
        int maxLength = 0;
        int currentLength = 0;

        // Make an array of integers that represents the CString parameter
        int[] numerical = toNumerical(str, 0);

        // Loop through the original array
        for (int i = 0; i < str.getWord().length; i++)
        {
            int j = i+1;
            if (numerical[j] == numerical[i] + 1) // If adjacent values are ascending
            {
                currentLength++; // Increment the current run length
                if (currentLength > maxLength) // If the current run length is greater than the max run length
                {
                    maxLength = currentLength; // Update the max run length
                }
            }
            else if (numerical[j] == numerical[i] - 1) // If adjcaent values are descending
            {
                currentLength++; // Increment the current run length
                if (currentLength> maxLength) // If the current run length is greater than the max run length
                {
                    maxLength = currentLength; // Update the max run length
                }
            }
            else if (numerical[j] == numerical[i]) // If the adjcent values are equal,
            {
                if (numerical[j+1] == numerical[i]) // Check if they go back down (mirror)
                {
                    currentLength++; // Increment the current run length
                    if (currentLength > maxLength) // If the current run length is greater than the max run length
                    {
                        maxLength = currentLength; // Update the max run length
                    }
                }
            }
        }

        return maxLength;
    }

    public static int maxMirror(int[] nums)
    {
        int maxLength = 0;
        int currentLength = 0;

        // Loop through the original array
        for (int i = 0; i < nums.length; i++)
        {
            int j = i+1;
            if (nums[j] == nums[i] + 1) // If adjacent values are ascending
            {
                currentLength++; // Increment the current run length
                if (currentLength > maxLength) // If the current run length is greater than the max run length
                {
                    maxLength = currentLength; // Update the max run length
                }
            }
            else if (nums[j] == nums[i] - 1) // If adjcaent values are descending
            {
                currentLength++; // Increment the current run length
                if (currentLength> maxLength) // If the current run length is greater than the max run length
                {
                    maxLength = currentLength; // Update the max run length
                }
            }
            else if (nums[j] == nums[i]) // If the adjcent values are equal,
            {
                if (nums[j+1] == nums[i]) // Check if they go back down (mirror)
                {
                    currentLength++; // Increment the current run length
                    if (currentLength > maxLength) // If the current run length is greater than the max run length
                    {
                        maxLength = currentLength; // Update the max run length
                    }
                }
            }
        }

        return maxLength;
    }

    public static int[] memeifyArray(int[] nums)
    {
        
    }

    public static boolean nestedSequence(CString outer, CString inner)
    {

    }

    public static CString decrypt(CString str)
    {
        
    }
}
