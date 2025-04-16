package toDosList.tarefa.repository;

import java.util.ArrayList;
import java.util.List;
import toDosList.tarefa.model.TarefaModel;

public class TarefaRepository {
    private List<TarefaModel> banco = new ArrayList<>();

    public void salvar(TarefaModel tarefa) {
        banco.add(tarefa);
    }

    public List<TarefaModel> listarTodas() {
        return banco;
    }

    public TarefaModel buscarPorId(int id) {
        for (TarefaModel t : banco) {
            if (t.getId() == id) return t;
        }
        return null;
    }
}
