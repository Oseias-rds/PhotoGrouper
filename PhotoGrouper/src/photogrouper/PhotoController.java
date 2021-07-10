package photogrouper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class PhotoController {
    
    
    
    private String  path;
    private List<FileWrapper> files = new ArrayList();
    private FolderManager fm = new FolderManager();
    
    public PhotoController(String path) {
        this.path = path;
        this.fillFileArray();
    }
    
    
    private void fillFileArray(){
        
        File dir = new File(this.path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                this.files.add(new FileWrapper(file));
            }
        }
        
    }
    
    
    public void groupFiles() {
        
        for(FileWrapper file : this.files) {
            
            if(file.getTipo().equals("png") || file.getTipo().equals("jpg")) {
                
                String ano = file.getAno();
                String mes = file.getMes();
                
                if(this.fm.criar(this.path, ano)){
                    if(this.fm.criar(this.path+"\\"+ano, mes)){ 
                        fm.moverarquivo(this.path+"\\"+ano+"\\"+mes, file.getMyfile());
                    }
                }else {
                    if(this.fm.criar(this.path+"\\"+ano, mes)){ 
                        fm.moverarquivo(this.path+"\\"+ano+"\\"+mes, file.getMyfile());
                    }else{ 
                         fm.moverarquivo(this.path+"\\"+ano+"\\"+mes, file.getMyfile());
                    }
                }
                
            }
        }
    }
    
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path){
        this.path = path;
    }

    public List<FileWrapper> getFiles() {
        return files;
    }

    public void setFiles(List<FileWrapper> files) {
        this.files = files;
    }
    
    
}
