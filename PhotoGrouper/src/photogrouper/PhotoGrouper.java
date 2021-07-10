package photogrouper;

import java.io.File;

/**
 *
 * @author David
 */
public class PhotoGrouper {

    public static void main(String[] args) {

       
        FolderManager s = new FolderManager();
        String destino = "C:\\Users\\user\\Desktop";
        String nome = "2020";
        s.criar(destino, nome);
        s.criar("C:\\Users\\user\\Desktop"+"\\"+2020, "julho");
        File f = new File("C:\\Users\\user\\Documents\\imagem.jpg");
        
        s.moverarquivo(destino+"\\"+nome+"\\"+"julho",f);

   
        
        //PhotoController photoController = new PhotoController("C:\\Users\\David\\Desktop\\TestFolder");
         
        //FolderManager s = new FolderManager();
        
        //s.criar("C:\\Users\\user\\Desktop","teste");
        
    }
    

}
