package net.caussao.sistemavendas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.caussao.sistemavendas.dto.ClienteDto;
import net.caussao.sistemavendas.service.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RestController
@RequestMapping("api/clientes")
public class ClienteController {
    
    private ClienteService clienteService;

    @PostMapping("/cadastro")
    public ResponseEntity<ClienteDto> createCliente(@RequestBody ClienteDto clienteDto) {
        ClienteDto savedCliente = clienteService.createCliente(clienteDto);
        return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
    }
    
}