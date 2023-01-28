/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myTraining.se.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vadimzubchenko
 */
public class RegExpII {

    public static void main(String[] args) {
        double sum = 0;
        String text = "-adfadfsa23-1.5-1.5r43,40-+-427.60.427.60adfa-3ds";

        Pattern p = Pattern.compile("-?[0-9]+[.]?[0-9]{0,2}");
        Matcher m = p.matcher(text);

        while (m.find()) {

            double num = Double.parseDouble(m.group());
            System.out.print(num + ", ");
            sum = sum + num;
            
        }
        System.out.println("\nsumma: " + sum);

    }

}
