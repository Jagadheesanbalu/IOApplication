/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jagadheesan Balu
 */
public class PipeClass {
    
    public static void main(String args[]) throws IOException {
        
        final PipedOutputStream pipeOutputStream = new PipedOutputStream();
        final PipedInputStream pipeInputStream = new PipedInputStream(pipeOutputStream);
        
        Thread thread1 = new Thread(new Runnable() {
           
            @Override
            public void run() {
                try {
                    pipeOutputStream.write("welcome to pipes!".getBytes());
                } catch (IOException ex) {
                    //Logger.getLogger(PipeClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
        
        Thread thread2 = new Thread(new Runnable() {
           
            @Override
            public void run() {
                try {
                    int data;
                    while((data = pipeInputStream.read() ) != -1) {
                        System.out.println("Read msg:"+(char)data); 
                    }
                } catch (IOException ex) {
                    //Logger.getLogger(PipeClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        });
        
        
        thread1.start();
        thread2.start();
        
        
    } 
}
