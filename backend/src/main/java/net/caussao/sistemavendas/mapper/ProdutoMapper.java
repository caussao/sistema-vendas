package net.caussao.sistemavendas.mapper;

import net.caussao.sistemavendas.dto.ProdutoDto;
import net.caussao.sistemavendas.models.Produto;

public class ProdutoMapper {
    
    public static ProdutoDto mapToProdutoDto(Produto produto) {
        return new ProdutoDto(
            produto.getId(),
            produto.getCodigo(),
            produto.getNome(),
            produto.getDescricao(),
            produto.getPreco(),
            produto.getCusto(),
            produto.getQuantidadeEstoque(),
            produto.getUnidade(),
            produto.isAtivo(),
            produto.getNcm(),
            produto.getCfop(),
            produto.getEan(),
            produto.getDataCadastro(),
            produto.getEstoqueMinimo(),
            produto.getFornecedor(),
            produto.getCategoria()
        );
    }

    public static Produto mapToProduto(ProdutoDto produtoDto) {
        return new Produto(
            produtoDto.getId(),
            produtoDto.getCodigo(),
            produtoDto.getNome(),
            produtoDto.getDescricao(),
            produtoDto.getPreco(),
            produtoDto.getCusto(),
            produtoDto.getQuantidadeEstoque(),
            produtoDto.getUnidade(),
            produtoDto.isAtivo(),
            produtoDto.getNcm(),
            produtoDto.getCfop(),
            produtoDto.getEan(),
            produtoDto.getDataCadastro(),
            produtoDto.getEstoqueMinimo(),
            produtoDto.getFornecedor(),
            produtoDto.getCategoria()
        );
    }
}
