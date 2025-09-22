public class DiffSum {
    public static void main(String[] args) {
        int[] nums = {12,97,48,72,31,70,1,9,78,28,1,30,82,17,43,44,53,12,73,16,74,24,79,9,51,77,36,38,81,38,69,60,29,21,66,6,62,55,13,90,66,7,15,15,60,76,44,30,6,86,87,59,88,36,32,35,67,13,79,43,27,2,97,41,4,44,91,11,5,48,38,64,9,90,39,28,50,57,60,4,99,44,39,12,95,32,66,100,45,42,22,35,65,7,49,43,41,40,64,78};
        int ans = differenceOfSum(nums);
        System.out.println(ans);
    }
    public static int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num : nums){
            sum1+=num;

            if (num >= 10){
                while (num > 0) {
                    int digit = num % 10;
                    sum2 += digit;
                    num /= 10;
                }
            }else{
                sum2+= num;
            }

        }
        return sum1 - sum2;
    }
}
