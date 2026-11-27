package io.github.pedrosgorla.icompras.pedidos.controller.mappers;

import io.github.pedrosgorla.icompras.pedidos.controller.dto.NovoPedidoDTO;
import io.github.pedrosgorla.icompras.pedidos.model.Pedido;

public interface PedidoMapper {

    Pedido map(NovoPedidoDTO novoPedidoDTO);
}
