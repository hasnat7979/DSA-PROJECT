package name.dsaproject;
import java.util.*;
public class Stack {
    Scanner sc = new Scanner(System.in);
    int S;          // S represent Size of an Array
    int St[];
    int LB=0;
    int Top=LB-1;
    int Item;
    Stack()
    {
        System.out.println("Enter the size of Stack");
        S= sc.nextInt();
        St = new int[S];
        stackArrayMenu();
    }
    void stackArrayMenu()
    {
        int option;
        while(true)
        {
            System.out.println("\nSelect What you want to do in Stack on Array \n 1.Traverse \n 2.Push \n 3.Pop \n 4.Return To Main Menu");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    traverse();
                }
                break;
                case 2: 
                {
                    push();
                }
                break;
                case 3: 
                {
                    pop();
                }
                break;
                case 4:
                {
                    System.out.println("Exit Successfuly...");
                    return;
                }
                default :
                {
                    System.out.println("Invalid Selection");
                }
            }
        }
    }
    void traverse()
    {
        if (Top==LB-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The Element In Stack are :");
        for ( int i=Top ; i>=LB ; i--)
        {
            System.out.print(St[i] + "\t");
        }
        System.out.println("");
    }
    void push()
    {
        if (Top==S+LB-1)
        {
            System.out.println("Stack is Full");
            return;
        }
        System.out.println("Enter the Value which you want to Push");
        Item = sc.nextInt();
        Top++;
        St[Top]=Item;
        System.out.println("The Value Is Successfuly Pushed....");
    }
    void pop()
    {
        if (Top==LB-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        Item = St[Top];
        Top--;
        System.out.println(Item + " Is Successfuly Poped....");
    }
}
class Queue{
    Scanner sc = new Scanner(System.in);
    int Size;
    int Item;
    int LB=0;
    int R = LB-1;
    int F = LB-1;
    int Qu[];
    Queue(){
        System.out.println("Enter the Size of Queue");
        Size = sc.nextInt();
        Qu = new int[Size];
        while(true){
        System.out.println("Please Select Which operation you Want to operate on Queue\n1:Traverse of Queue \n2:Insertion in Queue \n3:Deletion From Queue \n4:Exit");
        int QueueSelect = sc.nextInt();
        switch(QueueSelect){
            case 1:{
            Queue_Traverse();
            }
            break;
            case 2:{
                System.out.println("Which type of insertion you Want \n1:Normal Queue Insertion \n2:Circular Queue Insertion \n3:Exit");
                int InsertSelect = sc.nextInt();
                switch(InsertSelect){
                    case 1:{
                    Queue_Insert();
                    }
                    break;
                    case 2:{
                    Circular_Queue_Insertion();
                    }
                    break;
                    case 3:{
                        System.out.println("Exit Successfuly...");
                        break;
                    }
                    default:{
                        System.out.println("You Enter Invalid Number Please Select Valid Number");
                        break;
                    }
                }
            }
            break;
            case 3:{
            System.out.println("Which type of Deletion you want \n1:Normal Queue Deletion \n2:Circular Queue Deletion \n3:Exit");
                int DeleteSelect = sc.nextInt();
                switch(DeleteSelect){
                    case 1:{
                    Queue_Deletion();
                    }
                    break;
                    case 2:{
                    Circular_Queue_Deletion();
                    }
                    break;
                    case 3:{
                        System.out.println("Exit Successfuly...");
                        break;
                    }
                    default:{
                        System.out.println("You Enter Invalid Number Please Select Valid Number");
                        break;
                    }
                }
            }
            break;
            case 4:{
                System.out.println("Exit Successfuly...");
                break;
            }
            default:{
                System.out.println("Invalid Number Please Select Valid Number");
                break;
            }
        }
    }
    }
    void Queue_Traverse(){
    System.out.println("Queue Values are");
    for(int i=F; i<=R; i++){
        System.out.println(Qu[i]);
    }
    }
    void Queue_Insert(){
        System.out.println("Enter an Item Which you Want to insert");
        Item = sc.nextInt();
    if(R == Size+LB-1){
        System.out.println("Queue is Overflow");
        return;
    }
    if(R == LB-1)
    {
          F++;
    }
    R++;
    Qu[R] = Item;
        System.out.println("Inserted Successfuly"+Qu[R]);
    return;
    }
    void Circular_Queue_Insertion(){
        System.out.println("Enter an item Which you Want to insert");
        Item = sc.nextInt();
    if(((R == Size+LB-1)&&(F == LB))||(R == F-1)){
        System.out.println("Insertion Not Possible");
        return;
    }
    if(R == LB-1){
      R = LB;
      F = LB;
    }
    else if(R == Size+LB-1){
            R = LB;
      }
      else{
            R++;
      }
    Qu[R] = Item;
        System.out.println("Insertedd Success"+Qu[R]);
    }
    void Queue_Deletion(){
    if(F == LB-1){
        System.out.println("Queue is Empty");
        return;
    }
        System.out.println("Deleted Item is" +Qu[F]);
    if(F == R){
        F = LB-1;
        R = LB-1;
    }
    else{
        F++;
    }
    }
    void Circular_Queue_Deletion(){
    if(F == LB-1){
        System.out.println("Queue is Empty");
        return;
    }
    Item = Qu[F];
    if(F == R){
    F = LB-1;
    R = LB-1;
    }
    else if(F == Size+LB-1){
      F = LB;
    }
    else {
    F++;
    }
        System.out.println("Item Deleted Successfuly"+Item);
    }
}
