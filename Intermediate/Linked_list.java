/*Linked-List

Problem Description

Design and implement a Linked List data structure.
A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.

Note:
If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in a new line.

Problem Constraints

1 <= position <= n where, n is the size of the linked-list.

Example Input

5
i 1 23
i 2 24
p
d 1
p



Example Output

23 24
24



Example Explanation

After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.
*/

package Dsa.Intermediate;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null; 
    }
} 
public class Linked_list {
    
    public static Node head = null;
    public static int length = 0; 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String in=sc.next();
            if(in!=null && in.equals("i")){
                int pos=sc.nextInt();
                int value=sc.nextInt();
                insert_node(pos,value);
            }else if(in!=null && in.equals("p")){
                print_ll();
            }else if(in!=null && in.equals("d")){
                int pos=sc.nextInt();
                delete_node(pos);
            }
        }
        sc.close();
    }

    public static void insert_node(int position, int value) {

        Node newNode = new Node(value);
        Node temp = head;
        if (position > length + 1) {
            return; // Not a valid position to insert
        }
    
        // If position is 1. That is at the start and LL has nodes.
        if (position == 1) {
            newNode.next=head;
            head=newNode;
        }
    
        else{
           for (int i=1; i<position-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        length++;
    }
    
    public static void delete_node(int position) {
        // @params position, integer
    
        if (position > length) {
            return; // Not a valid position to delelte.
        }
    
        // Del the first node.
        if (position == 1) {
            head=head.next;
        }
    
        else{
            Node curr=head;
            for (int i=1; i<position-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        length--;
    }
    
    public static void print_ll() {
        // Output each element followed by a space
        // Proceed only if List has nodes.
        if (length < 1) {
            return;
        }
    
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        // System.out.println();
    } 
}