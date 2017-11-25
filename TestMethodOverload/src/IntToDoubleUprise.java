public class IntToDoubleUprise {
    public static void name(double double1) {
	System.out.println(double1);
    }

    public static void main(String[] args) {
	int sInteger = 5;
	name(sInteger);

	int ii = 3;
	int dd = 4;

	System.out.println("Output befor transmogrify");
	System.out.println("Primitives " + ii + " " + dd);

	System.out.print("Objectives ");
	TestObArgs testObArgs = new TestObArgs(ii, dd);

	System.out.println(testObArgs.i + " " + testObArgs.d);

	tester(testObArgs);
	primitiveTester(ii, dd);

	System.out.println("Output after transmogrify");
	System.out.print("Objectives ");
	System.out.println(testObArgs.i + " " + testObArgs.d);

	System.out.println("Primitives " + ii + " " + dd);

    }

    static class TestObArgs {
	int i = 0;
	int d = 0;

	public TestObArgs(int i, int d) {
	    this.i = i;
	    this.d = d;
	}
    }

    public static void tester(TestObArgs testObArgs) {
	testObArgs.i += 10;
	testObArgs.d += 10;
    }

    public static void primitiveTester(int testi, int testd) {
	testi += 10;
	testd += 10;
    }

}
