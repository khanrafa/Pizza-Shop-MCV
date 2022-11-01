
package pizzashop.Controller;

/*
*-Creator: Rafae Khan
*-Language Used: Java
*-Program Name: MVC Pizza Shop
*-Program Description: This program utilized MVC (Model, View, Controller) standard to create a pizza shop interface 
 */
public class CheesePizza extends Pizza
{
    public CheesePizza()
    {
        super();
        super.addTopping("cheese");
    }
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
