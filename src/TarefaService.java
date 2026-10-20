public class TarefaService {

    public Tarefa criarTarefa(int id, String titulo, String descricao) {

        Tarefa tarefa = new Tarefa(id, titulo, descricao, Status.PENDENTE);

        return tarefa;
    }
}