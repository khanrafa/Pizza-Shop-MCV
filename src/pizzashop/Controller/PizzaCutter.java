
/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: MVC Pizza Shop
*-Program Description: This program utilized MVC (Model, View, Controller) standard to create a pizza shop interface 
 */
package pizzashop.Controller;

/**
 * A class that models a pizza cutter.
 * We only ever want one pizza cutter to 
 * cut the pizzas to ensure consistency.
 * Users can choose how many slices to
 * divide the pizza into.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 */
public class PizzaCutter 
{
    public int numSlices = 0;// how many pieces to cut the pizza into
    public PizzaCutter()
    {
        //intentionally left blank
    }
}
