/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhminh.mathutil.main;

import com.anhminh.mathutil.core.MathUtil;

/**
 *
 * @author minhd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryTDDFirst();
    }
    public static void tryTDDFirst(){
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        //test case 1:
        
        System.out.println("0! Status | expected: " + expected +
                " | actual : " + actual);
        
        //test case 2:
        
        System.out.println("2! Status | expected: 2" +
                " | actual : " + MathUtil.getFactorial(2));
        
        //test case 3:
        
        System.out.println("5! Status | expected: 120" +
                " | actual : " + MathUtil.getFactorial(5));
        
        //test case 4:
        
        System.out.println("-5! Status | expected: ErrorException" +
                " | actual : ");
        MathUtil.getFactorial(-5);
        
    }
}
