package toDosList;

import toDosList.tarefa.controller.TarefaController;

public class Main {
	public static void main(String[] args) {
		TarefaController controller = new TarefaController();
		controller.iniciar();
	}
}
