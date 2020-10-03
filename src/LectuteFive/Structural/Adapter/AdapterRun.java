package LectuteFive.Structural.Adapter;

public class AdapterRun {
    public static void main(String[] args) {
        XMLDocument xml = new XMLDocument();
        xml.setXmlDocument("<xml><item>1</item></xml>");

        XMLDocumentReader xmlDocumentReader = new XMLDocumentReader();

        XMLDocumentReader.read(xml);

        JSONDocument json = new JSONDocument();
        json.setJsonDocument("{item:2}");

        JSON2XMLAdapter adapter = new JSON2XMLAdapter(json);

        xmlDocumentReader.read(adapter);
    }
}
