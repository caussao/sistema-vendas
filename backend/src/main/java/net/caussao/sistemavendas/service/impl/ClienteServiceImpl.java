package net.caussao.sistemavendas.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.caussao.sistemavendas.dto.ClienteDto;
import net.caussao.sistemavendas.mapper.ClienteMapper;
import net.caussao.sistemavendas.models.Cliente;
import net.caussao.sistemavendas.repository.ClienteRepository;
import net.caussao.sistemavendas.service.ClienteService;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService{
    
    private ClienteRepository clienteRepository;

    @Override
    public ClienteDto createCliente(ClienteDto clienteDto) {

        Cliente cliente = ClienteMapper.mapToCliente(clienteDto);
        Cliente savedCliente = clienteRepository.save(cliente);
        return ClienteMapper.mapToClienteDto(savedCliente);
    }
    
    
}