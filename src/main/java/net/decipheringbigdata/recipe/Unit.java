package net.decipheringbigdata.recipe;

import net.decipheringbigdata.utils.StringUtils;

public enum Unit{

    // Volume units
    MILLILITER("MILLILITER"),
    CUP("CUP"),
    PINT("PINT"),
    QUART("QUART"),
    FLUID_OUNCE("FLUID OUNCE"),
    TEASPOON("TEASPOON"),
    TABLESPOON("TABLESPOON"),
    // Weight units
    POUND("POUND"),
    TON("TON"),
    OUNCE("OUNCE"),
    GRAM("GRAM");

    private final String value;

    Unit(String value){
        StringUtils string = new StringUtils(value);
        this.value = string.standardizeString();
    }

    public String getValue(){
        return value;
    }
}
