import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] arr = {1,2,9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        boolean canAddOne = true;
        for(int i = digits.length-1; i >= 0; i--){
            if(canAddOne){
                int newValue = (digits[i] + 1) % 10;
                digits[i] = newValue;
                if(newValue != 0){
                    canAddOne = false;
                }
            }
        }
        int arrSize = digits.length;
        if(digits[0] == 0){
            arrSize+=1;
        }

        int[] ans = new int[arrSize];

        for(int i = 0;i < ans.length;i++){
            if (digits[0] == 0){
                if(i > 0){
                    ans[i] = digits[i-1];
                }else{
                    ans[0] = 1;
                }
            }else{
                ans[i] = digits[i];
            }
        }

        return ans;
    }
}
