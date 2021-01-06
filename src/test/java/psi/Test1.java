package psi;

import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Sales;
import com.spring.mvc.psi.repository.ProductRepository;
import com.spring.mvc.psi.repository.PurchaseRepository;
import com.spring.mvc.psi.repository.SalesRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
    
    @Test
    public void t1(){
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springMVC-servlet.xml");
        
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        PurchaseRepository purchaseRepository = ctx.getBean(PurchaseRepository.class);
        SalesRepository sales = ctx.getBean(SalesRepository.class);
        
        
               List<Product> products =  Arrays.asList("A", "B", "C")
                        .stream()
                        .map(Product::new)
                        .collect(Collectors.toList());

               productRepository.save(products);
               
//          Product p1 = new Product();
//          p1.setName("A");
//          Product p2 = new Product();
//          p2.setName("B");
//          Product p3 = new Product();
//          p3.setName("C");
//          productRepository.save(Arrays.asList(p1, p2, p3));
//          System.out.println("OK");
              
    }
}
