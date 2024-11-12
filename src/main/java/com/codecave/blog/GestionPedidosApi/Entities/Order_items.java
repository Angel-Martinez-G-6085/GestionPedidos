package com.codecave.blog.GestionPedidosApi.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "order_items")
public class Order_items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_item_id;
	@Column
	private Long order_id;
	@Column
	private Long product_id;
	@Column
	private int quantity;
	@Column
	private Float unit_price;
	@Column
	private Float subtotal;
	public Long getOrder_item_id() {
		return order_item_id;
	}
	public void setOrder_item_id(Long order_item_id) {
		this.order_item_id = order_item_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Float getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
}
