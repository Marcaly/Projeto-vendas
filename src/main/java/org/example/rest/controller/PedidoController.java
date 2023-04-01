package org.example.rest.controller;

import org.example.domain.entity.Pedido;
import org.example.rest.dto.PedidoDTO;
import org.example.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save(@RequestBody PedidoDTO dto){
       Pedido pedido = service.salvar(dto);
       return pedido.getId();
    }
}
