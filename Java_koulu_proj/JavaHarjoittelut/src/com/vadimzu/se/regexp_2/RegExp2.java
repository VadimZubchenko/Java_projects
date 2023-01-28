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
public class RegExp2 {

    public static void main(String[] args) {
        
        String text = "www2%-_.dfadf_.s_-d@hotmail.com.com2";
// "^[\\w] means first word must include Any word and '-' & '_' character  "
        Pattern p = Pattern.compile("^[\\w-.%+_]+\\@[\\w.-]+\\.[a-zA-Z]{2,4}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Matchers: " + m.group());
        }
      
    }

}
