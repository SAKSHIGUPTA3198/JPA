package com.lti.main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.Order;
import com.lti.model.Product;

public class Main {

	public static void main(String[] args) {
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA");
	EntityManager entityManager = factory.createEntityManager();
	
	Product elecProduct =new Product();
	elecProduct.setProductId(1);
	elecProduct.setProductName("LED TV");
    elecProduct.setProductPrice(45000);
    
   
    Product beautyProduct =  new Product();
    beautyProduct.setProductId(2);
    beautyProduct.setProductName("Face wash");
    beautyProduct.setProductPrice(80);
    
    Product babyProduct =  new Product();
    babyProduct .setProductId(3);
    babyProduct .setProductName("johnson");
    babyProduct .setProductPrice(150);
    
    Product eleProduct =new Product();
	eleProduct.setProductId(4);
	eleProduct.setProductName("mobile");
    eleProduct.setProductPrice(30000);
    
    Product beautyProduc =  new Product();
    beautyProduc.setProductId(5);
    beautyProduc.setProductName("Face wash");
    beautyProduc.setProductPrice(80);
    
    
    Product babyProduc =  new Product();
    babyProduc .setProductId(6);
    babyProduc.setProductName("powder");
    babyProduc .setProductPrice(200);
    
    
    
    Order firstOrder = new Order();
    firstOrder.setOrderId(10002);
    firstOrder.setPurchaseDate(new Date());
    
  
    
    firstOrder.addProduct(babyProduct);
    firstOrder.addProduct(elecProduct);
    firstOrder.addProduct(beautyProduct);
    
    Order secondOrder = new Order();
    secondOrder.setOrderId(10012);
    secondOrder.setPurchaseDate(new Date());
    
    secondOrder.addProduct(babyProduct);
    secondOrder.addProduct(elecProduct);
    secondOrder.addProduct(beautyProduct);
    
    entityManager.getTransaction().begin();
    entityManager.persist(firstOrder);
    entityManager.persist(secondOrder);
    entityManager.getTransaction().commit();

    
  
   

	}

}
