package com.sam.home.Product;

import java.util.List;

public class ProductServices {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ProductDAO productDAO = new ProductDAO();
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setPRODUCT_NAME("product1");
		productDTO.setPRODUCT_DETAIL("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOption_name("optionName1");
		productOptionDTO.setOption_price(100);
		productOptionDTO.setOption_each(10);
		productOptionDTO.setProduct_num(null);
		
		ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
		productOptionDTO2.setOption_name("optionName2");
		productOptionDTO2.setOption_price(200);
		productOptionDTO2.setOption_each(20);
		productOptionDTO2.setProduct_num(null);
		
		try {
			int num = productDAO.getProductNum();
			int result = productDAO.AddProduct(num, productDTO);
			
			productOptionDTO.setProduct_num(num);
			productOptionDTO2.setProduct_num(num);
			productDAO.AddProductOption(productOptionDTO);
			productDAO.AddProductOption(productOptionDTO2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
