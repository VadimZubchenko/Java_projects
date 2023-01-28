/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vadimzu.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vadimzubchenko
 */
public class RegExp {
    
public static void main(String args[]) {
      double sum=0;
      double num=0;
      
    String text = "seadfa7-3dfa313adf;-17_1+2-2.213";
    
    // "?" Ноль или одно,"-" before number
    // "*" Ноль или много
    // "+" Одно или более (7, 45, 432….)
    // "\\d" or "[0-9]" takes just digit
    
    Pattern p = Pattern.compile("-?[0-9]*[.]?[0-9]+");
    Matcher matcher = p.matcher(text);
    
    while(matcher.find()){
        num = Double.parseDouble(matcher.group());
        sum = sum + num;
        System.out.print(num + ", " );
    }
      System.out.println("\nSum of number = " + sum);
    }

}
