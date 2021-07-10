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

    public void moverarquivo() {

    }

}
