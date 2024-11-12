package com.codecave.blog.GestionPedidosApi.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	@Column
	private LocalDateTime created_at;
	@Column
	private Long customer_id;
	@Column
	private String status;
	@Column
	private String payment_method;
	@Column
	private Float total_amount;
	@Column
	private LocalDateTime shipping_date;
	@Column
	private LocalDateTime delivery_date;
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public Float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}
	public LocalDateTime getShipping_date() {
		return shipping_date;
	}
	public void setShipping_date(LocalDateTime shipping_date) {
		this.shipping_date = shipping_date;
	}
	public LocalDateTime getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(LocalDateTime delivery_date) {
		this.delivery_date = delivery_date;
	}
}
