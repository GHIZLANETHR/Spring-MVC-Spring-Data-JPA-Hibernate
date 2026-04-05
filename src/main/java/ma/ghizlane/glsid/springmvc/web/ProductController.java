package ma.ghizlane.glsid.springmvc.web;

import ma.ghizlane.glsid.springmvc.entities.Product;
import ma.ghizlane.glsid.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/index")
    public  String index(Model model){
        List<Product> products= productRepository.findAll();
        System.out.println(products);
        model.addAttribute("productList",products);
        return "products";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Long id){
        productRepository.deleteById(id);
        return "redirect:/index";
    }
}
