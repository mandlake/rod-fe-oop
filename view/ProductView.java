package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 4; i++) {
            products.add(Product.builder()
                    .pno(i + 1)
                    .name(util.createRandomName())
                    .company(util.createRandomCompany())
                    .price(util.createRandomInteger(1000, 8999)).build());
        }

        products.forEach(i -> {
            System.out.print(i.getPno() + "\n"
                    + i.getName() + "\n"
                    + i.getCompany() + "\n"
                    + i.getPrice() + "\n\n");
        });
    }
}
