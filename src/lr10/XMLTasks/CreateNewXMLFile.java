package lr10.XMLTasks;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateNewXMLFile {
    public static void main(String[] args) {

        //Николай Александрович, не нашел приложние к лабораторной работе, в котором должны были быть варианты
        //создания собственного ХML-файла, поэтому попытался придумать собственный

        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            //Создание корневого элемента
            Element rootElement = doc.createElement("computer");
            doc.appendChild(rootElement);

            //Добавление первой книги
            Element component1 = doc.createElement("processor");
            rootElement.appendChild(component1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("AMD ryzen 5 7600x"));
            component1.appendChild(title1);

            Element numberOfCores = doc.createElement("numberOfCores");
            numberOfCores.appendChild(doc.createTextNode("6"));
            component1.appendChild(numberOfCores);

            Element frequency = doc.createElement("frequency");
            frequency.appendChild(doc.createTextNode("4400 Mhz"));
            component1.appendChild(frequency);

            //Добавление второй книги
            Element component2 = doc.createElement("graphicCard");
            rootElement.appendChild(component2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Radeon RX 7900 XTX"));
            component2.appendChild(title2);

            Element videoMemoryCapacity = doc.createElement("videoMemoryCapacity");
            videoMemoryCapacity.appendChild(doc.createTextNode("24 GB"));
            component2.appendChild(videoMemoryCapacity);

            Element GPUFrequency = doc.createElement("GPUFrequency");
            GPUFrequency.appendChild(doc.createTextNode("2400 Mhz"));
            component2.appendChild(GPUFrequency);

            //Запись XML файла

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr10/XMLTasks/NewXML.xml"));
            transformer.transform(source,result);


            System.out.println("XML-файл успешно создан");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}