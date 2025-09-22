import java.util.Arrays;

public class MinEatingSpeed {
    //h is the maximum number of hours
    //piles[i] where i = number of bananas in each pile
    public int solution(int[] piles, int h) {
        //h is maximum number of hours
        //piles -> number of bananas in each pile
        //1,2,3,4 h=9 ans = 2

        //start binary search at mid and the value = 3 (assuming koko can eat 3 bananas per hour)
        //if mid > piles[i] -> hr need ++
        //if mid (number of bananas can be eaten per hour) is smaller than piles value.
        //piles[i] % mid == 0 ->  i/mid else i/mid + 1;
        //if the total number of hours need > h -> break out of the current iteration and move to the next mid.

        //3,6,7,11 , h=8 ans = 4
        //therefore we need to iterate through the actual value rather than the size

        if(h<piles.length)return -1;
        int low = 0;
        int high = piles.length -1;
        int minK = piles[piles.length-1];
        Arrays.sort(piles);

        //brute force approach
        for(int i = 1; i< piles[piles.length-1];i++){
            int hrs = 0;
            for(int j = 0 ; j< piles.length;j++){
                if(i >= piles[j]){
                    hrs++;
                }else{
                    if(piles[j]%i==0){
                        hrs += piles[j]/i;
                    }else{
                        hrs+= piles[j]/i+1;
                    }
                }
                if(hrs > h){
                    continue;
                }
            }
            minK = Math.min(minK,i);
        }
        return minK;
    }
}
