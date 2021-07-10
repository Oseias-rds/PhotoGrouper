package photogrouper;

import java.io.File;
import java.util.List;

/**
 *
 * @author David
 */
public class PhotoController {
    
    
    
    private String  path;
    private List<Object> files;
    public PhotoController(String path) {
        this.path = path;
        this.fillFileArray();
    }
    
    
    public void fillFileArray(){
        
        File dir = new File(this.path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
        
    }
    
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path){
        this.path = path;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }
    
    
}
