package photogrouper;

import java.io.File;

/**
 *
 * @author David
 */
public class PhotoGrouper {

    public static void main(String[] args) {

       
        
//        File f = new File("C:\\Users\\user\\Desktop\\2020\\julho\\imagem.jpg");;
//        
//        FileWrapper w = new FileWrapper(f);

   
        
        PhotoController photoController = new PhotoController("C:\\Users\\David\\Desktop\\TestFolder");
        
        photoController.groupFiles();
        
        
        //FolderManager s = new FolderManager();
        
        //s.criar("C:\\Users\\user\\Desktop","teste");
        
    }
    

}
