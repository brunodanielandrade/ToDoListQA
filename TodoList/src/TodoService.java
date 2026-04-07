import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private List<Todo> lista = new ArrayList<>();


    public void adicionar(Todo todo) {
        if (todo == null ||
                todo.getDescricao() == null ||
                todo.getDescricao().trim().isEmpty()) {

            throw new IllegalArgumentException("Descrição não pode ser vazia");
        }

        lista.add(todo);
    }

    public List<Todo> listar() {
        return lista;
    }

    public void remover(String descricao) {
        lista.removeIf(t -> t.getDescricao().equals(descricao));
    }
}
