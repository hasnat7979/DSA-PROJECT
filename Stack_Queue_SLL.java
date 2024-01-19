package name.dsaproject;
import java.util.*;
public class Stack_Queue_SLL{
    class Node{
        int info;
        Node Next;
        Node(int info){
             this.info = info;
             this.Next = null;
   }
}
    Scanner sc = new Scanner(System.in);
    Node Top = null;
    Node F = null;
    Node R = null;
    Stack_Queue_SLL(){
       while(true){
                   System.out.println("1:Traverse \n2:Stack in Single LinkedList \n3:Queue in  Single LinkedList \n4:Exit");
                   int SQ_Select = sc.nextInt();
                   switch(SQ_Select){
                       case 1:{
                               System.out.println("1:Traverse of Stack \n2:Traverse of Queue");
                               int Select = sc.nextInt();
                               switch(Select){
                                   case 1:{
                                   Traverse_Stack();
                                   }
                                   break;
                                   case 2:{
                                   Traverse_Queue();
                                   }
                                   break;
                                   default :{
                                       System.out.println("Invalid Number Please Select valid number from menu");
                                       break;
                                   }
                                  }
                               }
                               break;
                       case 2:{
                           System.out.println("1:PUSH in Single Linked List \n2:POP from Single LinkedList \n3:Exit");
                           int StackSelect = sc.nextInt();
                           switch(StackSelect){
                               case 1:{
                               PUSH_SLL();
                               }
                               break;
                               case 2:{
                               POP_SLL();
                               }
                               break;
                               case 3:{
                                   System.out.println("Exit Successfuly.....");
                                   return;
                               }
                               default:{
                                   System.out.println("Invalid number Please Select valid number from menu");
                                   break;
                               }
                           }
                       }
                       break;
                       case 3:{
                       System.out.println("1:EQUEUE(Insertion) in Single LinkedList \n2:DEQUEUE(Deletion) from Single LinkedList\n3:Exit");
                           int QueueSelect = sc.nextInt();
                           switch(QueueSelect){
                               case 1:{
                               EQUEUE_SLL();
                               }
                               break;
                               case 2:{
                               DEQUEUE_SLL();
                               }
                               break;
                               case 3:{
                                   System.out.println("Exit Successfuly....");
                                   return;
                               }
                               default:{
                                   System.out.println("Invalid Number Please Select valid number from menu");
                                   break;
                               }
                           }
                       }
                       break;
                       case 4:{
                           System.out.println("Exit Successfuly....");
                           return;
                       }
                       default:{
                           System.out.println("Invalid Number Please select valid number from menu");
                           break;
                       }
            }
       }
    }
    void Traverse_Stack(){
      if(Top == null){
          System.out.println("Stack is empty");
          return;
      }
      Node ptr = Top;
      while(ptr != null){
          System.out.println(ptr.info);
          ptr = ptr.Next;
      }
    }
    void Traverse_Queue(){
      if(R == null){
          System.out.println("Queue is Empty");
          return;
      }
      Node ptr = F;
      while(ptr != null){
          System.out.println(ptr.info);
          ptr = ptr.Next;
      }
      return;
    }
    void PUSH_SLL(){
        System.out.println("Enter item for PUSH in SLL");
        int item = sc.nextInt();
        Node ptr = new Node(item);
        ptr.info = item;
        ptr.Next = Top;
        Top = ptr;
        System.out.println("PUSH Success");
        return;
    }
    void POP_SLL(){
    if(Top == null){
        System.out.println("Stack is Empty");
        return;
    }
    Node ptr = Top;
    Top = Top.Next;
    //free memory(ptr)
    return;
    }
    void EQUEUE_SLL(){
        System.out.println("Enter an item which you want to insert");
        int item = sc.nextInt();
        Node ptr = new Node(item);
        ptr.info = item;
        ptr.Next = null;
        if(R == null){
          R = ptr;
          F = ptr;
        }
        else{
          R.Next = ptr;
          R = ptr;
        }
        return;
    }
    void DEQUEUE_SLL(){
        if(R == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node ptr = F;
        if(F.Next == null){
           F = null;
           R = null;
        }
        else{
        F = F.Next;
        }
        //Free memory(ptr)
        return;
    }
}      
class Stack_Queue_DLL{
    class Node{
      int info;
      Node Next;
      Node prev;
      Node(int info){
        this.info =  info;
        this.Next = null;
        this.prev = null;
      }
    }
    Scanner sc = new Scanner(System.in);
      Node Top = null;
      Node F = null;
      Node R = null; 
      Stack_Queue_DLL(){
      while(true){
                   System.out.println("1:Traverse \n2:Stack in Double LinkedList \n3:Queue in  Double LinkedList \n4:Exit");
                   int SQ_Select = sc.nextInt();
                   switch(SQ_Select){
                       case 1:{
                                   System.out.println("1:Traverse of Stack DLL \n2:Traverse of Queue DLL");
                                   int Select = sc.nextInt();
                                   switch(Select){
                                       case 1:{
                                       Traverse_Stack_DLL();
                                       }
                                       break;
                                       case 2:{
                                       Traverse_Queue_DLL();
                                       }
                                       break;
                                       default:{
                                           System.out.println("Invalid number please Select valid number from menu");
                                           break;
                                       }
                                   }
                               }
                               break;
                       case 2:{
                           System.out.println("1:PUSH in Double Linked List \n2:POP from Double LinkedList \n3:Exit");
                           int StackSelect = sc.nextInt();
                           switch(StackSelect){
                               case 1:{
                               PUSH_DLL();
                               }
                               break;
                               case 2:{
                               POP_DLL();
                               }
                               break;
                               case 3:{
                                   System.out.println("Exit Successfuly.....");
                                   return;
                               }
                               default:{
                                   System.out.println("Invalid number Please Select valid number from menu");
                                   break;
                               }
                           }
                       }
                       break;
                       case 3:{
                           System.out.println("1:EQUEUE(Insertion) in Double LinkedList \n2:DEQUEUE(Deletion) from Double LinkedList");
                           int QueueSelect = sc.nextInt();
                           switch(QueueSelect){
                               case 1:{
                                  EQUEUE_DLL();
                               }
                               break;
                               case 2:{
                                  DEQUEUE_DLL();
                               }
                               break;
                               case 3:{
                                   System.out.println("Exit Successfuly....");
                                   return;
                               }
                               default:{
                                   System.out.println("Invalid Number Please Select valid number from menu");
                                   break;
                               }
                           }  
                       }
                       break;
                       case 4:{
                           System.out.println("Exit Successfuly....");
                           return;
                       }
                       default:{
                           System.out.println("Invalid Number Please select valid number from menu");
                           break;
                       }
            }
       }
      }
      void Traverse_Stack_DLL(){
      if(Top == null){
          System.out.println("Stack is empty");
          return;
      }
      Node ptr = Top;
      while(ptr != null){
          System.out.println(ptr.info);
          ptr = ptr.Next;
      }
    }
    void Traverse_Queue_DLL(){
      if(R == null){
          System.out.println("Queue is Empty");
          return;
      }
      Node ptr = F;
      while(ptr != null){
          System.out.println(ptr.info);
          ptr = ptr.Next;
      }
      return;
    }
    void PUSH_DLL(){
        System.out.println("Enter an item which you want to PUSH");
        int item = sc.nextInt();
        Node ptr = new Node(item);
        ptr.info = item;
        ptr.prev = null;
        ptr.Next = Top;
        if(Top != null){
            Top.prev = ptr;
        }
        Top = ptr;
     }
    void POP_DLL(){
    if(Top ==null) {
         System.out.println("Stack is Empty...");
	 return;
    }
    Top = Top.Next;
    if(Top != null){
          Top.prev = null;
    }
 }
 void EQUEUE_DLL(){
    System.out.println("Enter an item which you want to Insert");
    int item = sc.nextInt();
    Node ptr = new Node(item);
    ptr.info = item;
    ptr.Next = null; 
    ptr.prev = R;
    if(R == null){ 
	F = ptr;
	R = ptr;
    }
    else{
	R.Next = ptr;
	R = ptr;
      }
    }
    void DEQUEUE_DLL(){
        if(R  == null){
            System.out.println("Queue is Empty");
            return;
       }
        if(F == R){
          F = null;
          R = null;
          return; 
        }
        else{
          F = F.Next;
          F.prev = null;
        }
        return;
    }
}

