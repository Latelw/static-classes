package com.pluralsight;

import java.util.ArrayList;

public final class NameFormatter {
    private NameFormatter(){}
    public static String formatter(String prefix, String firstName, String middleName,
                                   String lastName, String suffix){
        return (lastName + ", " + prefix + ". " + firstName + " " + middleName + ", " + suffix);
    }


}
