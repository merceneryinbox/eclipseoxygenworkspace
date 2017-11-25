import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class LocalBundle {
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
	System.out.println("Current Locale: " + Locale.forLanguageTag("en"));

	ResourceBundle mybundle = ResourceBundle.getBundle("testBundle", Locale.ENGLISH);
	System.out.println(mybundle.getString("second_line"));

	Locale current = Locale.getDefault();
	System.out.println(current.getCountry() + "\n" +

			   current.getDisplayCountry() + "\n" +

			   current.getLanguage() + "\n" +

			   current.getDisplayLanguage());

	Enumeration<String> rEnumerationKeysBundle = mybundle.getKeys();

	while (rEnumerationKeysBundle.hasMoreElements()) {
	    String string = rEnumerationKeysBundle.nextElement();
	    map.put(string, mybundle.getString(string));
	}

	for (Map.Entry<String, String> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + " - = - " + entry.getValue());
	}
    }
}
