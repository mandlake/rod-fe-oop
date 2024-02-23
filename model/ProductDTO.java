package model;

public class ProductDTO {
    private final int pno;
    private final String name;
    private final String company;
    private final int price;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "pno=" + pno +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPno() {
        return pno;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    public ProductDTO(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
