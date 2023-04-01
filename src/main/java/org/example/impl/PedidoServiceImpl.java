//package org.example.impl;
//
//import org.example.domain.entity.Pedido;
//import org.example.domain.repository.Pedidos;
//import org.example.rest.dto.PedidoDTO;
//import org.example.service.PedidoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//
//@Service
//public class PedidoServiceImpl implements PedidoService {
//
//
//    private Pedidos pedidos;
//
//    public PedidoServiceImpl(Pedidos pedidos) {
//        this.pedidos = pedidos;
//    }
//
//
//    @Override
//    public Pedido salvar(PedidoDTO dto) {
//        Pedido pedido = new Pedido();
//        pedido.setTotal(dto.getTotal());
//        pedido.setDataPedido(LocalDate.now());
//
//    };
//}
