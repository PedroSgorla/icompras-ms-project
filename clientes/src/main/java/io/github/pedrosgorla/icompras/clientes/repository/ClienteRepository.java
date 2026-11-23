package io.github.pedrosgorla.icompras.clientes.repository;

import io.github.pedrosgorla.icompras.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
