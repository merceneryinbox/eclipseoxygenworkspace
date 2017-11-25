package collectionsTests;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public SetTest() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

	Set<String> dSet = new HashSet<>();
	dSet.add("1 string");
	dSet.add("2 string");
	dSet.add("3 string");
	dSet.add("4 string");
	dSet.remove("1 string");
	for (String string : dSet) {
	    System.out.println(string);
	}
	String tmp = "2 string";
	if (dSet.contains(tmp)) {
	    System.out.println();
	    System.out.println(tmp);
	}

    }

}
