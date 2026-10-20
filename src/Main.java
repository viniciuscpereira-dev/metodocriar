public class Main {

    public static void main(String[] args) {

        TarefaController controller = new TarefaController();

        Tarefa tarefa = controller.criarTarefa(
                1,
                "Estudar Java",
                "Revisar métodos"
        );
    }
}