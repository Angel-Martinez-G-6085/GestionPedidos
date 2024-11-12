package com.codecave.blog.GestionPedidosApi.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "discounts")
public class Discounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long discount_id;
	@Column
	private Long order_id;
	@Column
	private int discount_percentage;
	public Long getDiscount_id() {
		return discount_id;
	}
	public void setDiscount_id(Long discount_id) {
		this.discount_id = discount_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public int getDiscount_percentage() {
		return discount_percentage;
	}
	public void setDiscount_percentage(int discount_percentage) {
		this.discount_percentage = discount_percentage;
	}
}
