package net.caussao.sistemavendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.caussao.sistemavendas.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}