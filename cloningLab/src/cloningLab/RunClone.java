package cloningLab;

public class RunClone {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
	Cloun cloun = new Cloun();

	Cloun cloun2 = cloun.clone();

	cloun2.setTestInt(555);
	cloun2.setTestString("five");

	System.out.println("cloun.test..." + cloun.getTestString() + " " + cloun.getTestInt() + " "
			   + cloun.getTestArList());
	System.out.println("cloun2.test..." + cloun.getTestString() + " " + cloun.getTestInt() + " "
			   + cloun2.getTestArList());

	cloun.setTestInt(654);
	cloun.setTestString("123");

	System.out.println("cloun.test..." + Cloun.getTestString() + " " + Cloun.getTestInt() + " "
			   + cloun.getTestArList());
	System.out.println("cloun2.test..." + Cloun.getTestString() + " " + Cloun.getTestInt() + " "
			   + cloun2.getTestArList());

    }

}
