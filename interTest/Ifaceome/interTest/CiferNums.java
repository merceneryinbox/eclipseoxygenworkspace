package interTest;

public class CiferNums {
    public static int givenNumber = 654649871;

    public static void main(String[] args) {
	int numOrder = 1_000_000_000;
	int levelCounter = 0;
	int tempInt = givenNumber;
	int r = 10;

	// find greater level of number
	while (tempInt > 0) {
	    tempInt = tempInt - (tempInt % r);
	    r = r * 10;
	    levelCounter++;
	}
	System.out.println(levelCounter);
    }
}
