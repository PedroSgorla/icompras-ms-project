package io.github.pedrosgorla.icompras.produtos.repository;

import io.github.pedrosgorla.icompras.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
