
public class FlowersBed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You have a long flowerbed in which some of the plots are planted, and some
		 * are not. However, flowers cannot be planted in adjacent plots.
		 * 
		 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
		 * and 1 means not empty, and an integer n, return if n new flowers can be
		 * planted in the flowerbed without violating the no-adjacent-flowers rule.
		 * 
		 * Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: true Example 2:
		 * Input: flowerbed = [1,0,0,0,1], n = 2 Output: false
		 */
		int a[] = { 0, 0, 1, 0, 0 };
		int n = 2;
		boolean canPlaced = canPlaceFlowers2(a, n);
		System.out.println(canPlaced);
	}

	// Initial solution
	public static boolean canPlaceFlowers(int[] flowersbed, int n) {
		int counter = 0;
		/*
		 *Knowing that, if i = 0 then i - 1 AND i + 1 must = 0 to be able to make i =1
		 *Creating two varaibles prev & next to check to seee if they're also 0
		 *If I = && prev == 0 && next == 0. Then assign i = 1 and increment counter by 1
		 *To prevent index out of bound with error with  next, assign i = length-1
		 *return true or false base on counter compared to n 
		 */
		for (int i = 0; i < flowersbed.length; i++) {
			if (flowersbed[i] == 0) {
				int prevSpot = (i == 0 || flowersbed[i - 1] == 0) ? 0 : 1;
				int nextSpot = (i == flowersbed.length - 1 || flowersbed[i + 1] == 0) ? 0 : 1;
				if (prevSpot == 0 && nextSpot == 0) {
					flowersbed[i] = 1;
					counter++;
				}
			}
		}
		return counter >= n;
	}

	//second solution
	/*
	 * Knowing that if i == 1 then the next spot cannot be used
	 * Increment i by one so it skips the next spot
	 */
	public static boolean canPlaceFlowers2(int[] flowersbed, int n) {
		if (flowersbed.length == 0 || flowersbed == null)
			return false;
		int counter = 0;
		for (int i = 0; i < flowersbed.length; i++) {
			if (flowersbed[i] == 1) {
				i++; // if spot already taken we move to the next spot
				continue;
			}
			int prevSpot = (i == 0 || flowersbed[i - 1] == 0) ? 0 : 1;
			int nextSpot = (i == flowersbed.length - 1 || flowersbed[i + 1] == 0) ? 0 : 1;
			if (flowersbed[i] == 0 && prevSpot == 0 && nextSpot == 0) {
				counter++;
				i++;
			}
		}
		return counter >= n;
	}

}
