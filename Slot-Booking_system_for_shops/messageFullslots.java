//                                               ***** JAVA MINI PROJECT ******
// FULLY FLEXIBLE SLOT SYSTEM FOR SHOP
// GROUP 17
// 19BAI10111 PRACHI BHATT
// 19BAI10115 TOSHINI AGARWAL
// 19BAI10022 AYUSHREE GHOSHAL
// 19BAI10077 RASHMI RAWAT

/* PROBLEM STATEMENT: Problem statement -In regard with the current pandemic situation we aim to  design a slot system that would 
enable people to book their slots (each slot limited to a specific number of customers) and generate token nos to refrain from social gathering .
We have considered a supermarket and assumed that there are different floors each dedicated to one specific item. 
Eg: the first floor for grocery , second for clothes , third for accessories,  fourth for daily essentials . We can restrict the no of people to 20(suppose) for each slot*/

//contribution:Rashmi rawat
package Javagui;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class messageFullslots extends JFrame
{
    JLabel l1;  
    public messageFullslots()
    {
        setLayout(new FlowLayout());
        l1=new JLabel("This Slot is full please try another slot");
        add(l1);
    }
}