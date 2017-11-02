package epamLecturesTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainLectureTestEpam {
    static String fileName = ".\\src\\epamLecturesTest\\MainLectureTestEpam.java";
    static byte[] bs;

    public MainLectureTestEpam() {

    }

    public static void main(String[] args) {
/*
 * try (InputStream iStream = new FileInputStream(fileName)) { bs = new
 * byte[iStream.available()]; iStream.read(bs, 0, iStream.available()); String
 * string = new String(bs); System.out.println(string); String[] strings =
 * string.split("\\s\\n"); for (int i = 0; i < strings.length; i++) {
 * System.out.println(strings[i]); } System.out.println(strings.length); } catch
 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e1) {
 * e1.printStackTrace(); }
 */

	try (FileReader fileReader = new FileReader(Paths.get(fileName).toFile());
	     FileWriter fileWriter = new FileWriter(Paths.get("./filewriterOut.txt").toFile())) {

	    int intChar;
	    char c;
	    List<Character> list = new ArrayList<>();

	    while ((intChar = fileReader.read()) > 0) {
		c = (char) intChar;
		list.add(c);
	    }

	    char[] chAr = new char[list.size()];
	    int counter = 0;

	    for (Character d : list) {
		chAr[counter++] = d;
	    }

	    for (int i = 0; i < chAr.length; i++) {
		System.out.println(chAr[i]);
	    }

	    String tString = new String(chAr, 0, chAr.length);

	    System.out.println(tString);

	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
