package net.caussao.sistemavendas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nome;
    @Column(length=500)
    private String descricao;
    private BigDecimal preco;
    private BigDecimal custo;
    private int quantidadeEstoque;
    private String unidade;
    private boolean ativo;
    @Column(length=8)
    private String ncm;
    private String cfop;
    @Column(length=14)
    private String ean;
    @DateTimeFormat
    private LocalDateTime dataCadastro;
    //private String imagemUrl;
    private int estoqueMinimo;
    @ManyToOne
    @JoinColumn(name="fornecedor_id")
    private Fornecedor fornecedor;
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;
}