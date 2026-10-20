public class Tarefa {

    private int id;
    private String titulo;
    private String descricao;
    private Status status;

    public Tarefa(int id, String titulo, String descricao, Status status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}