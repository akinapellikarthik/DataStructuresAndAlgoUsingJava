package com.karthik.ds;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValidParanthesis(s));
    }

    private static boolean isValidParanthesis(String s) {

        Stack<Character> tempStack = new Stack<>();
        String[] tempArr = s.split("");
        for (int i = 0; i < tempArr.length; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                tempStack.push(s.charAt(i));
            else {
                if (tempStack.isEmpty()) return false;
                else {
                    Character top = tempStack.peek();
                    if ((top == '(' && s.charAt(i) == ')') || (top == '[' && s.charAt(i) == ']') || (top == '{' && s.charAt(i) == '}'))
                        tempStack.pop();
                    else
                        return false;
                }
            }
        }
        return tempStack.isEmpty();
    }
}