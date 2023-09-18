package cohes07procedimental;

public class Chef {
    public void cookPaella() {
        Dish dish = new DishImpl("paella");

        dish.addIngredient(new Ingredient("rice"));
        dish.addIngredient(new Ingredient("chicken"));
        dish.addIngredient(new Ingredient("peas"));

        //Esta cohesion es temporal o cronologica
        //si no sigues este orden da error
        dish.mix();
        dish.cook();
        dish.serve();
    }
}
