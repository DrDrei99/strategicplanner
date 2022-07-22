/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drei.strategicplanner;
import java.awt.*;

/**
 *
 * @author andrei
 */
public class AWTExample1 extends Frame {    
  
   // initializing using constructor  
   AWTExample1() {  
  
      // creating a button   
      Button b = new Button("Click Me!!");  
  
      // setting button position on screen  
      b.setBounds(30,100,80,30);  
  
      // adding button into frame    
      add(b);  
  
      // frame size 300 width and 300 height    
      setSize(300,300);  
  
      // setting the title of Frame  
      setTitle("Strategic Planner");   
          
      // no layout manager   
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
      
}    
  
}    