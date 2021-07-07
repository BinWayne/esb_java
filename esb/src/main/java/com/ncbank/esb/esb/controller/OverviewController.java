package com.ncbank.esb.esb.controller;

import com.ncbank.esb.esb.dao.OverviewDAO;
import com.ncbank.esb.esb.domain.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/overview")
@EnableAutoConfiguration
public class OverviewController {

    @Autowired
    private OverviewDAO dao;

    @RequestMapping(value = "/api/{svcCode}", method = RequestMethod.GET)
    public List<Overview> findOneCity(@PathVariable("svcCode") String svcCode) {

        return dao.findBySvcCode(svcCode);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return  "hello";
    }
}
