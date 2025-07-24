package net.caussao.sistemavendas.service;

import net.caussao.sistemavendas.dto.ProdutoDto;
import java.util.List;

public interface ProdutoService {
    ProdutoDto createProduto(ProdutoDto produtoDto);

    ProdutoDto getProdutoById(Long produtoId);

    List<ProdutoDto> getAllProdutos();

    ProdutoDto updateProduto(Long produtoId, ProdutoDto produtoDto);

    void deleteProduto(Long produtoId);
}