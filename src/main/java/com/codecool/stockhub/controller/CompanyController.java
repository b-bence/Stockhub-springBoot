package com.codecool.stockhub.controller;


import com.codecool.stockhub.service.HTTPConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private HTTPConnection httpConnection;

    private static final String COMPANIES_URL = "https://finnhub.io/api/v1/stock/symbol?exchange=US&token=bu21mlf48v6u9tetnbt0";

    @GetMapping("/companies")
    public StringBuilder companyList(HttpServletResponse response) throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setStatus(200);
        return httpConnection.getContent(COMPANIES_URL);
    }



}
