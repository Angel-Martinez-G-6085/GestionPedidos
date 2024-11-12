package com.codecave.blog.GestionPedidosApi.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "taxes")
public class Taxes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tax_id;
	@Column
	private Long order_id;
	@Column
	private Float tax_percentage;
	
	public Long getTax_id() {
		return tax_id;
	}
	public void setTax_id(Long tax_id) {
		this.tax_id = tax_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Float getTax_percentage() {
		return tax_percentage;
	}
	public void setTax_percentage(Float tax_percentage) {
		this.tax_percentage = tax_percentage;
	}
	
}
