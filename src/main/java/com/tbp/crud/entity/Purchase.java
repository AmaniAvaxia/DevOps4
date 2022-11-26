package com.tbp.crud.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "purchase")
public class Purchase {

    public Purchase() {
        // TODO Auto-generated constructor stub
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name_Purch, Date, Provider,Article,Quantity;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName_Purch() {
        return Name_Purch;
    }
    public void setName_Purch(String name_Purch) {
        Name_Purch = name_Purch;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getProvider() {
        return Provider;
    }
    public void setProvider(String provider) {
        Provider = provider;
    }
    public String getArticle() {
        return Article;
    }
    public void setArticle(String article) {
        Article = article;
    }
    public String getQuantity() {
        return Quantity;
    }
    public void setQuantity(String quantity) {
        Quantity = quantity;
    }
    public Purchase(String name_Purch, String date, String provider, String article, String quantity) {
        super();
        Name_Purch = name_Purch;
        Date = date;
        Provider = provider;
        Article = article;
        Quantity = quantity;
    }
    public Purchase(int id, String name_Purch, String date, String provider, String article, String quantity) {
        super();
        this.id = id;
        Name_Purch = name_Purch;
        Date = date;
        Provider = provider;
        Article = article;
        Quantity = quantity;
    }

}