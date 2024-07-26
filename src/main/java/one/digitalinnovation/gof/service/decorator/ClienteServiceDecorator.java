package one.digitalinnovation.gof.service.decorator;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

public abstract class ClienteServiceDecorator implements ClienteService {

    protected ClienteService decoratedClienteService;

    public ClienteServiceDecorator(ClienteService decoratedClienteService) {
        this.decoratedClienteService = decoratedClienteService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return decoratedClienteService.buscarTodos();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return decoratedClienteService.buscarPorId(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        decoratedClienteService.inserir(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        decoratedClienteService.atualizar(id, cliente);
    }

    @Override
    public void deletar(Long id) {
        decoratedClienteService.deletar(id);
    }
}
