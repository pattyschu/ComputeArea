/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceJAVAchapter2;

/**
 *
 * @author pattyschu
 * @version listing 2.1 Computer ARea
 * @since 8/30/2015
 */
public class ComputeArea 
{
    public static void main(String[] args)        
    {  
        //step 1: Read in RADIUS enter by user, and store it by declaring a variable        
        //declare variable
            double radius;      //this are memory locations
            double area;        //every variable has a name, type, size & value
            
        //Assign a FIXED value to radius
            radius = 40;

        //STEP 2: Compute Area
            //assign the RESULT OF THE EXPRESSION "radius * radius * 3.14159" to AREA
            area = radius * radius * 3.14159;
            
        //Step 3: Display the results of Area with the PRINT METHOD

            System.out.println("The area of Circle of radius is " + radius + " is " + area);
            
            // the "+" is called a STRING CONCATINATION OPERATOR
            //If the string is combined with a number, the number is converted to a string
            /*a string CANNOT cross lines in the source code, a compile error will occured,
                you will need a "+" to concatinte both lines
            */
            System.out.println("Introduction to Java Programming, " + 
                    "by Y. Daniel liang");
    }
          
    
}
