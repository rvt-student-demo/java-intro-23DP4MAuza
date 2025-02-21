package lv.rvt;

import java.io.*; 

public class ColouredTerminal {
    public static final String ANSI_RESET = "\u001B[0m"; 
    // Deklarējam ANSI_RESET, lai varetu uzlikt jaunu krāsu
    
    public static final String ANSI_YELLOW = "\u001B[33m"; 
    public static final String ANSI_RED = "\u001B[31m"; 
    public static final String ANSI_GREEN = "\u001B[32m"; 
    // Deklarējam krāsu
    public static void main(String[] args){
        System.out.println(ANSI_YELLOW 
        + "This text is yellow"
        + ANSI_RESET);
        System.out.println(ANSI_RED 
        + "This text is red"
        + ANSI_RESET); 
        System.out.println(ANSI_GREEN
        + "This text is green"
        + ANSI_RESET); 
    } 
}

class BG_color { 
  
    // Deklarējam ANSI_RESET, lai varetu uzlikt jaunu krāsu
    public static final String ANSI_RESET = "\u001B[0m"; 
    // Deklarējam aizmugurējo krāsu
    public static final String ANSI_YELLOW_BACKGROUND 
        = "\u001B[43m";
    public static final String ANSI_RED_BACKGROUND 
        = "\u001B[41m"; 
    public static final String ANSI_GREEN_BACKGROUND 
        = "\u001B[42m"; 
    public static void main(String[] args) 
    { 
        System.out.println(ANSI_YELLOW_BACKGROUND 
                           + "The background color is yellow"
                           + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND 
                           + "The background color is red"
                           + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND 
                           + "The background color is green"
                           + ANSI_RESET); 
    } 
}


class karogs{
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND
        = "\u001B[41m";
        public static final String ANSI_WHITE_BACKGROUND
        = "\u001B[47m";
    public static void main(String[] args)
    {
        System.out.println(ANSI_RED_BACKGROUND + "LA");
        System.out.println(ANSI_WHITE_BACKGROUND + "TV");
        System.out.println(ANSI_RED_BACKGROUND + "IA");
    }
}