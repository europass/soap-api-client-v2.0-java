package europass.instruments.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class InstrumentsTestClient  {
  
  private Instruments instruments;  
  
  // Initiate the service.
  public InstrumentsTestClient(String url) throws Exception {    
    InstrumentsService service = new InstrumentsServiceLocator();
    this.instruments = service.getInstruments(new URL(url));
  }
  
  // Call the getDocumentFromCV web service, using all parameters.
  public byte[] getDocumentFromCV(java.lang.String doc, java.lang.String type, java.lang.String locale) throws Exception {
    return instruments.getDocumentFromCV(doc,type,locale);
  }

  // Call the getDocumentFromLP web service, using all parameters.
  public byte[] getDocumentFromLP(java.lang.String doc, java.lang.String type, java.lang.String locale) throws Exception {
    return instruments.getDocumentFromLP(doc,type,locale);
  }

  
  // The main method
  public static void main(String[] args) throws Exception {
    // Check for correct command line syntax
    if ( args.length < 6 ) {
      System.out.println("Please provide the following arguments: ");
      System.out.println("The first one should be the address of the Instruments service (for example: http://europass.cedefop.europa.eu/instrumentssrv/services/Instruments)");
      System.out.println("The second one should be \"cv\" or \"lp\" depending what we wish to do ");
      System.out.println("The third one should be the xml file name");
      System.out.println("The fourth one should be the type ( doc, sxw, pdf)");
      System.out.println("The fifth one should be the locale ( en_GB, fr_FR, de_DE)");
      System.out.println("The sixth one should be the output file");
      return;
    }

    try {    
      // Initiate the web service client
      InstrumentsTestClient client = new InstrumentsTestClient(args[0]);
      
      // Read the file
      File in=new File(args[2]);
      byte[] inbytes=new byte[(int)in.length()];
      FileInputStream fin=new FileInputStream(in);
      fin.read(inbytes);
      fin.close();
      
      // Convert the file read to XML
      String xml=new String(inbytes,"UTF-8");
      
      
      byte[] bytes=null;
      // Depending on command line arguments, call the appropriate method.
      if ( args[1].equals("cv") ) {
        bytes=client.getDocumentFromCV(xml,args[3],args[4]); 
      } else {
        bytes=client.getDocumentFromLP(xml,args[3],args[4]);        
      }
      
      // Write the output file
      File out=new File(args[5]);
      FileOutputStream fout=new FileOutputStream(out);
      fout.write(bytes);
      fout.close();
      
    } catch (Exception ex) {
      // Simple error handling
      ex.printStackTrace();
    }


 
    
  }
}