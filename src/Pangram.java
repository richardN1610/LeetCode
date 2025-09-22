public class Pangram {

    public boolean checkIfPangram(String sentence) {
        int[] charArray = new int[26];

        for(int i =0;i<sentence.length();i++){
            charArray[sentence.charAt(i)-'a']++;
        }

        for(int i : charArray){
            if(i == 0){
                return  false;
            }
        }

        return true;
    }
}
