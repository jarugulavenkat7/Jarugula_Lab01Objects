/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1a
        String string1 = "  Welcome    "; 
        String string2 = " to "; 
        String string3 = "  the first    "; 
        String string4 = "Lab Activity "; 
        String string5 = " in the   ";
        String string6 = " OOP Course ";
        
        System.out.println("OUTPUT:");
        System.out.println("******** String Class ********");
        //1b
        String concatenatedString = string1 + string2 +string3 + string4 
                + string5 + string6;
        System.out.println(concatenatedString);
        
        System.out.println("The length of the concatenated string is: "
                +concatenatedString.length());
        //1c
        String trimmedConcatenatedString = string1.trim()+" "+string2.trim()+" "
                +string3.trim()+" "+string4.trim()+" "+string5.trim()+" "
                +string6.trim()+"!";
        
        System.out.println(trimmedConcatenatedString);
        
        System.out.println("Length of the above string is: "
                +trimmedConcatenatedString.length());
        //1d
        String labActivitySubstring = trimmedConcatenatedString.substring(21,33);
        
        System.out.println("Retrieved: "+ labActivitySubstring);
        
        //1e
        System.out.println("Index of first I in 'LAB ACTIVITY' is at: "
                +labActivitySubstring.toUpperCase().indexOf("I"));
        //2a
        String intrestingString = "lab interesting activities are activities lab "
                + "Interesting Lab Activities Are Interesting Lab activities "
                + "Lab Interesting";
        System.out.println("First occurrence of Interesting is at: "
                +intrestingString.indexOf("Interesting"));
        
        //2b
        
        String courseString = "Object-Oriented-Programming 44542";
           System.out.println(courseString);
        System.out.println((courseString.replaceAll("-", "_"))
                .replaceAll(" ", "-"));
        //2c
        String String1 = "Computer";
        String String2 = "Science";
        System.out.println("The ID is: "+String1.substring(0, 4)
                +(String2.substring(0,3)).toUpperCase()
                +String1.length()+String2.length());
        
        //2d
        System.out.println("I Chose Applied Compter Science to enhance "
                + "my programming skills and to learn "
                + "more about web applications.");
        
        
        System.out.println("\n******** Math Class ********");
        
        int value1 = 9;
        int value2 = 13;
        //3a.i
        System.out.println("sqrt (value12 +value22): "+Math.sqrt((value1*value1)
                +(value2*value2)));
        //3a.ii
        System.out.println("exp (9): "+Math.exp(value1));
        //3a.iii
        System.out.println("sec (9): "+1/Math.cos(value1));
        
        int myNumber=27;
        //3a.iv
        System.out.println("Cube root of 27.00: "+Math.cbrt(myNumber));
        
        System.out.println("Logarithm value is: "+Math.log(myNumber));
        //3a.v
        System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) = "
                +(Math.tan(60)-Math.tan(45))/(1+(Math.tan(60)*Math.tan(45))));
        
        //3a.vi
        System.out.println("Theoretical value of tan (90) is: " + Math.tan(90));
        
        System.out.println("Cubic root of modulus value of tan (90) is: "
                +Math.cbrt(Math.abs(Math.tan(90))));
        
        //3a.vii
        System.out.println("Cosecant of 30 is: "+1/Math.sin(30));
        
        System.out.println("Secant of 30 is: "+1/Math.cos(30));
        
        System.out.println("Minimum value in Cosec (30) and Sec (30) is: "
                +Math.min(1/Math.sin(30), 1/Math.cos(30)));
        
        System.out.println("Maximum value in Cosec (30) and Sec (30) is: "
                +Math.max(1/Math.sin(30), 1/Math.cos(30)));
        
        //3a.viii
        int myNumber1 = 45;
        int myNumber2 = 27;
        
        System.out.println("Rounded Value of cos 45: "
                +Math.round(Math.cos(myNumber1)));
        
        System.out.println("Rounded Value of cos 27: "
                +Math.round(Math.cos(myNumber2)));
        
        System.out.println("Rounded Value of tan 45: "
                +Math.round(Math.tan(myNumber1)));
        
        System.out.println("Rounded Value of tan 27: "
                +Math.round(Math.tan(myNumber2)));
        
        //3b
        System.out.println("The value of given equation is: "+
               (Math.abs(8*(Math.cos(myNumber2))))*
                       ((Math.pow(((Math.pow(7, 4))+(8*6*7*5)),(1.0/4.0)))/
                               (Math.pow((Math.pow(5, 2)-
                                       Math.pow(3, 2)), (1.0/8.0)))));
        
        // Random Class
        System.out.println("\n******** Random Class ********");
  
        Random random = new Random();
        
        System.out.println("4 pseudo-random integer values between 0 (inclusive)"
                + " and 200 (exclusive)");
        //4a
        int pseudoRandomInteger1 = random.nextInt(200);
        System.out.println("First random integer value is: "
                +pseudoRandomInteger1+" "+"Square of " 
                +pseudoRandomInteger1+ " is: "
                + pseudoRandomInteger1*pseudoRandomInteger1);
        
        int pseudoRandomInteger2 = random.nextInt(200); 
        System.out.println("Second random integer value is: "
                +pseudoRandomInteger2+" "+"Square of " 
                +pseudoRandomInteger2+ " is: "
                + pseudoRandomInteger2*pseudoRandomInteger2);
        
        int pseudoRandomInteger3 = random.nextInt(200);
        System.out.println("Third random integer value is: "
                +pseudoRandomInteger3+" "+"Square of " 
                +pseudoRandomInteger3+ " is: "
                + pseudoRandomInteger3*pseudoRandomInteger3);
        
        int pseudoRandomInteger4 = random.nextInt(200);
        System.out.println("Fourth random integer value is: "
                +pseudoRandomInteger4+" "+"Square of "
                +pseudoRandomInteger4+ " is: "
                + pseudoRandomInteger4*pseudoRandomInteger4);
        
        System.out.println("3 pseudo-random integer values without seed value "
                + "and bounds");
        
        System.out.println("Fifth random integer value is: "+random.nextInt());
        
        System.out.println("Sixth random integer value is: "+random.nextInt());
        
        System.out.println("Seventh random integer value is: "+random.nextInt());
        
        //4b
        System.out.println("I can see different outputs everytime when I run"
                + " the program");
        
        Random randomNumberWithSeed = new Random(30);
        
        //4c
        System.out.println("4 pseudo-random integer values between 0 (inclusive)"
                + " and 200 (exclusive)");
        
        int pseudoRandomInteger5 = randomNumberWithSeed.nextInt(200);
        
        System.out.println("First random integer value is: "
                +pseudoRandomInteger5+" "+"Square of " 
                +pseudoRandomInteger5+ " is: "
                +pseudoRandomInteger5*pseudoRandomInteger5);
        
        int pseudoRandomInteger6 = randomNumberWithSeed.nextInt(200); 
        System.out.println("Second random integer value is: "
                +pseudoRandomInteger6+" "+"Square of "
                +pseudoRandomInteger6+ " is: "
                +pseudoRandomInteger6*pseudoRandomInteger6);
        
        int pseudoRandomInteger7 = randomNumberWithSeed.nextInt(200);
        System.out.println("Third random integer value is: "
                +pseudoRandomInteger7+" "+"Square of " 
                +pseudoRandomInteger7+ " is: "
                +pseudoRandomInteger7*pseudoRandomInteger7);
        
        int pseudoRandomInteger8 = randomNumberWithSeed.nextInt(200);
        
        System.out.println("Fourth random integer value is: "
                +pseudoRandomInteger8+" "+"Square of "
                +pseudoRandomInteger8+ " is: "
                +pseudoRandomInteger8*pseudoRandomInteger8);
        
        System.out.println("3 pseudo-random values with seed value and "
                + "without bounds ");
        
        System.out.println("Fifth random integer value is: "
                + randomNumberWithSeed.nextInt());
        
        System.out.println("Sixth random integer value is: "
                + randomNumberWithSeed.nextInt());
        
        System.out.println("Seventh random integer value is: "
                + randomNumberWithSeed.nextInt());
        //4d
        System.out.println("Yes, same result can be seen when seed value is "
                + "included");
        //4e
        System.out.println("If the instance of a Random class is created with "
                + "seed value then the pseudorandom numbers generated will be "
                + "same everytime. Different pseudorandom numbers will be "
                + "generated "
                + "evertime,only when we run a program without seed value.");  
    }
    
}
