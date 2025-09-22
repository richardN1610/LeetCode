public class MaxNumberOfWordsInAString {

    public int mostWordsFound(String[] sentences) {
        int answer = 1;
        if(sentences.length == 0){
            return 0;
        }
        for (String sentence : sentences) {
            int counter = 1;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    counter++;
                }
            }
            answer = Math.max(counter, answer);
        }
        return answer;
    }
}
