package Relationship;

import Table.Employee;
import Table.ListOfProduct;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "изготавливает")
public class Manufactures {
    private int id;
    private Employee employee;
    private ListOfProduct listOfProduct;
    private Date date;
    private int quantityOfGoodsProduced;
    private Date expirationDate;

    public Manufactures(int id, Employee employee, ListOfProduct listOfProduct,
                        Date date, int quantityOfGoodsProduced, Date expirationDate){
        setId(id);
        setEmployee(employee);
        setListOfProduct(listOfProduct);
        setDate(date);
        setQuantityOfGoodsProduced(quantityOfGoodsProduced);
        setExpirationDate(expirationDate);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_партии")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_сотрудника", referencedColumnName = "id_сотрудника")
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_товара", referencedColumnName = "id_товара")
    public ListOfProduct getListOfProduct() {
        return listOfProduct;
    }
    public void setListOfProduct(ListOfProduct listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    @Basic
    @Column(name = "дата")
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "кол_во_произведённого_товара")
    public int getQuantityOfGoodsProduced() {
        return quantityOfGoodsProduced;
    }
    public void setQuantityOfGoodsProduced(int quantityOfGoodsProduced) {
        this.quantityOfGoodsProduced = quantityOfGoodsProduced;
    }

    @Basic
    @Column(name = "срок_годности")
    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
