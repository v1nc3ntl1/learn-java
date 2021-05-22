package com.learning;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        //System.out.println("var3 is not accessible here " + innerClass.var3);
        System.out.println("scopeInstance var1 is " + scopeCheck.getVar1());
        System.out.println(varFour);
        scopeCheck.timesTwo();
        System.out.println("***********************");
        //ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
