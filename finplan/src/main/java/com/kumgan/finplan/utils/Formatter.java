package com.kumgan.finplan.utils;

import java.util.ArrayList;

public class Formatter {
    static  public String formatSum(double sum){
            var string_sum=Double.toString(sum);
            var is_dot=false;
            ArrayList<String> l_after_dot=new ArrayList<>();
            for (String l:string_sum.split("")){
                if (is_dot){
                    l_after_dot.add(l);
                }
                if (l.equals(".")){
                    is_dot=true;
                }

            }
            if (l_after_dot.size()==1 && l_after_dot.get(0).equals("0")){
                string_sum= string_sum.replace(".0","");
            }
            return string_sum;
    }

}
