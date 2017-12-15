
package kata.pkg3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histo = new Histogram();
        histo.increment("gmail.com");
        histo.increment("yahoo.com");
        histo.increment("hotmail.com");
        histo.increment("gmail.com");
        histo.increment("yahoo.com");
        histo.increment("gmail.com");
        new HistogramDisplay(histo).execute();
        
        
    }
    
}
