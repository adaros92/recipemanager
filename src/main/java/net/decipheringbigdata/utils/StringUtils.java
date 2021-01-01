package net.decipheringbigdata.utils;

public class StringUtils {

    private String string;
    private final int stringLength;
    private final int lastCharacterIndex;

    public StringUtils(String string){
        this.string = string;
        this.stringLength = string.length();
        this.lastCharacterIndex = stringLength - 1;
    }

    public String stringToSingle(){
        String singleString = this.string;
        char lastCharacter = this.string.charAt(lastCharacterIndex);
        // TODO make this robust
        if (lastCharacter == 'S' || lastCharacter == 's')
            singleString = this.string.substring(0, lastCharacterIndex);
        this.string = singleString;
        return singleString;
    }

    public String standardizeString(){
        String singleString = stringToSingle();
        this.string = singleString.toUpperCase();
        return this.string;
    }

}
