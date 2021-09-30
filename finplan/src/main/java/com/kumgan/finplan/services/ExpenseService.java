package com.kumgan.finplan.services;

import com.kumgan.finplan.models.ExpenseItemModel;
import com.kumgan.finplan.repo.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepo expenseRepo;

    public void save(ExpenseItemModel expenseItemModel){
        expenseRepo.save(expenseItemModel);
    }

    public List<ExpenseItemModel> selecAll(){
        ArrayList<ExpenseItemModel> list=new ArrayList<>();
        expenseRepo.findAll().forEach(list::add);
        return list;
    }
}
