package com.kumgan.finplan.models;

import javax.persistence.*;
import java.util.ArrayList;
import com.kumgan.finplan.utils.Formatter;

@Entity
public class ExpenseItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column
    String code;
    @Column
    String name;
    @Column
    double sum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public String getSumString() {
      return   Formatter.formatSum(sum);
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


}
