package net.caussao.sistemavendas.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.caussao.sistemavendas.models.Categoria;
import net.caussao.sistemavendas.models.Fornecedor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {
    private Long id;
    private String codigo;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private BigDecimal custo;
    private int quantidadeEstoque;
    private String unidade;
    private boolean ativo;
    private String ncm;
    private String cfop;
    private String ean;
    private LocalDateTime dataCadastro;
    private int estoqueMinimo;
    private Fornecedor fornecedor;
    private Categoria categoria;
}