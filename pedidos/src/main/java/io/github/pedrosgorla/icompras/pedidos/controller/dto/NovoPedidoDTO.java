package io.github.pedrosgorla.icompras.pedidos.controller.dto;

import java.util.List;

public record NovoPedidoDTO(Long codigoCliente, DadosPagamentoDTO dadosPagamentoDTO, List<ItemPedidoDTO> items){
}
