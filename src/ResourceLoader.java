import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ResourceLoader {
    
    public static int lang = 0;

    public static String[] load(String filepath) {
        String[] properties = new String[8];
        try {
            File file = new File(filepath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("events");
            Node nNode = nList.item(lang);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                properties[0] = eElement.getElementsByTagName("title").item(0).getTextContent();
                properties[1] = eElement.getElementsByTagName("description").item(0).getTextContent();
                properties[2] = eElement.getElementsByTagName("start_time").item(0).getTextContent();
                properties[3] = eElement.getElementsByTagName("stop_time").item(0).getTextContent();
                properties[4] = eElement.getElementsByTagName("venue_address").item(0).getTextContent();
                properties[5] = eElement.getElementsByTagName("city_name").item(0).getTextContent();
                properties[6] = eElement.getElementsByTagName("region_abbr").item(0).getTextContent();
                properties[7] = eElement.getElementsByTagName("postal_code").item(0).getTextContent();
            }
            return properties;
        } catch (SAXException ex) {
            Logger.getLogger(ResourceLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ResourceLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ResourceLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static int getLang() {
        return lang;
    }

    public static void setLang(int lang) {
        ResourceLoader.lang = lang;
    }
    
    

}