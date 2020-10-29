package com.codecool.stockhub;

import com.codecool.stockhub.model.Company;
import com.codecool.stockhub.service.CompanyList;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyListTest {

    @Autowired
    CompanyList companyList;

    @Test
    void testFilterDataWithWrongJSONInput() {
        String content = "{ foo : foo }";
        assertThrows(JSONException.class, () -> companyList.filterData(content));
    }

    @Test
    void testFilterDataWithEmptyJSONInput() {
        String content = "";
        assertThrows(JSONException.class, () -> companyList.filterData(content));
    }


}