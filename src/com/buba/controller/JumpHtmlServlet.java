package com.buba.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:11:30
 */
public class JumpHtmlServlet extends ViewBaseServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 请求转发跳转到 /WEB-INF/view/ 路径.html

        // 判断跳转路径
        // 登录
        if(req.getParameter("jump").equals("login")){
            processTemplate("/pages/user/login",req,resp);
        }
        // 注册
        if(req.getParameter("jump").equals("regist")){
            processTemplate("/pages/user/regist",req,resp);
        }
        // 购物车
        if(req.getParameter("jump").equals("cart")){
            processTemplate("/pages/cart/cart",req,resp);
        }
        // 后台管理
        if(req.getParameter("jump").equals("book_manager")){
            processTemplate("/pages/manager/book_manager",req,resp);
        }
    }
}
