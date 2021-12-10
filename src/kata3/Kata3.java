package kata3;

import java.util.HashMap;
import org.jfree.chart.ChartFactory;

public class Kata3 {

    public static void main(String[] args) {
        HashMap data = new HashMap();
        Histogram<String> histogram = new Histogram<>(data);
        histogram.increment("gmail.com");
        histogram.increment("email.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ull.com");
        histogram.increment("ull.com");
        histogram.increment("ull.com");
        
        new HistogramDisplay("JFreeChart", histogram).execute();
    }
    
}