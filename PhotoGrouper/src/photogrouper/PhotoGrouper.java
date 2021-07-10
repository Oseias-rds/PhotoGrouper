package photogrouper;

import java.io.File;

/**
 *
 * @author David
 */
public class PhotoGrouper {

    public static void main(String[] args) {
        
        PhotoController photoController = new PhotoController("C:\\Users\\David\\Desktop\\TestFolder");       
        photoController.groupFiles();
        
    }
}
