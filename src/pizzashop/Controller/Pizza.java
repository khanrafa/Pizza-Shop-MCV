
/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: MVC Pizza Shop
*-Program Description: This program utilized MVC (Model, View, Controller) standard to create a pizza shop interface 
 */
package pizzashop.Controller;

import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 */
public class Pizza 
{
    public int bakeTemp = 100;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList();
    public void bake(int temp)
    {
        bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
    /**
     *  A method to add toppings to the ingredients
     * list
     * @param topping 
     */
    public void addTopping(String topping)
    {
        ingredients.add(topping);
    }
}
