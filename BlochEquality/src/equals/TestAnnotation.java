package equals;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import annos.PrintThis;

public class TestAnnotation {

    public static void main(String[] args) {
	IdealBlochEquals blochEquals = new IdealBlochEquals();
	printName(blochEquals);

    }

    public static boolean printName(Object object) {
	StringBuilder stringBuilder = new StringBuilder().append("start string");
	boolean result = false;

	Class<?> cl = object.getClass();
	Field[] fields = cl.getFields();

	for (int i = 0; i < fields.length; i++) {
	    Field tmpF = fields[i];
	    Annotation[] annotations = tmpF.getAnnotations();

	    for (int j = 0; j < annotations.length; j++) {

		Annotation tmpAn = annotations[j];
		if (tmpAn.equals(PrintThis.class)) {

		    stringBuilder.append(fields[i].toString());
		    result = true;
		}
	    }
	}
	System.out.println(stringBuilder.toString());
	return result;
    }

}
