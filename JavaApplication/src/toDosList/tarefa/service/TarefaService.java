package toDosList.tarefa.service;

import java.util.List;

import toDosList.tarefa.model.TarefaModel;
import toDosList.tarefa.repository.TarefaRepository;

public class TarefaService {

	private TarefaRepository repo = new TarefaRepository();
	private int idAtual = 1;

	public void criar(String descricao) {
		TarefaModel t = new TarefaModel(idAtual++, descricao);
		repo.salvar(t);
	}

	public List<TarefaModel> listar() {
		return repo.listarTodas();
	}

	public boolean concluir(int id) {
		TarefaModel t = repo.buscarPorId(id);
		if (t != null) {
			t.setConcluida(true);
			return true;
		}
		return false;
	}
}
