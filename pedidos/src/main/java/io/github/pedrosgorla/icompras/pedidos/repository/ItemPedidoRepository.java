package io.github.pedrosgorla.icompras.pedidos.repository;

import io.github.pedrosgorla.icompras.pedidos.model.ItemPedido;
import io.github.pedrosgorla.icompras.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
