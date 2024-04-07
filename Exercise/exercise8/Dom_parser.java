package com.Exercise.exercise8;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/07/2024
========================================================================================================================
Exercise8
This is Java Program to parse the XML document - Used JAVA DOM Parser
The xml file contains three elements and sub-elements under each element

It also contains a code for adding a additional entry to the Book element
and the entire xml file is parsed and re-printed again to confirm the update
*/
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Dom_parser {
    static String file_name = "/Users/anvithahiriadka/IdeaProjects/HelloWorld/src/com/Exercise/exercise8/Book_details.xml";
    //Print method for printing the XML file in the structured format
    static void printing_the_document(DocumentBuilder dBuilder, Document doc) {
        try {
            NodeList nList = doc.getElementsByTagName("Book");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Book Title : " + eElement.getElementsByTagName("Title").item(0).getTextContent());
                    System.out.println("Year of Publication : " + eElement.getElementsByTagName("Published_year").item(0).getTextContent());
                    System.out.println("Number of Pages : " + eElement.getElementsByTagName("NumberofPages").item(0).getTextContent());
                    System.out.println("Author : " + eElement.getElementsByTagName("Author").item(0).getTextContent());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        try{
            //Parsing the xml file
            File inputfile =  new File(file_name);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputfile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            printing_the_document(dBuilder,doc);
            //Adding a new element Book to the existing xml file
            Element root = doc.getDocumentElement();
            Element new_book = doc.createElement("Book");
            //Appending the new element to the root element
            root.appendChild(new_book);
            //Adding the sub elements
            Element Title = doc.createElement("Title");
            Element Published_year = doc.createElement("Published_year");
            Element NumberofPages = doc.createElement("NumberofPages");
            Element Author = doc.createElement("Author");
            //Adding the contents to the sub elements
            Title.appendChild(doc.createTextNode("The Mountain Is You"));
            Published_year.appendChild(doc.createTextNode("2020"));
            NumberofPages.appendChild(doc.createTextNode("248"));
            Author.appendChild(doc.createTextNode("Brianna Wiest"));
            //Appending the sub elements to the element Book
            new_book.appendChild(Title);
            new_book.appendChild(Published_year);
            new_book.appendChild(NumberofPages);
            new_book.appendChild(Author);
            new_book.appendChild(doc.createTextNode("\n"));
            //Writing the updated xml back to the same file
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult streamresult = new StreamResult(file_name);
            transformer.transform(source, streamresult);
            System.out.println("New Book element added to the existing xml file successfully!!!\n");
            //Reprinting the document to confirm that the new element was added successfully
            System.out.println("Reprinting the xml document to confirm that the new entry is added");
            printing_the_document(dBuilder,doc);
        }
        catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}