package Ejercicio_02_Sorting;

import Materia.Stacks.StackGeneric;

public class StackSorter {
    public void sortStack(StackGeneric<Integer> stack) {
        StackGeneric<Integer> tempStack = new StackGeneric<>();
        
        while (!stack.isEmpty()) {
            int current = stack.pop(); 
            
            
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(current); 
        }
        
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
