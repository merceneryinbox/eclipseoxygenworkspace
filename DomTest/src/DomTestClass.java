
// http://javism.blogspot.ru/2012/01/java-dom-xml-parser-dom-java-xml.html
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomTestClass {

    public DomTestClass() {
    }

    public static void main(String[] args) {
	try {
	    File xmlFile = new File("./src/resource/account.xml");
	    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	    Document document = documentBuilder.parse(xmlFile);
	    document.getDocumentElement().normalize();

	    Node user = document.getDocumentElement().getChildNodes().item(1);
	    Node name = user.getChildNodes().item(1);
	    Node balance = user.getChildNodes().item(3);

	    System.out.println("Корневой элемент: " + document.getFirstChild().getNodeName());
	    System.out.println(user.getNodeName());
	    System.out.println(name.getChildNodes().item(0).getNodeValue()); // System.out.println
	    System.out.println(balance.getNodeName());// System.out.println

	    NodeList usersnodeList = document.getElementsByTagName("user");
	    System.out.println("----------------"
			       + document.getDocumentElement().getChildNodes().item(1).getNodeName());
	    System.out.println("--------------------");
	    for (int tmp = 0; tmp < usersnodeList.getLength(); tmp++) {
		Node node = usersnodeList.item(tmp);
		Element element = (Element) node;
		System.out.println("name: " + element.getElementsByTagName("name").item(0).getChildNodes()
						     .item(0).getNodeValue());
		System.out.println("balance: " + element.getElementsByTagName("balance").item(0).getChildNodes()
							.item(0).getNodeValue());
	    }
	} catch (Exception e) {
	    System.out.println(e.getLocalizedMessage());
	    e.printStackTrace();
	}
    }
}