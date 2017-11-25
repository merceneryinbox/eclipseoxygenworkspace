package collectionsTests;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HasMapTest {

    public HasMapTest() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
	ArrayList<String> forMapTestList = new ArrayList<>();
	for (int i = 0; i < 10_000_000; i++) {
	    forMapTestList.add(null);
	}
	Map<Integer, String> testMap = new HashMap();
	LocalDateTime now1 = LocalDateTime.now();
	System.out.println(LocalDateTime.now());
	for (int i = 0; i < forMapTestList.size(); i++) {
	    testMap.put(i, forMapTestList.get(i));
	}
	System.out.println(Duration.between(LocalDateTime.now(), now1).toMillis());
	Map<Integer, Integer> nulMapTest = new HashMap();
	nulMapTest.put(0, null);
	nulMapTest.put(1, 2);
	nulMapTest.put(1, 3);
	for (Map.Entry<Integer, Integer> integerEntry : nulMapTest.entrySet()) {
	    System.out.println(integerEntry.getKey() + " " + integerEntry.getValue());
	}
    }

}
