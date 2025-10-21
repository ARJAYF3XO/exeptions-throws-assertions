/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;
import java.util.Scanner;
/**
 *
 * @author Rosalie
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner z = new Scanner(System.in);
        System.out.println("enter size ng tite ");
        int tite = 0;
        tite=z.nextInt();
        
        //throw pag nahuli ng throw error screen na may text ez debug 
         if (tite > 8) {
        throw new IllegalArgumentException("gago di kasya yan"); 
    }
    System.out.println("kasya."); // else statement kapag di nahuli ng throw
    
    // try mo muna bago mo judge kung error
        try{
            System.out.println("tite/0 ano mangyari?");
               tite=tite/0;
            }
            // judge mo kung anong klaseng error 
            catch(ArithmeticException e)// arithmetic errors
            {
                System.out.println("arithmetic error naubosan ng tite");
            }
            catch(NullPointerException e)// pointer errors
            {
                System.out.println("pointer error");
            }
            catch(ArrayIndexOutOfBoundsException e)// array errors
            {
                System.out.println("out of bounds");
            }
        
        finally { // always executes kahit may error or what
            System.out.println("eto si finally laging sya mag rurun even if an error occurs.");
        }
        // tuloy ang laban
        System.out.println("continue the program flow na para bang walang nangyari");
        
        
        //assertion mga kupal
        int age = 0;
        System.out.println("enter age ");
        age=z.nextInt();
        assert(age>0) : "age should at least be 1"; // pag nahuli ng assert para lang sya throw stop tayo
       // check kung pede na uminom
        if (age >= 18) {
        System.out.println("adult ka na pede na uminom");
        }
      
        // break down
        // assert pag logical error ang gusto i check kasi pede relational operatos
        // throw kapag runtime kasi exception shit sya
        // exception kapag lalagay sa final output error handling sya na mas madali
        String wala=null;
        System.out.println("bawal wala enter ka ng name");
        z.nextLine();
        wala=z.nextLine();

        Custom_assert.assertPositive(age, "should be positive");
        Custom_assert.assertNotEmpty(wala, "cannot be empty");
         Custom_assert.assertNotEmptykupal(wala, "GAGO!");
    }
    
    
}
