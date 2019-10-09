package com.codecool.shop.controller;

import com.codecool.shop.config.TemplateEngineUtil;
import com.codecool.shop.dao.implementation.UserDaoMem;
import com.codecool.shop.model.Address;
import com.codecool.shop.model.Order;
import com.codecool.shop.model.User;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/checkout"})
public class CheckoutController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(req.getServletContext());
        req.getParameterMap();
        WebContext context = new WebContext(req, resp, req.getServletContext());
        engine.process("cart/checkout.html", context, resp.getWriter());
        //dodac order
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(req.getServletContext());

        Order order ;

        Address shippingAdress = new Address(
                req.getParameter("country_shipping"),
                req.getParameter("city_shipping"),
                req.getParameter("zipcode_shipping"),
                req.getParameter("adress_shipping"));

        Address billingAdress = new Address(
                req.getParameter("country_billing"),
                req.getParameter("city_billing"),
                req.getParameter("zipcode_billing"),
                req.getParameter("adress_billing"));

//        User user = new User(
//                req.getParameter("name"),
//                req.getParameter("username"),
//                req.getParameter("email"),
//                req.getParameter("phone"),
//                shippingAdress,
//                billingAdress,
//                order;
//        );




;
//        UserDaoMem.getInstance().add();
    }

}