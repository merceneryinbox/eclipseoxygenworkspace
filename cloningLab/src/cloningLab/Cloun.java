package cloningLab;

import java.util.ArrayList;

public class Cloun implements Cloneable {
    public static Integer testInt = 10;

    /**
     * @return the testInt
     */
    public static Integer getTestInt() {
	return testInt;
    }

    /**
     * @param testInt
     *            the testInt to set
     */
    public static void setTestInt(Integer testInt) {
	Cloun.testInt = testInt;
    }

    /**
     * @return the testString
     */
    public static String getTestString() {
	return testString;
    }

    /**
     * @param testString
     *            the testString to set
     */
    public static void setTestString(String testString) {
	Cloun.testString = testString;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Integer> getTestArList() {
	return testArList;
    }

    private static String testString = "StringF ield in clon test";
    private ArrayList<Integer> testArList = new ArrayList<Integer>();

    @SuppressWarnings("unchecked")
    @Override
    public Cloun clone() {
	Cloun copyCloun = null;
	try {
	    copyCloun = (Cloun) super.clone();
	    System.out.println("Clone process success...");
	    copyCloun.setTestArList((ArrayList<Integer>) (this.getTestArList()).clone());
	} catch (Exception e) {
	    System.err.println("Clone" + getClass().getPackageName());
	}

	return copyCloun;

    }

    private void setTestArList(ArrayList<Integer> clone) {
	// TODO Auto-generated method stub

    }

}
