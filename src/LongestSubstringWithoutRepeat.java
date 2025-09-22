import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {

    public int lengthOfLongestSubstring(String s) {

        //zxyzxyz -> zxy
        //in order to keep track of the characters, i would need some kind of data structure that detect duplicates.
        //in java, we can either use hash set/map or tree.
        //set would be the most appropriate selection for this problem.
        //creating a hashset to keep track of the characters in the string.

        //starting from the first index and if the character doesnt exist in the set, increase ans by 1 and add the character to the set.
        //iterating through the string's length using while loop
        int ans = 0;
        Set<Character> characterSet = new HashSet<>();
        int leftPointer = 0;
        int rightPointer = 0;
        while(rightPointer < s.length()){
            Character currentChar = s.charAt(rightPointer);
            if(!characterSet.contains(currentChar)){
                characterSet.add(currentChar);
                rightPointer++;
                ans = Math.max(ans, rightPointer - leftPointer);
            }else{
                characterSet.remove(s.charAt(leftPointer)); //removing it from left pointer to shrink the window
                //since we don't know where is the duplicate character.
                //by shrinking the left pointer, it will take us to the first duplicate value found.
                //There is no way duplicate is in front of right pointer
                leftPointer++;
            }
        }
        return ans;
    }
}
