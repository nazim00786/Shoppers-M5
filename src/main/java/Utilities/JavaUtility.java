package Utilities;

public class JavaUtility {
	public int generateRandom(int range) {
		Random random = new Random(range);
		int ranNumber=random.nextInt();
		return ranNumber;

}
