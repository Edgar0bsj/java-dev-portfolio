package toDosList.tarefa.model;

public class TarefaModel {
    private int id;
    private String descricao;
    private boolean concluida;
    
    //  construtor...
    public TarefaModel(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
    
    
	// Getters, setters
    

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}


    
}

