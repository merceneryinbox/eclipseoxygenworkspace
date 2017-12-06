package hierarachyTest;

public class MainHier {

    public MainHier() {
    }

    public static void main(String[] args) {
	Object object = new UnderMainOne();
	System.out.println(object.toString());

	UnderMainOne underMainOne = new SubUnderOne();
	System.out.println(underMainOne.toString());

	// UnderMainOne underMainOne2 = new MainHier(); - wrong because of that declared
	// methods and fields of extenders cannot be created by constructor
	// of Superclass(it has no such fields ands methods)

	// List<SubUnderOne> list = new ArrayList<UnderMainOne>(); COmpilation
	// unresilvable error - Type Mismatch
    }

    static class UnderMainOne extends MainHier {
	public String name = "one";

	@Override
	public String toString() {
	    return super.toString() + " Name = " + name;
	}
    }

    static class UnderMainTwo extends MainHier {
	public String name = "two";

	@Override
	public String toString() {
	    return super.toString() + " Name = " + name;
	}
    }

    static class SubUnderOne extends UnderMainOne {
	String name = "Under One";

	@Override
	public String toString() {
	    return super.toString() + " Name = " + name;
	}
    }

}
