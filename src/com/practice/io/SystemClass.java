/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author Jagadheesan Balu
 */
public class SystemClass {
    public static void main(String args[]) throws FileNotFoundException {
        OutputStream output = new FileOutputStream("D:\\Jaggy\\Others\\SampleFiles\\new.txt");
        
        PrintStream printOut = new PrintStream(output);
        
        System.setOut(printOut);
        
        System.out.println("***New Console***");
        
        System.out.flush();
    }
}
