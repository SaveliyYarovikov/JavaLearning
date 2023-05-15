package lr10.XMLTasks;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

public class AddNewBook {
    public static void main(String[] args) {

        try{
            File inputFile = new File("src/lr10/Example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);



            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/Example1/example.xml"));
            transformer.transform(source, result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
