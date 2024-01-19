package name.dsaproject;
import java.util.*;
public class LinkedList {
    Scanner sc = new Scanner(System.in);
    Node ptr;
    class Node{
        int info;                         //info is the item/number that is stored in element(Node)
        Node Next;                        //Next is the address(Ptr) of next element
    Node(int info){
        this.info = info; 
        this.Next = null;                 //First time address(Next/ptr) is Null                 
    }
 }
     Node Start = null;                //First time Start is Null
    LinkedList(){
        while(true){
        System.out.println("Which Operation you want to in LinkedList \n1:Traverse \n2:Insertion \n3:Deletion \n4:Exit");
        int Select = sc.nextInt();
        switch(Select){
                case 1:{
                   Traverse();
                }
                break;
                case 2:{
                    System.out.println("Which Type of Insertion you wan to Operate in Single LinkedList \n1:Insertion at First SLL \n2:Insertion at Middle SLL \n3:Insertion at Last SLL \n4:Insertion in Asscending SLL \n5:Insertion in Descending SLL \n6:Exit");
                    int InsertionSelect = sc.nextInt();
                    switch(InsertionSelect){
                    case 1:{
                        Insertion_at_First();
                    }
                    break;
                    case 2:{
                        System.out.println("In middle where You want to Insert \n1:Insertion Before Middle Node(BMN) \n2:Insertion After Middle Node(AMN)  \n3:Exit");
                        int midSelect = sc.nextInt();
                        switch(midSelect){
                            case 1:{
                                System.out.println("In Before Middle Node \n1:Find Middle node with Counter \n2:Find Middle Node with item \n3:Exit");
                                int MidSelect = sc.nextInt();
                                switch(MidSelect){
                                    case 1:{
                                    Insertion_at_BMN();                       
                                    }
                                    break;
                                    case 2:{
                                    Insertion_InMiddle_BGN_SLL();
                                    }
                                    break;
                                    case 3:{
                                        System.out.println("Exit Successfuly...");
                                        break;
                                    }
                                    default:{
                                        System.out.println("Number is invalid");
                                        break;
                                    }
                                }     
                            }
                            break;
                            case 2:{
                                System.out.println("In After Middle Node \n1:Find Middle node with Counter \n2:Find Middle Node with item \n3:Exit");
                                int MidSelect = sc.nextInt();
                                switch(MidSelect){
                                    case 1:{
                                    Insertion_at_AFN();                      
                                    }      
                                    break;
                                    case 2:{
                                    Insertion_InMiddle_AGN_SLL();                     //Find middle node with item
                                    }
                                    break;
                                    case 3:{
                                        System.out.println("Exit Successfuly...");
                                        break;
                                    }
                                    default:{
                                        System.out.println("Number is invalid");
                                        break;
                                    }
                                }
                            }
                            break;
                            case 3:{
                                System.out.println("Exit Successsfuly.......");
                                return;
                            }
                            default:{
                                System.out.println("You Enter Invalid Number Please Select from menu");
                                break;
                            }    
                        }
                    }
                break;
                case 3:{
                    Insertion_at_Last();
                }
                case 4:{
                    Insertion_in_SLL_Asscending();
                }
                break;
                case 5:{
                   Insertion_in_SLL_Descending();
                }
                break;
                case 6:{
                  System.out.println("Exit Successsfuly.......");
                  return;
                }
                default:{
                  System.out.println("You Enter Invalid Number Please Select from menu");
                  break;
                }            
            }
        }
        break;
        case 3:{
            System.out.println("Which type of Deletion you want \n1:Delete Element from First \n2:Delete Exactly Middle Element \n3:Delete Element by Item \n4:Delete Element from Last \n5:Exit");
            int DeleteSelect = sc.nextInt();
            switch(DeleteSelect){
                case 1:{
                   Deletion_from_first(); 
                }
                break;
                case 2:{
                  Delete_ExactMiddle_SLL();
                }
                break;
                case 3:{
                Delete_by_Item();
                }
                break;
                case 4:{
                 Deletion_from_Last_LL();
                }
                break;
                case 5:{
                    System.out.println("Exit Successfully.....");
                    return;
                }
                default:{
                   System.out.println("You Enter Invalid Number Please Select from menu");
                   break;
                }
            }       
        }
        break;
        case 4:{
            System.out.println("Exit Successfuly........");
            return;
        }
        default:{
           System.out.println("You Enter invalid Number Please Select from menu");
           break;
        }
    }
  }
}
void Traverse(){
if(Start == null){
    System.out.println("LinkedList is Empty");
    return;
}
    ptr = Start;
    System.out.println("LinkedList Elements are:");
while(ptr != null){
    System.out.print(ptr.info +"\n");
    ptr = ptr.Next;
}
return;
}
void Insertion_at_First(){
    char ch;
    do
    {
        System.out.println("Enter an Item which you want to Insert");
        int item = sc.nextInt();
        ptr = new Node(item);
        ptr.info = item;
        ptr.Next = Start;
        Start = ptr;
        System.out.println("If you want to insert more Element in LinkedList Press Y if Not Press N or n");
        ch = sc.next().charAt(0);
    }
    while(ch == 'Y' || ch == 'y');
    System.out.println("Item inserted Successfuly Use Traverse to see....");
    return;
}
void Insertion_at_BMN()
{   
    int count = 0;
    Node ptr = Start;
    while(ptr != null){
       count++;
       ptr = ptr.Next;
    }
    int mid = (count/2)+1;
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
    Node ptr1 = new Node(item);
    ptr1.info = item;          
    if((count == 0) || (count == 1)){
         ptr1.Next = Start;
         Start = ptr1;
         return;
    }
    Node ptr2 = Start;
    for(int i=0; i < mid-2; i++){
         ptr2 = ptr2.Next;
    }
    ptr1.Next = ptr2.Next;
    ptr2.Next = ptr1;
    return;
}
void Insertion_at_AFN(){
    int count = 0;
    Node ptr = Start;
    while(ptr != null){
      count++;
      ptr = ptr.Next;
    }
    int mid = (count/2)+1; 
        System.out.println("Enter an item which you want to insert");
        int item = sc.nextInt();
	Node ptr1 = new Node(item);
        ptr1.info = item;
	if(count == 0){
           ptr1.Next = null;
           Start = ptr1;
           return;
        }
        Node ptr2 = Start;
        for(int i=0; i < mid-1; i++){
         ptr2 = ptr2.Next;
        }
        ptr1.Next = ptr2.Next;
        ptr2.Next = ptr1;
        return;
}
void Insertion_InMiddle_BGN_SLL(){   //with search item
    System.out.println("Enter an item for insertion at before enter item node");
    int Sitem = sc.nextInt();
    ptr = Start;
     while((ptr != null) && (ptr.info != Sitem)){
          ptr = ptr.Next;
     }
     if(ptr == null){
         System.out.println("Required item not found");
         return;
     }
     System.out.println("Enter an item which you want to Search");
     int item = sc.nextInt();
     Node ptr1 = new Node(item);
     ptr1.info = item;
     ptr1.Next = ptr;
     if(ptr == Start){
         Start = ptr1;
         return;
     }
     Node ptr2 = Start;
     while(ptr2.Next != ptr){
         ptr2 = ptr2.Next;
     }
     ptr2.Next = ptr1;
     return;
}
void Insertion_InMiddle_AGN_SLL(){    //with Search item
    System.out.println("Enter an item for insertion at After enter item node");
    int Sitem = sc.nextInt();
   ptr = Start;
   while((ptr != null) && (ptr.info != Sitem)){
      ptr = ptr.Next;
   }
   if(ptr == null){
         System.out.println("Required item not found");
         return;
   }
   System.out.println("Enter an item which you want to Search");
     int item = sc.nextInt();
     Node ptr1 = new Node(item);
     ptr1.info = item;
     ptr1.Next = ptr.Next;
     ptr.Next = ptr1;
     return;
}
void Insertion_in_SLL_Asscending(){
    System.out.println("Enter the item you went to insert: ");
	int item = sc.nextInt();
	  Node ptr = Start;
	while((ptr!=null) && (ptr.info < item))
        {
		ptr = ptr.Next;
        }
        Node ptr1 = new Node(item);
        ptr1.info = item;
        if(ptr == null){
          ptr1.Next= null;
          if(Start == null){
             Start = ptr1;
             return;
          }
          Node ptr2 = Start;
          while(ptr2.Next != null){
             ptr2 = ptr2.Next;
          }
          ptr2.Next = ptr1;
          return;
        }
        if(ptr == Start){
            ptr1.Next = Start;
            Start = ptr1;
            return;
        }
        Node ptr2 = Start;
        while(ptr2.Next != ptr){
            ptr2 = ptr2.Next;
        }
        ptr2.Next = ptr1;
        ptr1.Next = ptr;
        return;
}
void Insertion_in_SLL_Descending(){
       System.out.println("Enter the item you went to insert: ");
	int item = sc.nextInt();
	  Node ptr = Start;
	while((ptr!=null) && (ptr.info > item))
        {
		ptr = ptr.Next;
        }
        Node ptr1 = new Node(item);
        ptr1.info = item;
        if(ptr == null){
          ptr1.Next= null;
          if(Start == null){
             Start = ptr1;
             return;
          }
          Node ptr2 = Start;
          while(ptr2.Next != null){
             ptr2 = ptr2.Next;
          }
          ptr2.Next = ptr1;
          return;
        }
        if(ptr == Start){
            ptr1.Next = Start;
            Start = ptr1;
            return;
        }
        Node ptr2 = Start;
        while(ptr2.Next != ptr){
            ptr2 = ptr2.Next;
        }
        ptr2.Next = ptr1;
        ptr1.Next = ptr;
        return;
        }
void Insertion_at_Last(){
    char ch;
    do{
    System.out.println("Enter an item which you want to Insert");
    int item = sc.nextInt();
    Node ptr1 = new Node(item);
    ptr1.info = item;
    ptr1.Next = null;
    if(Start == null)
    {
        Start = ptr1;
        System.out.println("Item Inserted Success use Traverse to see");
        return;
    }
    ptr = Start;
    while((ptr.Next) != null)
    {
        ptr = ptr.Next;
    }
    ptr.Next = ptr1;
    System.out.println("Item Inserted Success use Traverse to see");
    System.out.println("If you want to insert more elements at last of LinkedList.Press Y and for not press N");
    ch = sc.next().charAt(0);
    }
    while(ch == 'Y'|| ch == 'y');
    }
void Deletion_from_first(){
   if(Start == null){
        System.out.println("Deletion Not possible beacusre LinkedList is empty");
        return;
    }
    ptr = Start;
    Start = Start.Next;
    //free memory(ptr)
     System.out.println("Node Deleted Success use Traverse to see");
     return;
 }
void Delete_by_Item(){
        if(Start == null){
            System.out.println("Deletion not possible bcz LinkedList is empty");
            return;
            }
            System.out.println("Enter Item for delete");
            int item = sc.nextInt();
                    Node ptr = Start, prev = null;
                    if (ptr != null && ptr.info == item) {
                        Start = ptr.Next;
                        return;
                    }
                    while (ptr != null && ptr.info != item) {
                        prev = ptr;
                        ptr = ptr.Next;
                    }
                    if (ptr == null){
                        System.out.println("Item not found");
                        return;
                    }
                    prev.Next = ptr.Next;
                    System.out.println("Item Deleted");
                    return; 
        }
void Delete_ExactMiddle_SLL()
{
        int count = 0;
        ptr = Start;
        while(ptr != null)
        {
           count++;
           ptr = ptr.Next;
        }
        int mid = (count/2)+1;
        if(count == 0){
            System.out.println("SLL is empty");
        }
        if(count == 1){
            //free memory(Start)
            Start = null;
            return;
        }
        ptr = Start;
        for(int i=0; i < mid-2; i++){
           ptr = ptr.Next;
        }
        Node ptr1 = ptr.Next;
        ptr.Next = ptr1.Next;
            System.out.println("Item deleted Success.....");
        return;
}
void Deletion_from_Last_LL(){
    if(Start == null){
        System.out.println("Double linked List is empty Deletion is not possible");
        return;
    }
    if(Start.Next == null){
       ptr = Start;
       Start = Start.Next;
       //free memory(ptr)
        System.out.println("Node Deleted use Traverse to see");
        return;
    }
    ptr = Start;
    while(ptr.Next.Next != null){
       ptr = ptr.Next;
    }
    Node ptr1 = ptr.Next;
    ptr.Next = null;
    //free memory(ptr1)
     System.out.println("Node Deleted Success Use traverse to See");
     return;
 }
 }
 class Node
    {
      int info;
      Node Next;
      Node prev;
      Node(int info)
      {
         this.info = info;
         this.Next = null;
         this.prev = null;
      } 
    }
class DoubleLinkedList{
    Node Start = null;
    Node ptr;
    Scanner sc = new Scanner(System.in);
    DoubleLinkedList(){
        while(true){
            System.out.println("Which type of Operation you want to operate in Double Linked List: \n1:Traverse \n2:Insertion \n3:Deletion \n4:Exit");
            int menuSelect = sc.nextInt();
            switch(menuSelect){
                case 1:{
                Traverse();
                }
                break;
                case 2:{
                    System.out.println("Which type of Insertion you Want: \n1:Insertion at first DLL \n2:Insertion at Middle DLL \n3:Insertion in Asscending DLL \n4:Inserrtion in Descending DLL \n5:Insertion at last DLL \n6:Exit");
                    int InsertionSelect = sc.nextInt();
                    switch(InsertionSelect){
                        case 1:{
                        Insertion_at_first_DLL();
                        }
                        break;
                        case 2:{
                            System.out.println("In Insertion at Middle \n1:Insertion Before Middle Node(BMN) \n2:Insertion After Middle Node(AMN) \n3:Exit");
                            int midSelect = sc.nextInt();
                            switch(midSelect){
                                case 1:{ 
                                    System.out.println("In Before Middle Insertion \n1:Find middle node with counter \n2:Find middle node with item  \n3:Exit");
                                    int MidSelect = sc.nextInt();
                                    switch(MidSelect){
                                        case 1:{
                                         Insertion_at_BMN_DLL();
                                        }
                                        break;
                                        case 2:{
                                        Insertion_InMiddle_BMN_DLL();        //with search item
                                        }
                                        break;
                                        case 3:{
                                            System.out.println("Exit Successfuly.....");
                                            break;
                                        }
                                        default:{
                                            System.out.println("Number not valid");
                                            break;
                                        }
                                    }
                                }
                                break;
                                case 2:{
                                    System.out.println("In After Middle Insertion \n1:Find middle node with counter \n2:Find Middle node with item \n3:Exit");
                                    int MidSelect = sc.nextInt();
                                    switch(MidSelect){
                                        case 1:{
                                        Insertion_at_AMN_DLL(); 
                                        }
                                        break;
                                        case 2:{
                                        Insertion_InMiddle_AMN_DLL();        //with search item
                                        }
                                        break;
                                        case 3:{
                                            System.out.println("Exit Successfuly...");
                                            break;
                                        }
                                        default:{
                                            System.out.println("Number not valid Please Select valid number.....");
                                            break;
                                        }
                                    }
                                }
                                break;
                                case 3:{
                                    System.out.println("Exit Successfully.......");
                                    return;
                                }
                            }
                        }
                        break;
                        case 3:{
                          Insertion_in_Ascending_DLL();
                        }
                        break;
                        case 4:{
                          Insertion_in_Descending_DLL();
                        }
                        break;
                        case 5:{
                          Insertion_at_last_DLL();
                        }
                        break;
                        case 6:{
                            System.out.println("Exit Successfuly....");
                            return;
                        }
                        default:{
                            System.out.println("Please Select valid number from menu");
                            break;
                        }
                    }
                }
                break;
                case 3:{
                    System.out.println("Which type of Deletion you want: \n1:Deletion from first \n2:Deletion from Middle \n3:Deletion from last\n4:Exit");
                    int DeleteSelect = sc.nextInt();
                    switch(DeleteSelect){
                        case 1:{
                        Deletion_from_first_DLL();
                        }
                        break;
                        case 2:{
                            System.out.println("In Middle Deletion \n1:Delete Middle node with item \n2:Delete Exactly Middle Node \n3:Exit");
                            int MidSelect = sc.nextInt();
                            switch(MidSelect){
                                case 1:{
                                Deletion_InMiddle_SearchNode_DLL();
                                }
                                break;
                                case 2:{
                                Deletion_ExactMiddle_Node_DLL();
                                }
                                break;
                                case 3:{
                                    System.out.println("Exit Successfulyy....");
                                    return;
                                }
                                default:{
                                    System.out.println("Enter Valid Number");
                                    break;
                                }
                            
                            }
                        }
                        break;
                        case 3:{
                            Deletion_from_Last_DLL();
                        }
                        break;
                        case 4:{
                            System.out.println("Exit Successfuly.......");
                            return;
                        }
                        default:{
                            System.out.println("Selected Number is not valid Please Select from menu");
                            break;
                        }
                    }
                }
                break;
                case 4:{
                    System.out.println("Exit Successfuly.......");
                    return;
                }
                default:{
                    System.out.println("Please enter valid number from menu");
                    break;
                }
            }
        }
    }
void Traverse(){
  if (Start == null){
      System.out.println("LinkedList is empty");
      return;
  }
  ptr = Start;
  System.out.println("Linked list elements are:");
  while(ptr != null){
      System.out.println(ptr.info);
      ptr = ptr.Next;
  }
  return;
}
 void Insertion_at_first_DLL(){
     System.out.println("Enter an item which you want to insert");
     int item = sc.nextInt();
     Node ptr1 = new Node(item); 
     ptr1.info = item;
     ptr1.prev = null;
     ptr1.Next = Start;
     if(Start != null){
       Start.prev = ptr1;
     }
     Start = ptr1;
     System.out.println("Item Inserted Use traverse to See");
     return;
  } 
 void Insertion_at_BMN_DLL()
{   
    int count = 0;
    ptr = Start;
    while(ptr != null){
         count++;
         ptr = ptr.Next;
    }
    int mid = (count/2)+1;
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
    Node ptr1 = new Node(item);
    ptr1.info = item;
    if(count == 0){
            ptr1.Next = null;
            ptr1.prev = null;
            Start = ptr1;
            return;
    }
    if(count == 1){
            ptr1.Next = Start;
            Start.prev = ptr1;
            ptr1.prev = null;
            Start = ptr1;
            return;
    }
    Node ptr2 = Start;
    for(int i=0; i < mid-1; i++){
       ptr2 = ptr2.Next;
    }
    ptr1.Next = ptr2;
    ptr1.prev = ptr2.prev;
    ptr1.prev.Next = ptr1;
    ptr2.prev = ptr1;
    System.out.println("Item Inserted suceess.....");
    return;
}
void Insertion_at_AMN_DLL(){
   int count = 0;
   ptr = Start;
   while(ptr != null){
        count++;
        ptr = ptr.Next;
   }
   int mid = (count/2)+1;
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
    Node ptr = new Node(item);
    ptr.info = item;
    if(count == 0){
       ptr.Next = null;
       ptr.prev = null;
       Start = ptr;
       return;
    }
    Node ptr1 = Start;
    for(int i=0 ;i < mid-1; i++)
    {
            ptr1 = ptr1.Next;
    }
    ptr.Next = ptr1.Next;
    if(ptr.Next != null){
            ptr.Next.prev = ptr;
    }
    ptr1.Next = ptr;
    ptr.prev = ptr1;
    System.out.println("Item Inserted suceess.....");
    return;
}
void Insertion_InMiddle_BMN_DLL(){        //with Search item
    System.out.println("Enter an item for insertion at before enter item node");
    int Sitem = sc.nextInt();
    ptr = Start;
    while((ptr != null) && (ptr.info != Sitem)){
            ptr = ptr.Next;
    }
    if(ptr == null){
        System.out.println("Required item does not found");
        return;
    }
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
    Node ptr1 = new Node(item);
    ptr1.info = item;
    ptr1.Next = ptr;
    ptr1.prev = ptr.prev;
    ptr.prev = ptr1;
    if(ptr1.prev == null){
            Start = ptr1;
    }
    else{
            ptr1.prev.Next = ptr1;
    }
    System.out.println("Item inserted Succeess....");
    return;
}
void Insertion_InMiddle_AMN_DLL(){            //with Search item
    System.out.println("Enter an item for insertion at before enter item node");
    int Sitem = sc.nextInt();
    ptr = Start;
    while((ptr != null) && (ptr.info != Sitem)){
      ptr = ptr.Next;
    }
    if(ptr == null){
        System.out.println("Required item not found");
        return;
    }
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
    Node ptr1 = new Node(item);
    ptr1.info = item;
    ptr1.Next = ptr.Next;
    if(ptr.Next != null){
      ptr.Next.prev = ptr1;
    }
    ptr1.prev = ptr;
    ptr.Next = ptr1;
    System.out.println("Item Inserted suceess.....");
    return;
}
void Insertion_in_Ascending_DLL(){
    System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
   Node ptr = Start;
   while((ptr != null) && (ptr.info < item)){
      ptr = ptr.Next;
   }
   Node ptr1 = new Node(item);
   ptr1.info = item;
   if(ptr == null){
        if(Start == null){
        ptr1.Next = null;
        ptr1.prev = null;
        Start = ptr1;
        return;
        }
   ptr1.Next = null;
   Node ptr2 = Start;
   while(ptr2.Next != null){
      ptr2 = ptr2.Next;
   }
   ptr2.Next = ptr1;
   ptr1.prev = ptr2;
   return;
   }
   if(ptr == Start){
      ptr1.Next = Start;
      ptr1.prev = null;
      Start.prev = null;
      Start = ptr1;
      return;
   }
   Node ptr2 = Start;
   while(ptr2.Next != ptr){
       ptr2 = ptr2.Next;
   }
   ptr2.Next = ptr1;
   ptr1.prev = ptr2;
   ptr1.Next = ptr;
   ptr.prev = ptr1;
   System.out.println("Item Inserted suceess.....");
   return;
}
void Insertion_in_Descending_DLL(){
  System.out.println("Enter an item which you want to insert");
    int item = sc.nextInt();
   Node ptr = Start;
   while((ptr != null) && (ptr.info > item)){
      ptr = ptr.Next;
   }
   Node ptr1 = new Node(item);
   ptr1.info = item;
   if(ptr == null){
        if(Start == null){
        ptr1.Next = null;
        ptr1.prev = null;
        Start = ptr1;
        return;
        }
   ptr1.Next = null;
   Node ptr2 = Start;
   while(ptr2.Next != null){
      ptr2 = ptr2.Next;
   }
   ptr2.Next = ptr1;
   ptr1.prev = ptr2;
   return;
   }
   if(ptr == Start){
      ptr1.Next = Start;
      ptr1.prev = null;
      Start.prev = null;
      Start = ptr1;
      return;
   }
   Node ptr2 = Start;
   while(ptr2.Next != ptr){
       ptr2 = ptr2.Next;
   }
   ptr2.Next = ptr1;
   ptr1.prev = ptr2;
   ptr1.Next = ptr;
   ptr.prev = ptr1;
   System.out.println("Item Inserted suceess.....");
   return;
}
 void Insertion_at_last_DLL(){
     System.out.println("Enter an item which you want to insert");
     int item = sc.nextInt();
     Node ptr1 = new Node(item);
     ptr1.info = item;
     ptr1.Next = null;
     if (Start == null){
       Start = ptr1;
       ptr1.prev = null;
       System.out.println("Item Inserted Use traverse to see");
       return;
     }
     ptr = Start;
     while(ptr.Next != null)
     {
       ptr = ptr.Next;
     }
     ptr.Next = ptr1;
     ptr1.prev = ptr;
     System.out.println("Item inserted Use Traverse to See");
     return;
 }
 void Deletion_from_first_DLL(){
    if(Start == null){
        System.out.println("Deletion Not possible beacusre LinkedList is empty");
        return;
    }
    ptr = Start;
    Start = Start.Next;
    if(Start != null){
       Start.prev = null;
    }
    //free memory(ptr)
     System.out.println("Node Deleted Success use Traverse to see");
     return;
 }
 void Deletion_InMiddle_SearchNode_DLL(){
     System.out.println("Enter an item which you want to delete from Double Linked List");
     int Sitem = sc.nextInt();
    ptr = Start;
    while((ptr != null) && (ptr.info != Sitem)){
            ptr = ptr.Next;
    }
    if(ptr == null){
        System.out.println("Item not found");
        return;
     }
    if(ptr == Start){
      Start = ptr.Next;
      if(Start != null)
      {
           Start.prev = null;
      }    
      //free memory(ptr)
      return;
    }
    Node ptr1 = Start;
    while(ptr1.Next != ptr){
       ptr1 = ptr1.Next;
    }
    ptr1.Next = ptr.Next;
    if(ptr.Next != null){
       ptr.Next.prev = ptr1;
    }
    //free memory(ptr)
    return;
 }
 void Deletion_ExactMiddle_Node_DLL(){
    int count = 0;
     ptr = Start;
    while(ptr != null){
        count++;
            ptr = ptr.Next;
    }
    int mid = (count/2)+1;
    if(count == 0){
        System.out.println("Dll is empty");
        return;
    }
    if(count == 1){
     //free memory(Start)
     Start = null;
     return;
    }
    ptr = Start;
    for(int i=0; i < mid-2; i++){
       ptr = ptr.Next;
    }
    Node ptr1 = ptr.Next;
    ptr.Next = ptr1.Next;
    if(ptr1.Next != null){
       ptr1.Next.prev = ptr;
    }
    //free memory(ptr1)
    return;
 }
 void Deletion_from_Last_DLL(){
    if(Start == null){
        System.out.println("DLL is empty Deletion is not possible");
        return;
    }
    if(Start.Next == null){
       ptr = Start;
       Start = Start.Next;
       //free memory(ptr)
        System.out.println("Node Deleted use Traverse to see");
        return;
    }
    ptr = Start;
    while(ptr.Next.Next != null){
       ptr = ptr.Next;
    }
    Node ptr1 = ptr.Next;
    ptr.Next = null;
    //free memory(ptr1)
     System.out.println("Node Deleted Success Use traverse to See");
     return;
 }
}



