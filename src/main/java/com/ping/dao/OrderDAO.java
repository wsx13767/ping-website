package com.ping.dao;

import com.ping.model.OrderBean;

public interface OrderDAO {
	public OrderBean select(OrderBean orderBean);
	public OrderBean insert(OrderBean orderBean);
	public OrderBean update(OrderBean orderBean);
	public OrderBean delete(OrderBean orderBean);
}
