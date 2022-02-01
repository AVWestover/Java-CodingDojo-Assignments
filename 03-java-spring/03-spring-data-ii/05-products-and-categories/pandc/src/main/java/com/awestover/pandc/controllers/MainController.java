package com.awestover.pandc.controllers;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.bind.annotation.RestController;
import com.awestover.pandc.models.Product;
import com.awestover.pandc.services.ProductService;
import com.awestover.pandc.models.Category;
import com.awestover.pandc.services.CategoryService;

import java.util.List;

import javax.validation.Valid;

@Controller
public class MainController {
    private final ProductService productService;
	private final CategoryService categoryService;
    
    public MainController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }
    // / redirects to add a product
	@RequestMapping( value="/", method=RequestMethod.GET )
	public String index() { 
		return "redirect:/products/new"; 
	}
    
    // NEW PRODUCT
    
    @RequestMapping("/products/new")
    public String newProduct(Model model, @ModelAttribute("product") Product product) {
        List<Product> products = productService.allProducts();
        model.addAttribute("products", products);
        return "products.jsp";
    }
    
    @RequestMapping(value="/products/new", method=RequestMethod.POST)
    public String createProduct(Model model, @Valid @ModelAttribute("product") Product product, BindingResult result) {
        if (result.hasErrors()) {
        	List<Product> products = productService.allProducts();
        	model.addAttribute("products", products);
            return "products.jsp";
        } else {
        	productService.createProduct(product);
            return "redirect:/products/new";
        }
    }

    
    // NEW CATEGORY
        
    @RequestMapping("/categories/new")
    public String newCategory(Model model, @ModelAttribute("category") Category category) {
        List<Category> categories = categoryService.allCategories();
        model.addAttribute("categories", categories);
        return "category.jsp";
    }
    
    @RequestMapping(value="/categories/new", method=RequestMethod.POST)
    public String createCategory(Model model, @Valid @ModelAttribute("category") Category category, BindingResult result) {
        if (result.hasErrors()) {
        	List<Category> categories = categoryService.allCategories();
        	model.addAttribute("categories", categories);
            return "category.jsp";
        } else {
        	categoryService.createCategory(category);
            return "redirect:/categories/new";
        }
    }
    
    // PRODUCTS/ID
    
	@RequestMapping(value = "/products/{id}", method=RequestMethod.GET)
	public String pshow(@PathVariable("id") Long id, Model model) {
		Product product = productService.getProductById( id );
		model.addAttribute( "product", product );
		model.addAttribute( "categories", productService.allCategories( product ) );
		model.addAttribute( "nonCategories", productService.allNonCategories( product ) );
		return "pshow.jsp";
	}
	
	@RequestMapping( value="/products/{prod_id}", method=RequestMethod.POST )
	public String addCategory( @PathVariable("prod_id") Long prod_id, Model model, @RequestParam(value="category") Long cat_id ) {
		Product prod = productService.getProductById( prod_id );
		Category cat = categoryService.getCategoryById( cat_id );
		
		prod.getCategories().add( cat );
		productService.updateProduct( prod );
		
		return "redirect:/products/" + prod_id.toString();
	}
	
	// CATEGORIES/ID
	@RequestMapping(value = "/categories/{id}", method=RequestMethod.GET)
	public String cshow(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.getCategoryById( id );
		model.addAttribute( "category", category );
		model.addAttribute( "products", categoryService.allProducts( category ) );
		model.addAttribute( "nonProducts", categoryService.allNonProducts( category ) );
		return "cshow.jsp";
	}
	
	@RequestMapping( value="/categories/{cat_id}", method=RequestMethod.POST )
	public String addProduct( @PathVariable("cat_id") Long cat_id, Model model, @RequestParam(value="product") Long prod_id ) {
		Category cat = categoryService.getCategoryById( cat_id );
		Product prod = productService.getProductById( prod_id );
		
		cat.getProducts().add( prod );
		categoryService.updateCategory( cat );
		
		return "redirect:/categories/" + cat_id.toString();
	}

}