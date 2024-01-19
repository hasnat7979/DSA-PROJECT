package name.dsaproject;
import java.util.*;
public class Array {
    Scanner sc = new Scanner(System.in);
    int LB=0;
    int N =0;
    int S;
    int K;
    int Item;
    int Arr[];
    Array(){
        System.out.println("Enter the size of an Array");
        S = sc.nextInt();
        Arr = new int[S];
        arraymenu();
    }
    void arraymenu(){    
        while(true){
        System.out.println("PLEASE SELECT WHICH OPERATION YOU WANT TO OPERATE ON ARRAY");
        System.out.println("1:Traverse \n2:Insertion \n3:Deletion \n4:Sorting \n5:Searching \n6:Exit");
        int menuselect = sc.nextInt();
        switch(menuselect){
            case 1:{
            Traverse();
            }
            break;
            case 2:{
            Insertion();
            }
            break;
            case 3:{
            Deletion();
            }
            break;
            case 4:{
             System.out.println("WHICH TYPE OF SOARTING YOU WANT PLEASE SELECT \n1:Bubble Sort \n2:Selection Sort \n3:Insertion Sort \n4:Shell Sort\n5:Merge Sort \n6:Quick Sort \n7:Exit");
             int SoartSelect = sc.nextInt();
             switch(SoartSelect){
                 case 1:{
                 System.out.println("Which Type of Bubble Sort you want \n1:Bubble Sort in Asscending Order \n2:Bubble Sort in Desscending Order \n3:Exit");
                         int BubbleSelect = sc.nextInt();
                         switch(BubbleSelect){
                             case 1:{
                             Ass_BubbleSort();
                             }
                             break;
                             case 2:{
                             Dec_BubbleSort();
                             }
                             break;
                             case 3:{
                                 System.out.println("Exit Successfuly.........");
                                 return;
                             }
                             default:{
                                 System.out.println("Number Cannot be Exist Please Select From Menu");
                             }
                         
                         }
                 }
                 break;
                 case 2:{
                     System.out.println("Which Type of Selection Sort You Want \n1:Selection Sort in Asscending Order \n2:Selection Sort in Desscending Order \n3:Exit");
                     int SelectionSelect = sc.nextInt();
                     switch(SelectionSelect){
                         case 1:{
                         Ass_SelectionSort();
                         }
                         break;
                         case 2:{
                         Dec_SelectionSort();
                         }
                         break;
                         case 3:{
                             System.out.println("Exit Successfuly.............");
                             return;
                         }
                         default:{
                             System.out.println("Number Not be Exist Please Select from menu");
                         }
                     }
                 }
                 break;
                 case 3:{
                     System.out.println("Which type of Insertion Sort You Want \n1:Insertion Sort in Asscending Order \n2:Insertion Sort in Desscending Order \n3:Exit");
                     int InsertionSelect = sc.nextInt();
                     switch(InsertionSelect){
                         case 1:{
                         Ass_InsertionSort();
                         }
                         break;
                         case 2:{
                         Dec_InsertionSort();
                         }
                         break;
                         case 3:{
                             System.out.println("Exit Successfuly......");
                             return;
                         }
                         default:{
                         System.out.println("Number Cannot be Exist Please Select valid Number");
                         }
                     }
                 }
                 break;
                 case 4:{
                 System.out.println("Which Type of Shell Sort you want Please Select \n1:Shell Sort in Asscending Order \n2:Shell Sort in Descending Order \n3:Exit");
                 int ShellSelect = sc.nextInt();
                 switch(ShellSelect){
                     case 1:{
                     Ass_ShellSort();
                     }
                     break;
                     case 2:{
                     Dec_ShellSort();
                     }
                     break;
                     case 3:{
                     System.out.println("Exit Successfuly.........");
                     return;
                     }
                     default:{
                     System.out.println("Number Cannot be Exist Please Select Valid Number");
                     break;
                     }
                 }
                 }
                 break;
                 case 5:{
                     System.out.println("Which type of Merging You Want \n1:Merge Sort in Asscending Order \n2:Merge Sort in Descending Order \n3:Exit");
                     int mergeselect = sc.nextInt();
                     switch(mergeselect){
                         case 1:{
                         MergeSort_Asc(Arr,LB,N);
                         }
                         break;
                         case 2:{
                         MergeSort_Dec(Arr,LB,N);
                         }
                         break;
                         case 3:{
                             System.out.println("Exit Successfuly.....");
                             break;
                         }
                         default :{
                             System.out.println("You Enter Invalid Number Please Select Carefuly");
                         }
                     }
                 }
                 break;
                 case 6:{
                             System.out.println("Which type of Quick Sort You want to do \n1:Quick Sort in Assscending Order \n2:Quick Sort in Descending order \n3:Exit");
                             int QuickSortSelect = sc.nextInt();
                             switch(QuickSortSelect){
                                 case 1:{
                                 Quick_Sort_Asc(Arr,LB,N);
                                 }
                                 break;
                                 case 2:{
                                 Quick_Sort_Dec(Arr,LB,N);
                                 }
                                 break;
                                 case 3:{
                                 System.out.println("Exit Successfuly.....");
                                 break;
                                 }
                                 default:{
                                 System.out.println("Number not be exist Please Enter valid Number");
                                 }
                             }
                         }
                         break;
                 case 7:{
                 System.out.println("Exit Successfuly.......");
                 return;
                 }
                 default:{
                 System.out.println("Your Slection does not exist.Please Select valid Number");
                 }
             }
            }
            break;
            case 5:{
            System.out.println("WHICH TYPE OF SEARCHING YOU WANT \n1:Linear Search \n2:Binary Search \n3:Exit");
            int SearchSelect = sc.nextInt();
            switch(SearchSelect){
                case 1:{
                  System.out.println("WHICH TYPE OF LINEAR SEARCH YOU WANT PLEASE SELECT \n1:Single Linear Search \n2:Multi Linear Search \n3:Exit");
                  int LinearSelect = sc.nextInt();
                  switch(LinearSelect){
                      case 1:{
                      SingleLinearSearch();
                      }
                      break;
                      case 2:{
                      MultiLinearSearch();
                      }
                      break;
                      case 3:{
                      System.out.println("Exit Successfuly.........");
                      return;
                      }
                      default:{
                      System.out.println("Your Slection does not exist.Please Select valid Number");
                      }
                  }
                } 
                break;
                case 2:{
                  System.out.println("WHICH TYPE OF BINARY SEARCH YOU WANT \n1:Single Binary Seaarch \n2:Multi Binary Search \n3:Exit");
                  int BinarySelect = sc.nextInt();
                  switch(BinarySelect){
                      case 1:{
                      SingleBinarySearch();
                      }
                      break;
                      case 2:{
                      MultiBinarySearch();
                      }
                      break;
                      case 3:{
                      System.out.println("Exit Successfuly.........");
                      return;
                      }
                      default:{
                      System.out.println("Your Slection does not exist.Please Select valid Number");
                      }
                  }
                }
                break;
                case 3:{
                System.out.println("Exit Successfuly........");
                return;
                }
                default :{
                System.out.println("Your Slection does not Exist Please Select valid Number from Menu");
                }
            }
            }
            break;
            case 6:{
            System.out.println("Exit Successfuly................");
            return;
            }
            default:{
            System.out.println("Number Not be Exist Please Select valid number");
            }
        }
    }
  }
void Traverse(){
    if(N==0){
    System.out.println("Array is Empty Traverse is not Possible");
    }
    for(int i=LB; i<=N+LB-1; i++){
      System.out.print(Arr[i] + "\t");
    }
    return;
}
void Insertion(){
   if(N==S){
   System.out.println("Insertion is Not Possible Beacuse Array is full");
   return;
   }
   System.out.println("Enter the index number where you want to Store a number");
   K = sc.nextInt();
   if(K < LB || K > N+LB){
     System.out.println("Invalid Position For Insertion");
     return;
   }
   else{
   System.out.println("Enter a number which you want to Insert");
   Item = sc.nextInt();
   for(int i=N+LB-1; i>=K ; i--){
     Arr[i+1] = Arr[i];
   }
   }
  Arr[K] = Item;
  N++;
  return;
}
void Deletion(){
  if(N==0){
  System.out.println("Array is Empty");
  return;
  }
  System.out.println("Enter an index number which you want to Delete");
  K=sc.nextInt(); 
  if(K < LB || K > N+LB-1){
  System.out.println("Deletion Position is Invalid");
  return;
  }
  System.out.println("Your Deleted Number is:"+Arr[K]);
  for(int i = K+1; i <= N+LB-1; i++){
    Arr[i-1] = Arr[i];
  }
  N = N-1;
  return;
}
void SingleLinearSearch(){
System.out.println("Enter a number which you want to Search");
Item = sc.nextInt();
for(int i=LB; i <= N+LB-1; i++){
        if(Arr[i] == Item){
        System.out.println(Item +" Found");
        return;
        }
 }
 System.out.println(Item +"Not Found");
}
void MultiLinearSearch(){
  int count=0;
  System.out.println("Enter a number which you want to Search");
  Item =  sc.nextInt();
  for(int i=LB; i<=N+LB-1; i++)
      if (Arr[i] == Item){
      count++;
      }
  if(count == 0){
  System.out.println("Item Not Found");
  }
  else{
   System.out.println(Item +" Found " +count +"  times");
  }
}
void SingleBinarySearch(){
  System.out.println("Enter value for Search");
  Item = sc.nextInt();
  int low = LB;
  int high = N+LB-1;
  int mid;
  while( low <= high){
     mid = (low + high)/2;
     if(Arr[mid] == Item){
     System.out.println(Item +"Found");
     return;
     }
  else {
     if(Arr[mid] < Item){
        low = mid + 1;
  }
  else{
  high = mid - 1;
  }
  }
}
  System.out.println("Item not Found");
}
void MultiBinarySearch(){
    System.out.println("Enter a Value for Search");
    Item = sc.nextInt();
    int low = LB;
    int high = N+LB-1;
    int mid;
    int count=0;
    while (low <= high){
    mid = (low + high)/2;
    if(Arr[mid] == Item){
    count++;
    int i = mid+1;
    while(i<=high && Arr[i]==Item){
     count++;
     i++;
    }
     i = mid-1;
    while(i>=low && Arr[i]==Item)
    {
    count++;
    i--;
    }
    System.out.println(Item +"Found" +count +" Times");
    return;
    }
    else{
        if(Arr[mid] < Item){
           low = mid + 1;
    }
    else{
        high = mid - 1;
      }
     }
    }
    System.out.println("Item not Found");
    return;
}
void Ass_BubbleSort(){
      int last = N+LB-1;
      for(int j=LB ;j<=N-1; j++){
        for(int i=LB; i<=last-1; i++)
        {
         if(Arr[i] > Arr[i+1]){
           int temp = Arr[i];
           Arr[i] = Arr[i + 1];
          Arr[i+1] = temp;
             }
          }
        }  
        System.out.println("Bubble Sorted Array are:");
        for (int I=LB; I<= N+LB-1; I++)
        {
        System.out.print(Arr[I] + "\t");
        }
}
void Dec_BubbleSort(){
      int last = N+LB-1;
      for(int j=LB ;j<=N-1; j++){
        for(int i=LB; i<=last-1; i++)
        {
         if(Arr[i] < Arr[i+1]){
           int temp = Arr[i];
           Arr[i] = Arr[i + 1];
           Arr[i+1] = temp;
         }
        }
         last--;
        }  
        System.out.println("Bubble Sorted Array are:");
        for (int I=LB; I<= N+LB-1; I++)
        {
        System.out.print(Arr[I] + "\t");
        }
}
void Ass_SelectionSort(){
      for(int i=0; i<N-1; i++) {
	int loc = i;
	for(int j=i+1; j<N; j++) {
	 if(Arr[j]< Arr[loc]){
	    loc = j;
	}
        }
	int temp = Arr[i];
	Arr[i] = Arr[loc];
	Arr[loc] = temp;
	}		
      System.out.println("Selection Sorted Array are:");
      for(int i=LB; i<=N+LB-1; i++){
           System.out.print(Arr[i] +"\t");
      }
   }
void Dec_SelectionSort(){
      for(int i=0; i<N-1; i++) {
	int loc = i;
	for(int j=i+1; j<N; j++) {
	if(Arr[j]>Arr[loc]) {
	    loc = j;
	}
        }
	int temp = Arr[i];
	Arr[i] = Arr[loc];
        Arr[loc] = temp;
    }
      System.out.println("Selection Sorted Array are:");
      for(int i=LB; i<=N+LB-1; i++){
           System.out.print(Arr[i] +"\t");
      }
      }
void Ass_InsertionSort(){
     int last = LB+1;
    for(int j=LB; j<N-1; j++){
    int min = Arr[last];
    int i = last-1;
    while((i>=LB ) && (Arr[i]> min))
    {
       Arr[i+1] = Arr[i];
       i = i-1;
    }
    Arr[i+1] = min;
    last = last+1;
}
    System.out.println("Asscending Insertion Sorted Array is:");
    for(int i=LB; i<= N+LB-1; i++){
        System.out.print(Arr[i] +"\t");
    }
}
void Dec_InsertionSort(){
    int last = LB+1;
    for(int j=LB; j<N-1; j++){
    int max = Arr[last];
    int i = last-1;
    while((i>=LB ) && (Arr[i]< max))
    {
       Arr[i+1] = Arr[i];
       i = i-1;
    }
    Arr[i+1] = max;
    last = last+1;
}
    System.out.println("Descending Insertion Sorted Array is:");
    for(int i=LB; i<= N+LB-1; i++){
        System.out.print(Arr[i] +"\t");
    }   
}
void Ass_ShellSort(){
    int Gap = (N/2);
    while(Gap!=0){
        for(int last=LB+Gap; last <= N+LB-1; last++){
            int min=Arr[last];
            int i=last-Gap;
             while((i>=LB) && (Arr[i]>min)){
        Arr[i + Gap] = Arr[i];
        i = i-Gap;
        }
        Arr[i + Gap] = min;
        }
        Gap = (int) (Gap/2);
        
    }
    System.out.print("Asscending Shell Sorted Array is:");
    for(int i=LB;i <= N+LB-1; i++){
        System.out.print(Arr[i] +"\t");
    }
}
void Dec_ShellSort(){
    int Gap = (int) N/2;
    while(Gap!=0){
    for(int last=LB+Gap;last<=N+LB-1;last++){
            int max=Arr[last];
            int i=last-Gap;
             while((i>=LB) && (Arr[i]<max)){
        Arr[i + Gap] = Arr[i];
        i = i-Gap;
        }
        Arr[i + Gap] = max;
        }
        Gap = (int) (Gap/2);
    }
    System.out.print("Descending Shell Sorted Array is:");
    for(int i=0;i <= N+LB-1; i++){
        System.out.print(Arr[i] + "\t");
    }
}
//MergeSort Asscending
void MergeSort_Asc(int Arr[],int LB,int N){
  int low = LB;
  int High = N+LB-1;
  MergeSort_Sub_Asc(Arr,low,High);
  System.out.println("Done.....Use Traverse to See");
}
void MergeSort_Sub_Asc(int Arr[],int low,int High){
   if(low < High){
   int mid = (low + High)/2;
   MergeSort_Sub_Asc(Arr,low,mid);
   MergeSort_Sub_Asc(Arr,mid + 1,High);
   Merge_Asc(Arr,low,mid,High);
   }
}
void Merge_Asc(int Arr[],int low, int mid,int High){
    int LB = 0;
    int NL = mid-low+1;
    int NR = High-mid;
    int k = 0;
    int Left[] = new int[NL];
    int Right[] = new int[NR];
    for(int i=low; i<=mid; i++){
    Left[k] = Arr[i];
    k = k+1;
    }
    int j = 0;
    for(int i=mid+1; i<=High; i++){
    Right[j] = Arr[i];
    j = j+1;
    }
    int PTR_L = LB;
    int PTR_R = LB;
    int PTR_A = low;
    while((PTR_L < NL) && (PTR_R < NR)){
    if(Left[PTR_L] < Right[PTR_R]){
        Arr[PTR_A] = Left[PTR_L];
       PTR_L = PTR_L + 1;
       PTR_A = PTR_A + 1;
    }
    else{
          Arr[PTR_L] = Right[PTR_R];  
          PTR_R = PTR_R + 1;
          PTR_A = PTR_A + 1;
     }
    }
    if(PTR_L > NL){
     while(PTR_R <  NR){
     Arr[PTR_A] = Right[PTR_R];
     PTR_R = PTR_R + 1;
     PTR_A = PTR_A + 1;
     }
    }
    else{
      while(PTR_L < NL){
      Arr[PTR_A] = Left[PTR_L];
      PTR_L = PTR_L + 1;
      PTR_A = PTR_A + 1;
      }
      return;
    }       
}
void MergeSort_Dec(int Arr[],int LB,int N){
  int low = LB;
  int High = N+LB-1;
  MergeSort_Sub_Dec(Arr,low,High);
  System.out.println("Done....Use Traverse to See");
}
//MergeSort Descending
void MergeSort_Sub_Dec(int Arr[],int low,int High){
   if(low < High){
   int mid = (low + High)/2;
   MergeSort_Sub_Dec(Arr,low,mid);
   MergeSort_Sub_Dec(Arr,mid + 1,High);
   Merge_Dec(Arr,low,mid,High);
   }
}
void Merge_Dec(int Arr[],int low, int mid,int High){
    int LB = 0;
    int NL = mid-low+1;
    int NR = High-mid;
    int k = 0;
    int Left[] = new int[NL];
    int Right[] = new int[NR];
    for(int i=low; i<=mid; i++){
    Left[k] = Arr[i];
    k = k+1;
    }
    int j = 0;
    for(int i=mid+1; i<=High; i++){
    Right[j] = Arr[i];
    j = j+1;
    }
    int PTR_L = LB;
    int PTR_R = LB;
    int PTR_A = low;
    while((PTR_L < NL) && (PTR_R < NR)){
    if(Left[PTR_L] > Right[PTR_R]){
        Arr[PTR_A] = Left[PTR_L];
    PTR_L = PTR_L + 1;
    PTR_A = PTR_A + 1;
    }
    else{
          Arr[PTR_L] = Right[PTR_R];  
          PTR_R = PTR_R + 1;
          PTR_A = PTR_A + 1;
    }
    }
    if(PTR_L > NL){
     while(PTR_R < NR){
     Arr[PTR_A] = Right[PTR_R];
     PTR_R = PTR_R + 1;
     PTR_A = PTR_A + 1;
     }
    }
    else{
      while(PTR_L < NL){
      Arr[PTR_A] = Left[PTR_L];
      PTR_L = PTR_L + 1;
      PTR_A = PTR_A + 1;
      }
      return;
    }       
}
void Quick_Sort_Asc(int Arr[],int LB,int N){
int Low = LB;
int High = N+LB-1;
Quick_Sort_Sub_Asc(Arr,Low,High);
System.out.println("Done......Use Traverse to See");
}
void Quick_Sort_Sub_Asc(int Arr[],int Low,int High){
   if(Low < High){
   int index = Partition_Asc(Arr, Low, High);
   Quick_Sort_Sub_Asc(Arr, Low, index - 1);
   Quick_Sort_Sub_Asc(Arr, index + 1 ,High);
   }
}
int Partition_Asc(int Arr[],int Low,int High){
  int Pivot = Arr[Low];
  int i = Low+1;
  int j = High;
  while(i <= j){
         while((i <= High) && (Arr[i] <= Pivot)){
         i++;       
         }
         while(Arr[j] > Pivot){
         j--;
         }
         if(i < j){
         int temp = Arr[i];
         Arr[i] = Arr[j];
         Arr[j] = temp;
         }
         else
         {
         int temp = Arr[Low];
         Arr[Low] = Arr[j];
         Arr[j] = temp;
         }
         }       
         return j;
}
void Quick_Sort_Dec(int Arr[],int LB,int N){
int Low = LB;
int High = N+LB-1;
Quick_Sort_Sub_Dec(Arr,Low,High);
    System.out.println("Done.....Use Traverse to See");
}
void Quick_Sort_Sub_Dec(int Arr[],int Low,int High){
   if(Low < High){
   int index = Partition_Dec(Arr, Low, High);
   Quick_Sort_Sub_Dec(Arr, Low, index - 1);
   Quick_Sort_Sub_Dec(Arr, index+1 ,High);
   }
}
int Partition_Dec(int Arr[],int Low,int High){
  int Pivot = Arr[Low];
  int i = Low+1;
  int j = High;
  while(i <= j){
           while((i >= LB) && (Arr[i] >= Pivot)){
           i++; 
           }
           while(Arr[j] < Pivot){
           j--;
           }
           if(i < j){
           int temp = Arr[i];
           Arr[i] = Arr[j];
           Arr[j] = temp;
           }
  else{
           int temp = Arr[Low];
           Arr[Low] = Arr[j];
           Arr[j] = temp;
        }
  }
  return j;
}
}



