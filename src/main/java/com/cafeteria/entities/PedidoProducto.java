package com.cafeteria.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pedido_producto")
@Data
public class PedidoProducto {

    @EmbeddedId
    private PedidoProductoId id = new PedidoProductoId();

    @ManyToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @MapsId("productoId")
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad;
}