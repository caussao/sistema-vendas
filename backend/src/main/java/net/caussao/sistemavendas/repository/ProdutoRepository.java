package net.caussao.sistemavendas.repository;

import net.caussao.sistemavendas.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}