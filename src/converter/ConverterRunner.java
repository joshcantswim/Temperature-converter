/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.swing.JOptionPane;

/**
 *
 * @author joshshell
 */
public class ConverterRunner {
    
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        System.out.println("In converter Main");

        promptUser();
    }


    /**
     * Ask user to input temperature in C or F;
     * Stores the value in Converter and print out value of temperature
     * for Celsius and Fahrenheit
     */
    public static void promptUser() {


        String userInput;
        String scale;
        Double temper;

        Converter conv = new Converter();

        do{
            String tempInput = JOptionPane.showInputDialog("Enter Temperature");

            do{
                scale = JOptionPane.showInputDialog("For Celsius enter 'C'. For Fahrenheit enter 'F'");
            }while(scale.equals("C") && scale.equals("F"));

            /**
             * check user's temperature input
             */
            if( tempInput == null ){
                    temper = 35.0;
            }else{
                    temper = new Double(tempInput);
            }
            
            
            if(scale.equals("C")){
                //check Celsius
                if(temper < -200){
                    temper = 35.0;
                }
            }else{
                //check Fahrenheit
                if(temper < -450){
                    temper = 35.0;
                }
            }
            /**
             * Check if the temperature was entered in Fahrenheit or
             * in Celsius and use appropriate method to store the
             * temperature
             */
            if( scale.equals("C") ){
                    conv.setCelsius(temper);
            }else{
                    conv.setFahrenheit(temper);
            }

            System.out.println("Fahrenheit temperature = " +  conv.getFahrenheit() );
            System.out.println("Celsius temperature = " + conv.getCelsius() );
            
            /**
             * Ask user to enter another temp
             */
            userInput = JOptionPane.showInputDialog("Would you like to enter another temperature in C or F. If yes enter 'Y'  no - 'any key'");
    
        }while(userInput.equals("Y"));
    }

}

   
