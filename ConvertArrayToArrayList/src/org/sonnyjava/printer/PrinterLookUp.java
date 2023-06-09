package org.sonnyjava.printer;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class PrinterLookUp {

    public static void main(String[] args) {
        
        int i =1;
        PrintService[] printers = PrintServiceLookup.lookupPrintServices(null, null);
            for(PrintService service : printers) {
                System.out.println(service.getName());
                i++;
                
            }
    }

}
