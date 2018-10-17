package sample;

import com.sun.xml.internal.ws.model.wsdl.WSDLInputImpl;

public class File {
    public void CreatFile(){
        java.io.File file = new java.io.File("Dic.txt");
        try{
            file.createNewFile();
        }

        catch (Exception e) {

        }
    }
}
