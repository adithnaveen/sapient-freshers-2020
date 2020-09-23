package com.training.builder.entity;

import java.util.ArrayList;
import java.util.List;

// select * from <table> where [] order [];
public class SqlBuilder {
	public SqlBuilder() {
	}

	private StringBuilder sb = new StringBuilder(10000);
	private boolean orderSpecified = false;
	private boolean conditionSpecified = false;
	private List<Object> values = new ArrayList<>();

	public SqlBuilder from(String table) {
		sb.append("select * from ").append(table);
		return this;
	}

	public SqlBuilder where(String condition, Object value) {
		sb.append(conditionSpecified == false ? " where " : " and ").append(condition);

		values.add(value);

		conditionSpecified = true;
		return this;
	}

	public SqlBuilder join(String table, String onCondition) {
		sb.append(" join ").append(table).append(" on ").append(onCondition);

		return this;
	}

	public SqlBuilder whereOr(String condition, Object value) {
		sb.append(conditionSpecified == false ? " where " : " or ").append(condition);

		values.add(value);

		conditionSpecified = true;
		return this;
	}

	public SqlBuilder order(String orderBy, String dir) {
		sb.append(orderSpecified == false ? " order by " : ", ").append(orderBy).append(" ").append(dir);

		orderSpecified = true;
		return this;
	}

	public String build() {
		return sb.toString();
	}

	public List<Object> values() {
		return values;
	}
}