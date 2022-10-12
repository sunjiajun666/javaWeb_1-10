package com.buba.entity;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:19:28
 */
public class BookList {
    private Integer bookId;
    private String bookName;
    private Double bookPrice;
    private String bookAuthor;
    private Integer bookSales;
    private Integer bookStock;

    public BookList() {
    }

    public BookList(Integer bookId, String bookName, Double bookPrice, String bookAuthor, Integer bookSales, Integer bookStock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookSales = bookSales;
        this.bookStock = bookStock;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getBookSales() {
        return bookSales;
    }

    public void setBookSales(Integer bookSales) {
        this.bookSales = bookSales;
    }

    public Integer getBookStock() {
        return bookStock;
    }

    public void setBookStock(Integer bookStock) {
        this.bookStock = bookStock;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookSales=" + bookSales +
                ", bookStock=" + bookStock +
                '}';
    }
}
