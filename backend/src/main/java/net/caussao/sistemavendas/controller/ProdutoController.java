package net.caussao.sistemavendas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import lombok.AllArgsConstructor;
import net.caussao.sistemavendas.dto.ProdutoDto;
import net.caussao.sistemavendas.service.ProdutoService;



@AllArgsConstructor
@RestController
@RequestMapping("api/produtos")
public class ProdutoController {
    
    private ProdutoService produtoService;

    @PostMapping("/cadastro")
    public ResponseEntity<ProdutoDto> createProduto(@RequestBody ProdutoDto produtoDto){
        ProdutoDto savedProduto = produtoService.createProduto(produtoDto);
        return new ResponseEntity<>(savedProduto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProdutoDto> getProdutoById(@PathVariable("id") Long produtoId){
        ProdutoDto produtoDto = produtoService.getProdutoById(produtoId);
        return ResponseEntity.ok(produtoDto);
    }

    @GetMapping("/listall")
    public ResponseEntity<List<ProdutoDto>> getAllProdutos(){
        List<ProdutoDto> produtos = produtoService.getAllProdutos();
        return ResponseEntity.ok(produtos);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDto> updateProduto(@PathVariable("id") Long produtoId, @RequestBody ProdutoDto updatedProduto) {
        ProdutoDto produtoDto = produtoService.updateProduto(produtoId, updatedProduto);
        return ResponseEntity.ok(produtoDto);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduto(@PathVariable("id") Long produtoId) {
        produtoService.deleteProduto(produtoId);
        return ResponseEntity.ok("O produto "+produtoId+" foi deletado com sucesso");
    }
}