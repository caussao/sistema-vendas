package net.caussao.sistemavendas.mapper;

import net.caussao.sistemavendas.dto.ClienteDto;
import net.caussao.sistemavendas.models.Cliente;


public class ClienteMapper {
    
    public static ClienteDto mapToClienteDto(Cliente cliente) {
        return new ClienteDto(
            cliente.getId(),
            cliente.getNome(),
            cliente.getCpfCnpj(),
            cliente.getRg(),
            cliente.getTelefone(),
            cliente.getEmail(),
            cliente.getEndereco(),
            cliente.getDataCadastro(),
            cliente.getObservacoes()
        );
    }

    public static Cliente mapToCliente(ClienteDto clienteDto) {
        return new Cliente(
            clienteDto.getId(),
            clienteDto.getNome(),
            clienteDto.getCpfCnpj(),
            clienteDto.getRg(),
            clienteDto.getTelefone(),
            clienteDto.getEmail(),
            clienteDto.getEndereco(),
            clienteDto.getDataCadastro(),
            clienteDto.getObservacoes()
        );
    }


}
