package com.ncbank.esb.esb.controller;

import com.ncbank.esb.esb.dao.OverviewDAO;
import com.ncbank.esb.esb.domain.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/overview")
public class OverviewController {

    @Autowired
    private OverviewDAO dao;

    @RequestMapping(value = "/api/overview/{svcCode}", method = RequestMethod.GET)
    public List<Overview> findOneCity(@PathVariable("svcCode") String svcCode) {
        return dao.findBySvcCode(svcCode);
    }
}
