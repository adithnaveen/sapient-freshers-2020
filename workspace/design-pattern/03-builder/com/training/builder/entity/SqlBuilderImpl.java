package com.training.builder.entity;

public class SqlBuilderImpl {
	public static void main(String[] args) {
		SqlBuilder sb = new SqlBuilder(); 
		
		String build = sb.from("customers").join("orders", "orders.customer_id=customer.customer_id")
			.where("email like ?", "%msn%")
			.whereOr("state like ?", "%karnataka%")
			.order("city", "asc")
			.order("state", "asc")
			.build(); 
		
		System.out.println(build);
	}
}
