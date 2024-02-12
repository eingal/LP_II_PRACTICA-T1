package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//implementacion de la interface IProducto
public interface IProducto extends JpaRepository<Producto, Integer>{

}
