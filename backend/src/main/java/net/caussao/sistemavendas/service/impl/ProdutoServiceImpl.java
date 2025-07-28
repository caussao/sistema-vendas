package net.caussao.sistemavendas.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.caussao.sistemavendas.dto.ProdutoDto;
import net.caussao.sistemavendas.exception.ResourceNotFoundException;
import net.caussao.sistemavendas.mapper.ProdutoMapper;
import net.caussao.sistemavendas.models.Produto;
import net.caussao.sistemavendas.service.ProdutoService;
import net.caussao.sistemavendas.repository.ProdutoRepository;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService{
    
    private ProdutoRepository produtoRepository;
    
    @Override
    public ProdutoDto createProduto(ProdutoDto produtoDto) {
        
        Produto produto = ProdutoMapper.mapToProduto(produtoDto);
        Produto savedProduto = produtoRepository.save(produto);
        return ProdutoMapper.mapToProdutoDto(savedProduto);
    }

    @Override
    public ProdutoDto getProdutoById(Long produtoId) {
        Produto produto = produtoRepository.findById(produtoId)
            .orElseThrow(() ->
                    new ResourceNotFoundException("O produto com o Id: "+produtoId+" não existe"));
        return ProdutoMapper.mapToProdutoDto(produto);
    }

    @Override
    public List<ProdutoDto> getAllProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map((produto) -> ProdutoMapper.mapToProdutoDto(produto))
            .collect(Collectors.toList());
    }

    @Override
    public ProdutoDto updateProduto(Long produtoId, ProdutoDto produtoDto) {
        Produto produto = produtoRepository.findById(produtoId)
            .orElseThrow(() ->
                    new ResourceNotFoundException("O produto com o Id: "+produtoId+" não existe"));
        produto.setCodigo(produtoDto.getCodigo());
        produto.setNome(produtoDto.getNome());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setPreco(produtoDto.getPreco());
        produto.setCusto(produtoDto.getCusto());
        produto.setQuantidadeEstoque(produtoDto.getQuantidadeEstoque());
        produto.setUnidade(produtoDto.getUnidade());
        produto.setAtivo(produtoDto.isAtivo());
        produto.setNcm(produtoDto.getNcm());
        produto.setCfop(produtoDto.getCfop());
        produto.setEan(produtoDto.getEan());
        produto.setDataCadastro(produtoDto.getDataCadastro());
        produto.setEstoqueMinimo(produtoDto.getEstoqueMinimo());
        produto.setFornecedor(produtoDto.getFornecedor());
        produto.setCategoria(produtoDto.getCategoria());
        
        Produto updatedProduto = produtoRepository.save(produto);
        
        return ProdutoMapper.mapToProdutoDto(updatedProduto);

    }

    @Override
    public void deleteProduto(Long produtoId) {
        Produto produto = produtoRepository.findById(produtoId)
            .orElseThrow(() ->
                    new ResourceNotFoundException("O produto com o Id: "+produtoId+" não existe"));
        produtoRepository.delete(produto);
    }
    
}