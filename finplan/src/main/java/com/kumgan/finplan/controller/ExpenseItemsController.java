package com.kumgan.finplan.controller;
import com.kumgan.finplan.models.ExpenseItemModel;
import com.kumgan.finplan.services.ExpenseService;
import com.kumgan.finplan.utils.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ExpenseItemsController {

    @Autowired
    ExpenseService service;

    @GetMapping("/expenses")
    public ModelAndView getExpenses(Model model){
        var list =service.selecAll();
        var params=new HashMap<String,Object>();
        params.put("list",list);
        double totalsum=list.stream().mapToDouble(ex->
            ex.getSum()).sum();

        params.put("totalsum", Formatter.formatSum(totalsum));
        return  new ModelAndView("expenses", params);
    }



    @PostMapping("/expenses")
    public String postExpense(@RequestBody ExpenseItemModel expenseItemModel){
        String response;
        try {
            service.save(expenseItemModel);
            response="succes!";
        }catch (Exception e){
            response="error:"+e.getMessage();
        }
        return  response;

    }

    @GetMapping("/hello")
    public String hello(){

        return "Hello";
    }
}
