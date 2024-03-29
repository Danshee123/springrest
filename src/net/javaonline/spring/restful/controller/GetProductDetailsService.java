package net.javaonline.spring.restful.controller;


import net.javaonline.spring.restful.dao.GetProductDetailsDAO;
import net.javaonline.spring.restful.model.ProductDetails;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProductDetailsService {
	
    @RequestMapping("/getProduct")
    public @ResponseBody ProductDetails getProductMethod1(@RequestParam(value="itemcode", defaultValue="1") String itemcode) {
    	GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	  return  pdDao.getProductDetails(itemcode);
    }
    
    
    @RequestMapping("/getProduct/{itemcode}")
    public @ResponseBody ProductDetails getProductMethod2(@PathVariable(value="itemcode")  String itemcode) {
    	GetProductDetailsDAO pdDao=new GetProductDetailsDAO();
    	  return  pdDao.getProductDetails(itemcode);
    }
  
    
}