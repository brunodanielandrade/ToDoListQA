import org.junit.Test;
import static org.junit.Assert.*;

public class TodoServiceTest {

    @Test
    public void deveAdicionarTarefa() {
        TodoService service = new TodoService();

        service.adicionar(new Todo("Estudar QA"));

        assertEquals(1, service.listar().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarTarefaVazia() {
        TodoService service = new TodoService();

        service.adicionar(new Todo(""));
    }
}
