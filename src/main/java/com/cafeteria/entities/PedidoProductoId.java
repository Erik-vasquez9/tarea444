package com.cafeteria.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class PedidoProductoId implements Serializable {
    private Integer pedidoId;
    private Integer productoId;
}