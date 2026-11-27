package io.github.pedrosgorla.icompras.pedidos.controller.dto;

import io.github.pedrosgorla.icompras.pedidos.enums.TipoPagamento;

public record DadosPagamentoDTO(String dados, TipoPagamento tipoPagamento) {
}
