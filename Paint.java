
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            
            //declare double totalSqFt;
            double totalSqFt = 2*((width * length) + (height * length) + (height * width)) - (width * length);;
            System.out.println(totalSqFt);
            //declare double paintNeeded and compute the total square feet to be painted--think;
            double paintNeeded = totalSqFt / 350;
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            
            System.out.println("Length = " + length + " ft");
            System.out.println("Width = " + width + " ft");
            System.out.println("Height = " + height + " ft");
            System.out.println("Gallons of paint needed = " + paintNeeded + " gallons");
        }
}