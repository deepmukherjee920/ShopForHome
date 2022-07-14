package com.capstonegroupsix.api.vo.responsesection;

import java.util.List;

import com.capstonegroupsix.api.entity.ProductInfo;

public class ProductInfoResponse {
	
	private List<ProductInfo> productList;

	public List<ProductInfo> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductInfo> productList) {
		this.productList = productList;
	}
	

}
