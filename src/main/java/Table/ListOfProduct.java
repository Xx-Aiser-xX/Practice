package Table;
import jakarta.persistence.*;

@Entity
@Table(name = "список_товаров")
public class ListOfProduct {
    private int id;
    private int productCode;
    private int theQuantityOfTheProduct;

    public ListOfProduct(int productCode, int theQuantityOfTheProduct){
        setProductCode(productCode);
        setTheQuantityOfTheProduct(theQuantityOfTheProduct);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_товара")
    public int getId() { return id;}

    public void setId(int id) { this.id = id;}
    @Basic
    @Column(name = "код_товара")
    public int getProductCode() { return productCode;}

    public void setProductCode(int productCode) { this.productCode = productCode;}
    @Basic
    @Column(name = "кол_во_товара")
    public int getTheQuantityOfTheProduct() { return theQuantityOfTheProduct;}

    public void setTheQuantityOfTheProduct(int theQuantityOfTheProduct) {
        this.theQuantityOfTheProduct = theQuantityOfTheProduct;
    }
}
