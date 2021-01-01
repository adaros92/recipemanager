package net.decipheringbigdata.recipe;

import java.util.*;

public class Recipe {

    private String recipeName;
    private String recipeDescription;
    private Map<String, Ingredient> ingredients;
    private ArrayList<String> recipeSteps;

    public Recipe(String recipeName){
        this.recipeName = recipeName;
    }

    public Recipe addDescription(String description){
        this.recipeDescription = description;
        return this;
    }

    public Recipe addDescription(){
        return this;
    }

    public Recipe addIngredient(Ingredient ingredientToAdd){
        this.ingredients.put(ingredientToAdd.getName(), ingredientToAdd);
        return this;
    }

    public Recipe addIngredient(){
        return this;
    }

    public Recipe addStep(){
        return this;
    }

    public Recipe addStep(String step){
        this.recipeSteps.add(step);
        return this;
    }
}
