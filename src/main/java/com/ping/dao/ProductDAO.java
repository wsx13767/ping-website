package com.ping.dao;

import java.util.List;

import com.ping.model.ProductBean;

public interface ProductDAO {
	public ProductBean select(ProductBean productBean);
	public ProductBean insert(ProductBean productBean);
	public ProductBean update(ProductBean productBean);
	public ProductBean delete(ProductBean productBean);
	public ProductBean deleteFromId(int id);
	public List<ProductBean> selectForList();
}
