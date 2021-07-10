package photogrouper;

import java.io.File;

/**
 *
 * @author oseias
 */
public class FolderManager {

    public void criar(String caminho, String nome) {
        File file = new File(caminho + "\\" + nome);

        if (!file.exists()) {
            file.mkdirs();

        }
    }

    public void moverarquivo(String destino,File arquivo) {
        
        File diretorioDestino = new File(destino);
        
        File config = new File(diretorioDestino, arquivo.getName());
        boolean sucesso = arquivo.renameTo(config);
        
        if(sucesso){
            System.out.println(" Arquivo movido com sucesso ");
        }else{
            System.out.println(" Erro ao mover o Arquivo ");
        }
        

        
    }

}
