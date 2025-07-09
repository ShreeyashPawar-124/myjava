package sap.company;

import java.util.Locale;

public class CWH_14_StringMethod {
    public static void main(String[] args) {
        String name = "      Shreeyash    ";
        System.out.println(name);
        String str = "Hello My Name Is Shreeyash";
        // use string methods
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(name.trim());
        System.out.println(str.substring(8));
        System.out.println(str.substring(4 , 16));
        System.out.println(str.replace('l','o'));
        System.out.println(str.replace("sh","zz"));
        System.out.println(str.replaceAll("Sh","zz"));
        System.out.println(str.startsWith("Hel"));
        System.out.println(str.endsWith("Hel"));
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("M"));
        System.out.println(str.indexOf("e",9));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf('e',18));
        System.out.println(str.equals("Hello My Name Is Shreeyash"));
        System.out.println(str.equalsIgnoreCase("HellO My NamE Is ShreeYash"));

        // Escape Sequence Characters
        System.out.println("that\"s it");
    }
}
