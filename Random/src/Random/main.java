package Random;

abstract class Pizza {
 protected String name;
 abstract void prepare();
 abstract void bake();
 abstract void cut();
 abstract void box();

 public String getName() {
     return name;
 }
}
class MargheritaPizza extends Pizza {
 MargheritaPizza() {
     name = "Margherita";
 }

 @Override
 void prepare() {
     System.out.println("Preparing " + name);
 }

 @Override
 void bake() {
     System.out.println("Baking " + name);
 }

 @Override
 void cut() {
     System.out.println("Cutting " + name);
 }

 @Override
 void box() {
     System.out.println("Boxing " + name);
 }
}

class PepperoniPizza extends Pizza {
 PepperoniPizza() {
     name = "Pepperoni";
 }

 @Override
 void prepare() {
     System.out.println("Preparing " + name);
 }

 @Override
 void bake() {
     System.out.println("Baking " + name);
 }

 @Override
 void cut() {
     System.out.println("Cutting " + name);
 }

 @Override
 void box() {
     System.out.println("Boxing " + name);
 }
}
class PizzaStore {
 Pizza orderPizza(String type) {
     Pizza pizza = null;
     if ("margherita".equals(type)) {
         pizza = new MargheritaPizza();
     } else if ("pepperoni".equals(type)) {
         pizza = new PepperoniPizza();
     }
     pizza.prepare();
     pizza.bake();
     pizza.cut();
     pizza.box();
     return pizza;
 }
}
public class main {
 public static void main(String[] args) {
     PizzaStore pizzaStore = new PizzaStore();
     Pizza margherita = pizzaStore.orderPizza("margherita");
     System.out.println(margherita.getName());

     Pizza pepperoni = pizzaStore.orderPizza("pepperoni");
     System.out.println(pepperoni.getName());
 }
}