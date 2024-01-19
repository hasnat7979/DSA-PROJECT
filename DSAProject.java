package name.dsaproject;
import java.util.*;
public class DSAProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPLEASE SELECT WHICH OPERATION DO YOU WANT TO OPERATE");
        System.out.println("1:Work on Array \n2:Work on LinkedList  \n3:Exit");
        int option = sc.nextInt();
        while(true){
        switch(option){
            case 1:{
                System.out.println("1:Work on Array \n2:Stack in Array \n3:Queue in Array \n4:Exit");
                int ArraySelect = sc.nextInt();
                switch(ArraySelect){
                            case 1:{
                                Array A = new Array();
                            }
                            break;
                            case 2:{
                                Stack S = new Stack();
                            }
                            break;
                            case 3:{
                                Queue Q = new Queue();
                            }
                            break;
                            case 4:{
                                System.out.println("Exit Successfully....");
                                return;
                            }
                            default:{
                                System.out.println("Invalid number please Select valid number from menu");
                                break;
                            }
                        }
                   }
            break;
            case 2:{
                System.out.println("1:Single Linked List \n2:Double linked List \n3:Exit");
                int listSelect = sc.nextInt();
                switch(listSelect){
                    case 1:{
                        System.out.println("1:Work on Single LinkedList \n2:Stack and Queue in  Single LinkedList \n3:Exit");
                        int ListSelect = sc.nextInt();
                        switch(ListSelect){
                            case 1:{
                                LinkedList LL = new LinkedList();
                            }
                            break;
                            case 2:{
                                Stack_Queue_SLL SLL = new Stack_Queue_SLL();
                            }
                            break;
                            case 3:{
                                System.out.println("Exit Successfully....");
                                return;
                            }
                            default:{
                                System.out.println("Invalid number please Select valid number from menu");
                                break;
                            }
                        }
                    }
                    break;
                    case 2:{
                        System.out.println("1:Work on Double LinkedList \n2:Stack and Queue in  Double LinkedList \n3:Exit");
                        int ListSelect = sc.nextInt();
                        switch(ListSelect){
                            case 1:{
                            DoubleLinkedList DLL = new DoubleLinkedList();
                            }
                            break;
                            case 2:{
                            Stack_Queue_DLL DLL = new Stack_Queue_DLL();
                            }
                            break;
                            case 3:{
                                System.out.println("Exit Successfully....");
                                return;
                            }
                            default:{
                                System.out.println("Invalid number please Select valid number from menu");
                                break;
                            }
                       }
                    }
                    break;
                    case 3:{
                        System.out.println("Exit Successfully.......");
                        break;
                    }
                    default:{
                        System.out.println("Please Select valid number from menu...");
                        return;
                    }
                }
            }
            break;
            case 3:{
                System.out.println("Exit Successfuly....");
                return;
            }
            default :{
              System.out.println("Your number cannot Exist Please Select Valid Number from Menu");
            return;
            }
        }
    }
  }
}
