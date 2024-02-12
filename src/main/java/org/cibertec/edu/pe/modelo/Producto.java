package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int codigo;
	private String nombre;
	private double compra;
	private double venta;
	private double existencia;
	
	public Producto() {
	}
	
	public Producto(int id, int codigo, String nombre, double compra, double venta, double existencia) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.compra = compra;
		this.venta = venta;
		this.existencia = existencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

	public double getVenta() {
		return venta;
	}

	public void setVenta(double venta) {
		this.venta = venta;
	}

	public double getExistencia() {
		return existencia;
	}

	public void setExistencia(double existencia) {
		this.existencia = existencia;
	}
	
		

}
