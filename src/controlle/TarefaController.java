package controlle;

import java.util.ArrayList;
import model.TarefaModel;

public class TarefaController {

    private ArrayList<TarefaModel> lista = new ArrayList<>();

    public boolean adicionarTarefa(String nome) {

        if (nome.trim().isEmpty()) {

            return false;
        }
        for (TarefaModel t : lista) {

            if (t.getNome().equalsIgnoreCase(nome)) {

                return false;
            }
        }

        lista.add(new TarefaModel(nome));

        return true;
    }

    public ArrayList<TarefaModel> getLista() {

        return lista;

    }

    public void removerTarefa(int indice) {

        if (indice >= 0) {

            lista.remove(indice);

        }
    }

    public void concluirTarefa(int indice) {

        if (indice >= 0) {

            lista.get(indice).concluir();

        }

    }

    public int totalTarefas() {

        return lista.size();

    }

}
