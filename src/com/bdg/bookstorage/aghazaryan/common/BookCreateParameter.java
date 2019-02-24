package com.bdg.bookstorage.aghazaryan.common;

public class BookCreateParameter {

    private String name;
    private int price;
    private AuthorCreateParameter[] authorCreateParameters;

    public BookCreateParameter(String name, String title, int price, AuthorCreateParameter[] authorCreateParameters) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public AuthorCreateParameter[] getAuthorCreateParameters() {
        return authorCreateParameters;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}