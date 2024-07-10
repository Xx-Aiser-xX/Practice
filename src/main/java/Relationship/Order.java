package Relationship;

import Table.Client;
import Table.ListOfProduct;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "заказ")
public class Order {
    private int id;
    private Client client;
    private ListOfProduct listOfProduct;
    private Date date;
    private int theQuantityOfTheProduct;


    public Order(int id, Client client, ListOfProduct listOfProduct,
                 Date date, int theQuantityOfTheProduct){
        setId(id);
        setClient(client);
        setListOfProduct(listOfProduct);
        setDate(date);
        setTheQuantityOfTheProduct(theQuantityOfTheProduct);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_заказа")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_клиента", referencedColumnName = "id_клиента")
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
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
    @Column(name = "кол_во_товара")
    public int getTheQuantityOfTheProduct() {
        return theQuantityOfTheProduct;
    }
    public void setTheQuantityOfTheProduct(int theQuantityOfTheProduct) {
        this.theQuantityOfTheProduct = theQuantityOfTheProduct;
    }
}
