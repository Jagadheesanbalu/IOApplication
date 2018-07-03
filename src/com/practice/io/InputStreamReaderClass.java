/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Jagadheesan Balu
 */
public class InputStreamReaderClass {
    
    public static void main(String args[]) throws IOException {
        
        System.out.println("Give input");
        Reader io = new InputStreamReader(System.in);
        
        
        
        //System.out.println("output");
        
        int data;
        while( (data = io.read()) != -1) {
            System.out.println(data + " - "+(char)data);   
        }
        
        
    }
    
    
}
