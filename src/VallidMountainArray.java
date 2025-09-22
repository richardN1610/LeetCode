public class VallidMountainArray {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        boolean ans = validMountainArray(arr);

        System.out.println(ans);
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3 ) return false;

        boolean isUp = true;

        int temp = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i] == temp) return  false;
            if(isUp){
                if(arr[i] > temp){
                    temp = arr[i];
                }else{
                    if(i == 1){ //means there's no going up at all, it already dropped from the second index.
                        return false;
                    }
                    isUp = false;
                    temp = arr[i];
                }
            }else{
                if(arr[i] > temp){
                    return false;
                }
                temp = arr[i];
            }
        }

        return !isUp;
        //[1,2,3,2,1]
//        int n = arr.length;
//        if (n < 3) return false;
//
//        int i = 1;
//
//        // walk up
//        while (i < n && arr[i] > arr[i - 1]) i++;
//
//        // only go up, no going down, hence invalid mountain
//        if (i == 1 || i == n) return false;
//
//        // walk down
//        while (i < n && arr[i] < arr[i - 1]) i++;
//         //if i == n which means that the number of steps taken are the same as the length. Hence its a valid mount
        //else if the number of steps (i) is not the same as array length then its not valid because one step must have been skipped from the while loop
//        return i == n;
    }
}
