package net.caussao.sistemavendas.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.caussao.sistemavendas.models.Endereco;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    private Long id;
    private String nome;
    private String cpfCnpj;
    private String rg;
    private String telefone;
    private String email;
    private Endereco endereco;
    private LocalDateTime dataCadastro;
    private String observacoes;
}
