package com.ping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ping.dao.ProductDAO;
import com.ping.formBean.ProductFormBean;
import com.ping.model.ProductBean;
@Service
public class ProductService {
	@Autowired
	private ProductDAO DAO;
	public ProductBean insert(ProductFormBean formBean) {
		ProductBean productBean = new ProductBean();
		productBean.setTitle(formBean.getTitle());
		productBean.setName(formBean.getItemName());
		productBean.setInfo(formBean.getItemInfo());
		productBean.setMoney(formBean.getMoney());
		productBean.setCount(formBean.getCount());
		productBean.setKind(formBean.getKind());
		productBean.setDetail(formBean.getDetail());
		productBean.setImg(formBean.getImg());
		return DAO.insert(productBean);
	}
	
	public List<ProductBean> selectForList() {
		return DAO.selectForList();
	}
	
	public void delete(int id) {
		DAO.deleteFromId(id);
	}
	
}
