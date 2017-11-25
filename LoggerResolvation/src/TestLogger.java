import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 */

/**
 * @author mercenery
 *
 */
public class TestLogger {
    public static String className;

    /**
     * 
     */
    public TestLogger() {
	className = this.getClass().getName();
    }

    public static void throwTest() {
	throw new ArithmeticException("+++++++++++++ Mercenery Sintetic Arithmetic Exception");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	try {

	    throwTest();
	} catch (ArithmeticException e) {
	    StackTraceElement[] stackTraceElements = e.getStackTrace();
	    StringBuilder errStringBuilder = new StringBuilder("");

	    for (int i = 0; i < stackTraceElements.length; i++) {
		errStringBuilder.append("\n").append(stackTraceElements[i].toString());
	    }
	    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MMM-dd : HH:mm:ss:ms")));
	    System.err.println(className);
	    System.err.println("e.getLocalizedMessage() =" + e.getLocalizedMessage());
	    System.err.println("e.getMessage() =" + e.getMessage());
	    System.err.println("e.fillInStackTrace() = " + e.fillInStackTrace());
	    System.err.println("e.getCause() = " + e.getCause());
	    System.err.println("e.getClass() = " + e.getClass());
	}

    }

}
