package com.ncbank.esb.esb.controller;

import com.ncbank.esb.esb.dao.OverviewDAO;
import com.ncbank.esb.esb.domain.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/overview")
@EnableAutoConfiguration
public class OverviewController {

    @Autowired
    private OverviewDAO dao;

    @RequestMapping(value = "/api/{svcCode}", method = RequestMethod.GET)
    public String findOneCity(Model model,@PathVariable("svcCode") String svcCode) {

        List<Overview> overviews = dao.findBySvcCode(svcCode);
        model.addAttribute("overviewList",overviews);
        return "list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String findAll(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "100") Integer size, Model model) {
        int start = (page - 1) * 2;
        int end = start + size;
        List<Overview> overviews = dao.findAll(start,end);
        int totalPage = dao.getCount();

        model.addAttribute("overviewList",overviews);


        return "list";
    }


}
