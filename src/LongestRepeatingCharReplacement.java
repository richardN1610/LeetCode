import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        Map<Character,Integer> charFreqMap = new HashMap<>();
        int maxFreq = 0;
        while(rightPointer < s.length()){
            char currentChar = s.charAt(rightPointer);
            charFreqMap.put(currentChar,charFreqMap.getOrDefault(currentChar,0)+1);
            maxFreq = Math.max(maxFreq,charFreqMap.get(currentChar));
            rightPointer++;
            while(rightPointer - leftPointer  - maxFreq > k){
                char leftChar = s.charAt(leftPointer);
                charFreqMap.put(leftChar,charFreqMap.get(leftChar)-1);
                leftPointer++;
            }
            answer = Math.max(answer,rightPointer - leftPointer);
        }
        return answer;
        //First we create two pointers, ans and a hashmap to keep track of all the characters and the number of frequency
        //maxFreq . what does this do?
        //we will keep iterating until rightPointer reaches the last character.
        //get the current character based on rightPointer and store it in the hashmap with it's frequency
        //get the current character's highest frequency and store it in maxFreq
        //if the window size minus maxFreq is bigger than k
        //we know that we have replaced all the characters
        //if thats the case, we will need to shrink the window by moving the leftPointer
        //we also need get the current leftPointer character and deduct its frequency by 1
        //then we get the answer by using max function base on current answer and current windows size.

        //if windows size minus character with the highest frequency > k
        //it means that it is invalid because if we have AABBA and k = 1
        //5 - 3 > 1? Yes, this is not allowed because it needs more than one character to replace.
        //windows size - maxFreq is basically to find how many characters we need to replace.
        //if the number of characters needed is more than k then its invalid, we will need to shrink the window from the left
        //until it becomes valid
        //in other word, we check how many the frequency of each character
        //if the window size is 5 and the string is AABABBB and k is 1
        //we know that if we have 2 B in the current window then it is not valid because we cannot replace 2 Bs with 2 As.
        //hence we need to use windows Size minus maxFreq to find the number of other characters
        //if the number of other characters in the window exceed k, it is invalid and we need to shrink the window
        //we also need to deduct it's frequency for leftPointer char because we are now no longer tracking it in the window size


    }
}
