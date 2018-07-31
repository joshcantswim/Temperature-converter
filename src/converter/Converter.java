/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

    
/**
 *
 * @author joshshell
 */
public class Converter {
    private double fahrenheit;


    /**
     * @return the fahrenheit
     */
    public double getFahrenheit() {
        return fahrenheit;
    }

    /**
     * @param fahrenheit the fahrenheit to set
     */
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     * @return the celsius
     */
    public double getCelsius() {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    /**
     * @param celsius the celsius to set
     */
    public void setCelsius(double celsius) {
        this.fahrenheit = (celsius * 1.8) + 32;
    }

}
