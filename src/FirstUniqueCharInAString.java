public class FirstUniqueCharInAString {

    public static void main(String[] args) {
        int ans = firstUniqChar("leetcode");
        System.out.println(ans);
    }
    public static int firstUniqChar(String s) {

        //loveleetcode -> first unique is v
        int[] charArray = new int[26];
        for(char c : s.toCharArray()){
            //where 'a'  = 97 and c = whatever value the current char is and store it in the array.
            charArray[c-'a']++;
        }
        for(int i = 0; i< s.length();i ++){
            if(charArray[s.charAt(i)-'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
