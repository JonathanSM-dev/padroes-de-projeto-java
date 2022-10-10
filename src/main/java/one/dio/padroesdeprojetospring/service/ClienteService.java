package one.dio.padroesdeprojetospring.service;

import one.dio.padroesdeprojetospring.model.Cliente;
import org.springframework.context.annotation.Bean;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
