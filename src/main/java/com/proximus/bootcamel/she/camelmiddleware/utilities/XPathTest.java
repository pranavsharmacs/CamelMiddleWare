package com.proximus.bootcamel.she.camelmiddleware.utilities;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XPathTest {

	public static void main(String[] args) throws XPathExpressionException, Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(
					"C:/Data/Salto AIA/POC 2 HTTP SOAP/Migration Status Check - HTTP/Sample XML's/SampleRequest.xml");

			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			//System.out.println("XML IN String format is: \n" + writer.toString());

			String xml = writer.toString();
			int startIndex = xml.indexOf("<soapenv:Body>");
			int endIndex = xml.indexOf("</soapenv:Body>");
			System.out.println(xml.substring(startIndex+14, endIndex).trim());

			// Create XPathFactory object
			XPathFactory xpathFactory = XPathFactory.newInstance();

			// Create XPath object
			XPath xpath = xpathFactory.newXPath();
			xpath.setNamespaceContext(new NamespaceContext() {
				public String getNamespaceURI(String prefix) {
					if (prefix == null)
						throw new NullPointerException("Invalid Namespace Prefix");
					else if ("soapenv".equals(prefix))
						return "http://schemas.xmlsoap.org/soap/envelope/";
					else if ("urn".equals(prefix))
						return "urn:v4.context.vss.objects.bgc";
					else if ("urn1".equals(prefix))
						return "urn:v1.customerconsultation.aia.services.bgc";
					else if ("urn2".equals(prefix))
						return "urn:v1.requestgetcustomermigrationstatus.aia.objects.bgc";
					else
						return XMLConstants.NULL_NS_URI;
				}

				public Iterator<?> getPrefixes(String val) {
					return null;
				}

				public String getPrefix(String uri) {
					return null;
				}
			});

			XPathExpression expr = xpath.compile("//soapenv:Body");
			XPathExpression expr2 = xpath.compile("//soapenv:Body");
			/*Node node = (Node) expr2.evaluate(doc, XPathConstants.NODE);
			System.out.println("Body: " + node.getAttributes().getNamedItem("Body").getNodeValue());*/

			String value = (String) expr.evaluate(doc, XPathConstants.STRING);
			Node node = (Node) expr.evaluate(doc, XPathConstants.NODE);
			System.out.println(node.getTextContent());
			//System.out.println(value);

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}
}
