package com.buba.dao;

import com.buba.entity.ShoppingTrolley;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:19:41
 */
public interface ShoppingTrolleyDao {
    //查询: 通过用户名和图书id查询是否有该购物信息
    int findShopByNameAndBookId(String userName,Integer bookId);
    // 查询用户的购物车商品数量
    int findUserShopNum(String userName);
    //添加: 通过用户名和选择的图书编号添加到购物车:(默认数量为1)
    int addShopping(ShoppingTrolley shoppingTrolley);
    // 添加时,增加购物数量:
    int addShopNum(ShoppingTrolley shoppingTrolley);
    // 点击-,减少购物数量:
    int deleteShopNum(ShoppingTrolley shoppingTrolley);
    //删除: 通过用户名和图书id删除该购物信息
    int deleteShoping(ShoppingTrolley shoppingTrolley);
    // 清空用户购物车
    int deleteUserShop(String userName);
}
