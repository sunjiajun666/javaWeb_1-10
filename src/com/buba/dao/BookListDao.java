package com.buba.dao;

import com.buba.entity.BookList;

import java.util.List;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:19:31
 */
public interface BookListDao {
    // 添加图书
    int addBookList(BookList bookList);
    // 删除图书: (先删除购物车中的该图书)
    int deleteBookList(Integer bookId);
    // 修改图书:
    int updateBookList(BookList bookList);

    //查询全部图书:
    // 查询全部图书记录总条数
    int findAllBookCount();
    // (分页查询,每页10条数据)
    List<BookList> findAllBookList(Integer pageNo);
}
