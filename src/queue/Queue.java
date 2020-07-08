/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;
import /*singlylinkedlist*/.SNode;

/**
 *
 * @author Oneras
 */
public class Class {
    
    
    
    public static void main(String[] args){
        
        
        Queue c1 = new Queue(2,"jenny");
        Queue c2 = new Queue(4,"jasson");
        Queue c3 = new Queue(6,"jade");
        Queue c4 = new Queue(8,"jane");
        Queue c5 = new Queue(10,"junjay");
            
        SNode<Queue> customer1 = new SNode<>(c1, null);
        SNode<Queue> customer2 = new SNode<>(c2, null);
        SNode<Queue> customer3 = new SNode<>(c3, null);
        SNode<Queue> customer4 = new SNode<>(c4, null);
        SNode<Queue> customer5 = new SNode<>(c5,null);
        
        QueueList <SNode> transaction = new QueueList<>();
        transaction.enqueue(customer1);
        transaction.enqueue(customer2);
        transaction.enqueue(customer3);
        transaction.enqueue(customer4);
        transaction.enqueue(customer5);
        
        
        try  {
            displayTransactions(transaction);
        
        }
        catch (Queue ex) {
            
        }
        
    }
    private static void displayTransactions(Queue<SNode> Class) throws ;
    for (int i = 0; i <Queue.size(); i++) {
    
    System.out.println("Transaction"+(1 + 1) + ": " + temp.getElement().getName());
    temp = temp.getnext();
} 
    
}
