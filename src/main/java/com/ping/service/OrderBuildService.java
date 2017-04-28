package com.ping.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ping.dao.OrderDAO;
import com.ping.dao.ProductDAO;
import com.ping.formBean.OrderFormBean;
import com.ping.model.OrderBean;
import com.ping.model.ProductBean;
import com.ping.model.UserBean;
@Service
public class OrderBuildService {
	@Autowired
	private OrderDAO orderdao;
	@Autowired
	private ProductDAO productdao;
	
	public Map<String, Object> build(HttpSession session, OrderFormBean formBean) {
		UserBean user = (UserBean) session.getAttribute("sessionUser");
		Date date = new Date();
		Map<String, Object> map = new HashMap<String, Object>();
		OrderBean orderBean = new OrderBean();
		orderBean.setUserId(user.getId());
		orderBean.setMaxCount(formBean.getMaxCount());
		orderBean.setStatus("open");
		orderBean.setInfo(formBean.getItemInfo());
		orderBean.setDate(date);
		OrderBean obj = orderdao.insert(orderBean);
		map.put("orderBean", obj);
		
		ProductBean productBean = new ProductBean();
		System.out.println(obj.getId());
		productBean.setId(obj.getId());
		productBean.setOrderId(obj.getId());
		productBean.setKind(formBean.getKind());
		productBean.setMoney(formBean.getMoney());
		productBean.setIce(formBean.getIce());
		productBean.setSize(formBean.getSize());
		productBean.setSuger(formBean.getSuger());
		ProductBean item = productdao.insert(productBean);
		map.put("productBean", item);
		return map;
	}
}
