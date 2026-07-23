package com.java.OOPS.Streams;
import com.java.OOPS.Streams.CsvReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Streams {
     public static void main(String[] args) throws IOException {
         CsvReader csvReader = new CsvReader();
         List<Product> products = new ArrayList<>();
         try{
             products = csvReader.getProductsFromCsv();
         } catch(IOException e){
             System.out.println(" Error reading csv file:"+e.getMessage());
         }
         List<Product> filteredProducts = new ArrayList<>();
         for(Product product: products){
             if (product.getCategory().equals("Sports")) {
                 filteredProducts.add(product);
             }
         }
         for(Product product: filteredProducts){
             System.out.println(product);
         }
         System.out.println("----------------------------------------------");
         System.out.println("Using Streams:");
         List<Product> filteredProducts1 = products.stream()
                 .filter(product -> product.getMaxRetailPrice() >= 10000 && product.getMaxRetailPrice() <= 100000)
                 .toList();
         for(Product product: filteredProducts1){
             System.out.println(product);
         }
         List<String> ProductNames = products.stream()
                 .map(Product::getName).toList();
         System.out.println("Names of the products we provide:");
         for (String productName: ProductNames){
             System.out.println(productName);
         }
         //sorting products based on price

         List<Product> sortedProductsBasedOnPrice = products.stream().sorted((p1, p2) -> Double.compare(p1.getMaxRetailPrice(), p2.getMaxRetailPrice())).toList();
         System.out.println(sortedProductsBasedOnPrice);

         // printing non-duplicates
         List<Product> nonDuplicateProducts = products.stream().distinct().toList();
         System.out.println(nonDuplicateProducts.size());

         //looking for available products
         System.out.println("Available Products:");
         List<Product> AvailableProducts = products.stream().filter(product -> product.isAvailable() == true).toList();
         for(Product product: AvailableProducts){
             System.out.println(product);
         }







     }

}
