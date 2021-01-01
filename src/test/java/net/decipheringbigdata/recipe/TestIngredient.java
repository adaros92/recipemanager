package net.decipheringbigdata.recipe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIngredient {

    @Test
    void testGetUnit(){
        String[] unitStringArray = {"pound", "POUND", "cup", "CUPS", "teaspoon", "TEASPOONS"};
        Unit[] expectedUnitsArray = {Unit.POUND, Unit.POUND, Unit.CUP, Unit.CUP, Unit.TEASPOON, Unit.TEASPOON};
        for (int i = 0; i < unitStringArray.length; i++){
            String unitString = unitStringArray[i];
            Unit unitEnum = expectedUnitsArray[i];
            Ingredient newIngredient = new Ingredient("SomeIngredient", 1.0, unitString);
            assertEquals(unitEnum, newIngredient.getUnit());
        }
    }

}
