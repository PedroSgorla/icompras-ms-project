package io.github.pedrosgorla.icompras.pedidos.controller.dto;

import java.math.BigDecimal;

public record ItemPedidoDTO(Long codigoPedido, Integer quantidade, BigDecimal valorUnitario) {
}
