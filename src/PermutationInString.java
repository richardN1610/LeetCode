import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "acb";
        String s2 = "lecaabee";
        boolean answer = checkInclusion(s1,s2);
        System.out.println(answer);
    }
    public static boolean checkInclusion(String s1, String s2) {
        int windowSize = s1.length();
        //we have a fix windows size of s1.length()
        //need to use hashmap to count?

        Map<Character,Integer> charMap = new HashMap<>();
        //store char from s1 in hashmap
        for(Character character : s1.toCharArray()){
            charMap.put(character,charMap.getOrDefault(character,0)+1);
        }


        //since the hashmap has ACB
        //if it matches then move left Pointer
        //else move forward
        //start with lec -> l e doesnt match but c matches
        //if left Pointer doesnt match -> move window forward

        int leftPointer = 0;
        int rightPointer = s1.length()-1;
        while(leftPointer != rightPointer){

        }

        return false;
    }
}
