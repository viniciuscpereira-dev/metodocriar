public class TarefaController {

    private final TarefaService tarefaService = new TarefaService();

    public Tarefa criarTarefa(int id, String titulo, String descricao) {
        return tarefaService.criarTarefa(id, titulo, descricao);
    }
}