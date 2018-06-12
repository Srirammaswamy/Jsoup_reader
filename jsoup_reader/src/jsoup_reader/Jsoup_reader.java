/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoup_reader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.jsoup.helper.Validate;
//import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
/**
 *
 * @author Sriram
 */
public class Jsoup_reader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://stackoverflow.com/questions/tagged/spring").get();
        Elements e = doc.select("div.al");
        System.out.println("Total questions for the topic Spring (till now) is "+e.text());
        
    }
    
}
