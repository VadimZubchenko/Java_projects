/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vadimzu.se.regexp_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vadimzubchenko
 */
public class RegExpDigit {

    public static void main(String[] args) {
        double sum = 0;
        String text = "qsdfasdr349.040-43,3-23.3434-343,aa23.3-0,4.30";

        Pattern p = Pattern.compile("-?\\d*[.]?\\d{2}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            double digit = Double.parseDouble(m.group());
            sum = sum + digit;
            System.out.println(digit + ", ");
            
        }
        System.out.printf("Summa: %.2f\n",sum);
    }

}
