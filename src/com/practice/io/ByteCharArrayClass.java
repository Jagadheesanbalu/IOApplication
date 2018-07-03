/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jagadheesan Balu
 */
public class ByteCharArrayClass {
    
    public static void main(String args[]) {
        
        char[] c = {1,2,3,4,5};
        
        //read a char Array via CharArrayReader
        Reader reader = new CharArrayReader(c);
        
        int data;
        try {
            while((data = reader.read()) != -1) {
                System.out.println(data);   
            }
        } catch (IOException ex) {
            //Logger.getLogger(ByteCharArrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //write to char Array via CharArrayWriter
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write("abcde".toCharArray());
        } catch (IOException ex) {
            //Logger.getLogger(ByteCharArrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        char[] cc = writer.toCharArray();
        System.out.println("Output");
        System.out.println(cc);
    }
}
