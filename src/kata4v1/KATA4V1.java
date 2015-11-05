package kata4v1;

import java.io.IOException;
import java.util.ArrayList;

public class KATA4V1 {

    public static void main(String[] args) throws IOException {
        String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\KATA4V1\\DATA\\emails.txt";
        ArrayList <String> mailArray = MailListReader.read(name);
        //System.out.println(mailArray.get(10));
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).execute();
                
        
    }
    
}
