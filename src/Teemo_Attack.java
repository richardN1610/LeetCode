
public class Teemo_Attack {

	public static void main(String[] args) {
		int array[] = {1,3,7};
		int duration = 4;
		int time = findPoisonedDuration(array,duration);
		
		//first second attack > duration is 4 so expect to go to 4
		//1 ,2 but at 3 second teemo attack again. > total timer should start again  . current totaltimer is 2
		//from 3 seconds > 3 ,4 ,5 ,6
		//at 7second attack again and no more attack after 7 so 4 + 4 +2 = 10
		//to get 2 seconds from we have array[i] - array[i-1] = 2 > assign total timer to this.
		//if array[i] - array[i-1] Which is the previous attack is smaller than the duration then we need to reset
		//else we let the duration finish and move on to the next attack
	}

	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		int totalTime = 0;

		for(int i = 1; i < timeSeries.length; i++) {
			if(timeSeries[i] - timeSeries[i-1] < duration) {
				totalTime += timeSeries[i] - timeSeries[i-1];
			}else {
				totalTime += duration;
			}
		}
		return totalTime+duration;
	}
}
