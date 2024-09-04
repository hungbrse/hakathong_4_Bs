package ra.run;

import ra.business.entity.Catalog;
import ra.model.Product;
import ra.service.Catalogservice;
import ra.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
 public static List<Catalog> catelogList = new ArrayList<Catalog>();
 public static List<Product> productList = new ArrayList<Product>();

 public static void main(String[] args) {
  Catalogservice catalogservice = new Catalogservice();
  ProductService productservice = new ProductService();
  Scanner sc = new Scanner(System.in);
   boolean isLoop = true;

   do {
    System.out.println("1. quản lý danh mục ");
    System.out.println("2. quản lý sản phẩm ");
    System.out.println("3. thoát");
    int choice = Integer.parseInt(sc.nextLine());
    switch (choice) {
     case 1:
       catalogservice.catalogController(sc);
       break;
       case 2:
        productservice.ProductController(sc);
        break;
        case 3:
         isLoop = false;
    }

   }while (isLoop);
 }
}
