package com.ibm.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerCity;
	private String CustomerState;
	private Integer CustomerPincode;
	private Integer CustomerPhone;
	private String CustomerEmail;
	
	Customer(){}
	
	public Customer(String CustomerName,String CustomerAddress, String CustomerCity,
			String CustomerState, Integer CustomerPincode, Integer CustomerPhone,
			String CustomerEmail) {
		super();
		this.CustomerName = CustomerName;
		this.CustomerAddress = CustomerAddress;
		this.CustomerCity = CustomerCity;
		this.CustomerState = CustomerState;
		this.CustomerPincode = CustomerPincode;
		this.CustomerPhone = CustomerPhone;
		this.CustomerEmail = CustomerEmail;
	}
	

	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public String getCustomerState() {
		return CustomerState;
	}
	public void setCustomerState(String customerState) {
		CustomerState = customerState;
	}
	public Integer getCustomerPincode() {
		return CustomerPincode;
	}
	public void setCustomerPincode(Integer customerPincode) {
		CustomerPincode = customerPincode;
	}
	public Integer getCustomerPhone() {
		return CustomerPhone;
	}
	public void setCustomerPhone(Integer customerPhone) {
		CustomerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", CustomerCity=" + CustomerCity + ", CustomerState=" + CustomerState
				+ ", CustomerPincode=" + CustomerPincode + ", CustomerPhone=" + CustomerPhone + ", CustomerEmail="
				+ CustomerEmail + "]";
	}
}
