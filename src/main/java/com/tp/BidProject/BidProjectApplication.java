package com.tp.BidProject;

import com.tp.BidProject.services.OfferServiceInterface;
import com.tp.BidProject.services.ProductServiceInterface;
import com.tp.BidProject.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BidProjectApplication {
	@Autowired
	OfferServiceInterface offerServiceInterface;
	@Autowired
	ProductServiceInterface productServiceInterface;
	@Autowired
	UserServiceInterface userServiceInterface;

	public static void main(String[] args) {
		SpringApplication.run(BidProjectApplication.class, args);
	}

}
