package com.buba.entity;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:19:40
 */
public class ShoppingTrolley {
    private String userName;
    private Integer bookId;
    private Integer shopNum;

    public ShoppingTrolley() {
    }

    public ShoppingTrolley(String userName, Integer bookId, Integer shopNum) {
        this.userName = userName;
        this.bookId = bookId;
        this.shopNum = shopNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getShopNum() {
        return shopNum;
    }

    public void setShopNum(Integer shopNum) {
        this.shopNum = shopNum;
    }

    @Override
    public String toString() {
        return "ShoppingTrolley{" +
                "userName='" + userName + '\'' +
                ", bookId=" + bookId +
                ", shopNum=" + shopNum +
                '}';
    }
}
