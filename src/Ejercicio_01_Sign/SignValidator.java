package Ejercicio_01_Sign;

import Materia.Stacks.StackGeneric;

public class SignValidator {
    public boolean isValid(String s) {
        StackGeneric<Character> stack = new StackGeneric<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); 
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); 
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; 
            }
        }
        
        return stack.isEmpty(); 
    }
}
