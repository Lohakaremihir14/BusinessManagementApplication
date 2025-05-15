package com.business.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.business.entities.Product;
import com.business.loginCredentials.AdminLogin;
import com.business.loginCredentials.UserLogin;
import com.business.service.ProductServices;

@Controller
public class HomeController 
{
	@Autowired
	private ProductServices productServices;
	
	@GetMapping("/")
    public String showHomePage() 
	{
        return "Home";  
    }
	
	@GetMapping("/home")
	public String home()
	{
		return "Home";
	}

	@GetMapping("/products")
	public String products( Model model)
	{ 
		List<Product> allProducts = this.productServices.getAllProducts();
		List<String> imgList= Arrays.asList(
				 "product1.jpeg",
			      "product2.jpg",
			      "product3.jpg",
			      "product4.jpeg");
		model.addAttribute("products", allProducts);
		 model.addAttribute("imgList", imgList);
		return "Products";
	}

	@GetMapping("/location")
	public String location()
	{
		return "LocateUs";
	}

	@GetMapping("/about")
	public String about()
	{
		return "About";
	}

	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("adminLogin",new AdminLogin());
		model.addAttribute("userLogin",new UserLogin());
		return "Login";
	}
	
	@GetMapping("/Add_User")
	public String showRegisterPage() {
	    return "Add_User"; 
	}
}
