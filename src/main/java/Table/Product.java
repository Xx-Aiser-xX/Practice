package Table;
import jakarta.persistence.*;

@Entity
@Table(name = "товар")
public class Product {
    private int productCode;
    private String name;
    private double price;

    public Product(String name,double price){
        setName(name);
        setPrice(price);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "код_товара")
    public int getProductCode() { return productCode;}

    public void setProductCode(int productCode) { this.productCode = productCode;}

    @Basic
    @Column(name = "название_товара")
    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    @Basic
    @Column(name = "цена")
    public double getPrice() { return price;}

    public void setPrice(double price) { this.price = price;}
}
