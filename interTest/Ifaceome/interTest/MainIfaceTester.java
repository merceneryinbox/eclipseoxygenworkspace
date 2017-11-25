package interTest;

public class MainIfaceTester {

    public static void main(String[] args) {
	FirstInterface interface1 = new FirstInterface() {

	    @Override
	    public void metodTwo() {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void methodOne() {
		// TODO Auto-generated method stub

	    }
	};
	interface1.defaultMetodOne(interface1.iDefault);
	interface1.defaultMetodTwo(10.25);
    }
}
