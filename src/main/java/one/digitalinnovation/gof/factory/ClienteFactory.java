package one.digitalinnovation.gof.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClienteFactory {

    public static Cliente createCliente(String nome, Endereco endereco) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        return cliente;
    }
}

