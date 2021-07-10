package photogrouper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oseias
 */
public class FileWrapper {
    
    private String ano;
    private String mes;
    private String tipo; 
    
    
    public FileWrapper(File f){
      BasicFileAttributes atributos = null;
        try {
            atributos = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
        } catch (IOException ex) {
            Logger.getLogger(FileWrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
      FileTime time = atributos.creationTime();
      String pattern = "yyyy-MM";
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      String formatted = simpleDateFormat.format( new Date( time.toMillis() ) );
      System.out.println( "A data e hora de criação do arquivo são: " + formatted );
      this.ano = formatted.split("-")[0];
      this.mes = formatted.split("-")[1];
      int i = f.getName().lastIndexOf(".");
      
      if(i > 0){
          this.tipo = f.getName().substring(i + 1);
          System.out.println("--tipo-- "+this.tipo);
      }
    }
    
  
  
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
  
    
    
    
}
