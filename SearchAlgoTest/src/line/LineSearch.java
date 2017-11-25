/**
 * 
 */
package line;

import java.util.Arrays;

/**
 * @author mercenery
 *
 */
public class LineSearch {

    /**
     * 
     */
    public LineSearch() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// ������ ������
	int[] mass = new int[1000];

	// ��������� ������

	for (int i = 0; i < mass.length; i++) {
	    mass[i] = (int) ((Math.random() + 1) * 100);
	}
	System.out.println(Arrays.toString(mass));

	// ���� ��������� ����� � �������� ����� ��� � �������

	int randomInt = (int) ((Math.random() + 1) * 100);

	int[] matchMass = search(randomInt, mass);
	int macthScore = matchMass.length;

	if (macthScore > 0) {
	    if (macthScore == 1) {
		System.out.println("Generated int = " + randomInt + " matches one time.\nIn index:\n" + matchMass[0]);
	    } else if (macthScore > 1) {
		System.out.println("Generated int = " + randomInt + " matches " + macthScore + " times.\nIn indexes:");
		for (int i = 0; i < macthScore; i++) {
		    System.out.println(matchMass[i] + "_");
		}
	    } else {
		System.out.println("Generated int = " + randomInt + " not found !");
	    }
	}
    }
    // ����� �������� �������� ������� �������� - ������ ����� � �����������������

    private static int[] search(int randomInt, int[] inputedMass) {
	int[] resultMultiDimensionMass;
	int numOfMatches = 0;
// ��������� ������������ ������ ��������� ��������� �������, � �������
// ��������� ����������� � ������� ��������� �����
	for (int i = 0; i < inputedMass.length; i++) {
	    if (randomInt == inputedMass[i]) {
		numOfMatches++;
	    }
	}
	resultMultiDimensionMass = new int[numOfMatches];

	for (int i = 0, j = 0; i < inputedMass.length && j <= numOfMatches; i++) {
	    if (randomInt == inputedMass[i]) {
		resultMultiDimensionMass[j++] = i;
	    }
	}

	return resultMultiDimensionMass;
    }

}
