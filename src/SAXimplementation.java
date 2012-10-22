import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class SAXimplementation implements ContentHandler{

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println("characters called, with args: "+ch.toString()+", "+ start+", "+ length);
		
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("endDoc called");
		
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("endElement called, with args: "+uri+", "+ localName+ ", "+ qName);
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		System.out.println("endPrefixMapping called, with args: "+prefix);
		
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		System.out.println("ignorableWhitespace called, with args: "+ch.toString()+", "+ start+", "+ length);
		
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		System.out.println("processingInstruction called, with args: "+target+", "+ data);
		
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		System.out.println("setDocumentLocator called, with args: "+locator.toString());
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		System.out.println("SkippedEntity called, with args: "+name);
		
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("startDocument called");
		
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		System.out.println("startElement called, with args: "+localName+", "+ qName);
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		System.out.println("startPrefix called, with args: "+prefix+", "+ uri);
		
	}
	
}
