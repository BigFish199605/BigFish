package com.snackcase.pojo;

import java.util.Date;

public class Order {
	private String orderId;//订单id
	private String payment;//支付状态
	private Integer paymentType;//支付类型
	private String postFree;//邮费
	private Integer status;//状态
	private Date paymentTime;//支付时间
	private Integer userId;//用户id
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public Integer getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	public String getPostFree() {
		return postFree;
	}
	public void setPostFree(String postFree) {
		this.postFree = postFree;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
}
