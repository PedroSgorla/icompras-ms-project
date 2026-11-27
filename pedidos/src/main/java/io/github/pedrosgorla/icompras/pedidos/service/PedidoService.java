package io.github.pedrosgorla.icompras.pedidos.service;

import io.github.pedrosgorla.icompras.pedidos.model.ItemPedido;
import io.github.pedrosgorla.icompras.pedidos.model.Pedido;
import io.github.pedrosgorla.icompras.pedidos.repository.ItemPedidoRepository;
import io.github.pedrosgorla.icompras.pedidos.repository.PedidoRepository;
import io.github.pedrosgorla.icompras.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator pedidoValidator;

    public Pedido criarPedido(Pedido pedidoCriado){}
}
