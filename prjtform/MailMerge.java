package prjtform;

import com.aspose.words.Document;  
import com.aspose.words.FileFormat;  
  
public class MailMerge {  
    public static void main(String[] args) throws Exception {  
        //create a Document instance  
        Document document = new Document("certificate.docx");  
        //load the template document  
       // document.loadFromFile("certificate.docx");  
  
        //call executeWidthRegion to mail merge records from xml file  
        document.getMailMerge().executeWidthRegion("exceldatabase.xlsx");  
  
        //save the document  
        document.saveToFile("MailMergeWithRegions.docx", FileFormat.Docx_2013);  
    }  
}  