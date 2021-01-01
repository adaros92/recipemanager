package net.decipheringbigdata.recipe;

import net.decipheringbigdata.utils.StringUtils;

import static java.lang.String.format;

/**
 * Ingredient objects represent the individual ingredients that go into a particular recipe. The objects store quantity,
 * units, and the names of the ingredients used.
 *
 * @author Adams Rosales (https://github.com/adaros92)
 * @version 1.0
 * @since 2020-12-31
 */
public class Ingredient {

    private final String name;
    private final double quantity;
    public Unit unit;

    /**
     * Constructor when given a unit string
     * @param name the name of the ingredient (Example: tomatoes)
     * @param quantity the quantity of the ingredient (Example: 1.5)
     * @param unitString the unit string for the given quantity (Example: "cups")
     */
    public Ingredient(String name, double quantity, String unitString){
        this.name = this.standardizeString(name);
        this.quantity = quantity;
        setUnitEnum(unitString);
    }

    /**
     * Constructor when given a Unit enum from those available in [[net.decipheringbigdata.recipe.Unit]]
     * @param name the name of the ingredient (Example: tomatoes)
     * @param quantity the quantity of the ingredient (Example: 1.5)
     * @param unit the unit enum for the given quantity (Example: CUP)
     */
    public Ingredient(String name, double quantity, Unit unit){
        this.name = this.standardizeString(name);
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * Utility method for standardizing unit and ingredient name strings provided through constructors based on
     * the logic in [[net.decipheringbigdata.utils.StringUtils.standardizeString]]
     * @param string a string to standardize
     * @return a standardized unit or ingredient name string
     */
    private String standardizeString(String string){
        StringUtils stringUtils = new StringUtils(string);
        return stringUtils.standardizeString();
    }

    /**
     * Utility method for retrieving a Unit enum given a unit string
     * @param unitString a string unit description (example: "cups")
     */
    private void setUnitEnum(String unitString){
        // Ensure both enum and the given string follow the same standard format
        String standardUnitString = standardizeString(unitString);
        Unit matchingUnitEnum = null;
        // Return the matching enum
        for (Unit unitEnum: Unit.values()){
            if (unitEnum.getValue().equals(standardUnitString))
                matchingUnitEnum = unitEnum;
        }
        this.unit = matchingUnitEnum;
    }

    /**
     * Getter for this.quantity
     * @return the value of the current quantity property
     */
    public double getQuantity(){
        return quantity;
    }

    /**
     * Getter for this.unit
     * @return the Unit enum value for the current unit property
     */
    public Unit getUnit(){
        return unit;
    }

    /**
     * Getter for this.name
     * @return the name of the ingredient
     */
    public String getName(){
        return name;
    }

    /**
     * Produces a string representation of the ingredient which includes the name, quantity, and unit
     * @return a string representation encompassing all of the ingredient's information
     */
    public String getStringRepresentation(){
        return format("%.2f %s of %s", this.getQuantity(), this.getUnit().getValue(), this.getName());
    }
}
