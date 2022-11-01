
/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: MVC Pizza Shop
*-Program Description: This program utilized MVC (Model, View, Controller) standard to create a pizza shop interface 
 */
package pizzashop.Controller;

/**
 * A class to model pizzas that have cheese and 
 * pepperoni
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 */
public class PepperoniPizza extends Pizza 
{
    public PepperoniPizza()
    {
        super();
        super.addTopping("cheese");
        super.addTopping("pepperoni");
    }
    
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
