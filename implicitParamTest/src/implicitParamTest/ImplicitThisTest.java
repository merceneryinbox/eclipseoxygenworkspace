package implicitParamTest;

public class ImplicitThisTest {

    public static int name(int i) {
	return i += 10;
    }

    public static void main(String[] args) {
	ImplicitThisTest implicitThisTest = new ImplicitThisTest();

	System.out.println(ImplicitThisTest.name(10));
    }

}
