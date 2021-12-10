package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/*
En nuestra aplicación, Kata3, el orden que seguiremos básicamente será:
1. Hacer visible una ventana (Frame)
2. Insertar un Panel de tipo ChartPanel
3. Insertar en el Panel un Chart de tipo JFreeChart
4. Crear un Dataset de tipo DefaultCategoryDataset
*/
public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(String title) {
        super(title);
        setContentPane(CreatePanel());
        pack();
    }
    
    
    // 2. Insertar un Panel de tipo ChartPanel
    private JPanel CreatePanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    // 3. Insertar en el Panel un Chart de tipo JFreeChart
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma correos","Dominios email","Nº De Emails",dataSet,PlotOrientation.VERTICAL,false,false,rootPaneCheckingEnabled);
        return chart;
    }
    // 4. Crear un Dataset de tipo DefaultCategoryDataset
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(10, "", "gmail.com");
        dataSet.addValue(5, "", "outlook.com");
        dataSet.addValue(8, "", "nano.com");
        return dataSet;
    }
    // 1. Hacer visible una ventana (Frame)
    public void execute(){
        setVisible(true);
    }
    
}