import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 
 */

/**
 * @author Cat
 *
 */
public class AnnoMainTestClass {

    /**
     * @param args
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalAccessException {
	ClassForTest classForTest = new ClassForTest();
	printObjInOrder(classForTest);
    }

    static boolean printObjInOrder(Object object) throws IllegalAccessException {
	String[] stringInOrder = new String[2];
	for (int i = 0; i < stringInOrder.length; i++) {
	    stringInOrder[i] = "";
	}
	boolean result = false;

	Class<? extends Object> class1 = object.getClass();

	Field[] fields = class1.getDeclaredFields();
	for (int i = 0; i < fields.length; i++) {

	    Field tmpField = fields[i];

	    Annotation[] annotations = tmpField.getAnnotations();
	    for (int j = 0; j < annotations.length; j++) {
		if (annotations[j].annotationType().equals(ShowOrNotAnno.class)) {

		    ShowOrNotAnno rulezAnno = (ShowOrNotAnno) annotations[j];
		    if (rulezAnno.showIt()) {
			int tmpPos = rulezAnno.positionInString() - 1;
			stringInOrder[tmpPos] = rulezAnno.positionInString() + tmpField.getName().toString() + " "
						+ tmpField.get(object).toString();
		    }
		}
	    }
	}
	System.out.println(" + ");
	for (int t = 0; t < stringInOrder.length; t++) {
	    System.out.print(stringInOrder[t] + " ");
	}
	return result;
    }
}
