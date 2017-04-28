package com.ping.dao;

import com.ping.model.ProductBean;

public interface ProductDAO {
	public ProductBean select(ProductBean productBean);
	public ProductBean insert(ProductBean productBean);
	public ProductBean update(ProductBean productBean);
	public ProductBean delete(ProductBean productBean);
}
