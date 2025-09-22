public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            if(sb.toString().equals(word)){
                return word;
            }
        }
        return "";
    }
}
