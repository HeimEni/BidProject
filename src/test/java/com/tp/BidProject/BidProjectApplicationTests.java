package com.tp.BidProject;

import com.tp.BidProject.entities.Offer;
import com.tp.BidProject.entities.Product;
import com.tp.BidProject.entities.User;
import com.tp.BidProject.repositories.*;
import com.tp.BidProject.services.OfferServiceInterface;
import com.tp.BidProject.services.ProductServiceInterface;
import com.tp.BidProject.services.UserServiceInterface;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class BidProjectApplicationTests {
	@Autowired
	OfferServiceInterface offerServiceInterface;
	@Autowired
	UserServiceInterface userServiceInterface;
	@Autowired
	ProductServiceInterface productServiceInterface;

	@Test
	void contextLoads() {
	}

	@Test
	void test1(){
		User u = new User(1,"firstname","lastname","email","password");
		Product p = new Product(1,"name_product","description",1L,"pathToimg");
		Offer o = new Offer(1,12L, LocalDateTime.now(), u,p);

		userServiceInterface.insertUser(u);
		productServiceInterface.insertProduct(p);
		offerServiceInterface.insertOffer(o);

		System.out.println(o.getId());
		System.out.println(offerServiceInterface.getOfferByid(1));
		System.out.println(userServiceInterface.getUserByid(1));
		System.out.println(productServiceInterface.getProductByid(1));
	}

}
