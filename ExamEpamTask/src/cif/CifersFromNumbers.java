package cif;

import java.util.Arrays;

public class CifersFromNumbers {
    private static int counter = 0;
    private static int given = 123465987;
    private static int ten = 10;
    private static int[] ar;

    public static void main(String[] args) {
	int tmp = given;

// узнаём кол-во разрядов в данном числе, для формирования массива интов с
// размером = counter;
	int delta1 = 0;
	System.out.println(tmp);
	while (tmp > 0) {
	    tmp = (tmp - (tmp % ten)) / ten;
	    System.out.println("tmp - =" + tmp);
	    counter++;
	}
	System.out.println(counter);

	ar = new int[counter];
	tmp = given;
	System.out.println("tmp  second  " + tmp);
	int deltaGiven = 0;
	for (int i = 0; i < ar.length; i++) {
	    deltaGiven = tmp % ten;
	    System.out.println("delta = " + deltaGiven);
	    tmp = (tmp - deltaGiven) / ten;
	    System.out.println("tmp  " + tmp);
	    ar[i] = deltaGiven;
	}

	for (int i = 0; i < ar.length; i++) {
	    System.out.println(ar[i]);
	}

	Arrays.sort(ar);
	for (int i = 0; i < ar.length; i++) {
	    System.out.println(ar[i]);
	}

	getDescend(ar);

    }

    public static int[] getDescend(int[] inputAr) {
	Arrays.sort(inputAr);
	int[] result = new int[inputAr.length];
	for (int i = 0, j = inputAr.length - 1; i < inputAr.length; j--, i++) {
	    result[j] = inputAr[i];
	}

	for (int i = 0; i < result.length; i++) {
	    System.out.println(result[i]);
	}

	return result;
    }
}
