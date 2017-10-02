import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	// roll the die and return the value (1-6)
	private int roll() {
		return (int) ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}

	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
	// first param is the int to look for and second is amount of tests
	protected int collector(int n, int times) {
		int collection = 0;
		for (int i=0; i<times; i++) {
			if(roll() == n) {
				collection++;
			}
		}
		return collection;
	}

}
