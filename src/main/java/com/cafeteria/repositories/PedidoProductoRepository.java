package com.cafeteria.repositories;

import com.cafeteria.entities.PedidoProducto;
import com.cafeteria.entities.PedidoProductoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoProductoRepository extends JpaRepository<PedidoProducto, PedidoProductoId> {
}