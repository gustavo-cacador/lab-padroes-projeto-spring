package one.digitalinnovation.gof.service.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

public class LoggingClienteServiceDecorator extends ClienteServiceDecorator {

    private static final Logger logger = LoggerFactory.getLogger(LoggingClienteServiceDecorator.class);

    public LoggingClienteServiceDecorator(ClienteService decoratedClienteService) {
        super(decoratedClienteService);
    }

    @Override
    public void inserir(Cliente cliente) {
        logger.info("Inserindo cliente: " + cliente.getNome());
        super.inserir(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        logger.info("Atualizando cliente: " + cliente.getNome());
        super.atualizar(id, cliente);
    }

    @Override
    public void deletar(Long id) {
        logger.info("Deletando cliente com ID: " + id);
        super.deletar(id);
    }
}

