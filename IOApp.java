/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ioapp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Jagadheesan Balu
 */
public class IOApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // create & read a file
        File f1 = new File("D:\\Jaggy\\Others\\SampleFiles\\sample1.txt");
        Writer out1 = new FileWriter(f1);
        
        out1.write("Welcome to Netbeans!!!");
        
        out1.close();
        
        File f2 = new File("D:\\Jaggy\\Others\\SampleFiles\\sample2.txt");
        
        Writer out2 = new FileWriter(f2);
        
       
        
        Reader in = new FileReader(new File("D:\\Jaggy\\Others\\SampleFiles\\sample1.txt"));
        
        //copy
        int data = in.read();
        while(data != -1) {
            //System.out.print((char)data);
            out2.write(data);
            data = in.read();
        }
        out2.write(" Prem");
        out2.close();
        
        
        //compare
        Reader in1 = new FileReader(new File("D:\\Jaggy\\Others\\SampleFiles\\sample1.txt"));
        Reader in2 = new FileReader(new File("D:\\Jaggy\\Others\\SampleFiles\\sample2.txt"));
        int data1 = in1.read();
        int data2 = in2.read();
        
        
        if(f1.length() == f2.length()) {
            while(data1 !=-1 || data2 !=-1) {
                if(data1!=data2) {
                    System.out.println("Not equal :"+(char)data1+ ","+(char)data2);
                }
                data1 = in1.read();
                data2 = in2.read();

            }
        } else {
            System.out.println("File size is different");
        }
        
        
        
    }
}
