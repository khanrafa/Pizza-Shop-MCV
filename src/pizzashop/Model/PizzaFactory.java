
/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: MVC Pizza Shop
*-Program Description: This program utilized MVC (Model, View, Controller) standard to create a pizza shop interface 
 */
package pizzashop.Model;

import pizzashop.Controller.CheesePizza;
import pizzashop.Controller.PepperoniPizza;
import pizzashop.Controller.Pizza;

/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 */
class PizzaFactory 
{

    /**
     * returns a concrete pizza object
     * @param type the type of pizza to return
     * @return 
     */
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni"))
        {
                pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
