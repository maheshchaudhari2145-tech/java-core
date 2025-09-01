 import java.util.Scanner;

public class ConverforeachIntoForInArray{
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a N : ");
  int n = sc.nextInt();

  int a[] = new int[n];

  System.out.println("Enter a "+n+" elemets");
  for (int i=0; i<n; i++) 
   a[i] = sc.nextInt();
  
  while(true){
   System.out.println("""
    1. Display
    2. Max
    3. Min
    4. Search
    5. Delete
    6. Sort
    7. Sum
    8. Avg
    9. Frequancy
    10. Reverse
    11. EXIT
    Enter a Choice : 
   """);
   int ch = sc.nextInt(); 
   switch(ch){
    case 1->{
     display(a,n);
    }
    case 2->{
     System.out.println("Max : "+max(a,n));
    }
    case 3->{
     System.out.println("Min : "+min(a,n));
    }
    case 4->{
     System.out.println("Enter a Element for Search : ");
     int key = sc.nextInt();
     if(search(a,key,n))
      System.out.println("FOUND !!");
     else 
      System.out.println("NOT FOUND !!");
    }
    case 5->{
     System.out.println("Enter a Element for Search : ");
     int key = sc.nextInt();
     n = delete(a,n,key);
    }  
    case 6-> sort(a,n);
    case 7->System.out.println("Sum : "+sum(a,n));
    case 8->System.out.println("AVG : "+(sum(a,n)/n));
    case 9->{
     System.out.println("Enter a Element for Search : ");
     int key = sc.nextInt();
     System.out.println("Frequancy is : "+frequancy(a,n,key));
    }
    case 10-> reverse(a,n);
    case 11->System.exit(0);
   }

  }

 }

 public static void display(int a[],int n){
  for (int i=0; i<n ; i++) {
   System.out.println(a[i]);
  }
 }

 public static int  max(int a[],int n){
  int max = a[0];
  for (int i=0; i<n ; i++ ){
   if(max < a[i])
    max = a[i];
  }
  return max;
  // Arrays.stream(a).max().getAsInt();
 }

 public static int min(int a[],int n){
  int min = a[0];
  for (int i=0; i<n; i++ ) {
   if(min > a[i])
    min = a[i];
  }
  return min;
  
 }

 public static boolean search(int a[],int key,int n){
  for (int i=0;i<n;i++) {
   if(a[i] == key)
    return true;
  }
  return false;
 }


public static int delete(int a[],int n,int key){
  for (int i=0; i<n; i++) {
   if(a[i] == key){
    for (int j=i; j<n-1; j++) 
     a[j] = a[j+1];
    n--;
    i--;
   }
  }
  return n;
 }

 public static void sort(int a[],int n){
  for (int i=0; i<n; i++) {
   for (int j=0; j<n-i-1; j++) {
    if(a[j] > a[j+1]){
     int temp = a[j];
     a[j] = a[j+1];
     a[j+1] = temp;
    }
   }
  }
 }

 public static int sum(int[] a,int n){
  int sum=0;
  for (int i=0; i<n ; i++) {
   sum += a[i];
  }
  return sum;
 }

 public static int frequancy(int[] a,int key,int n){
  int cnt=0;
  for (int i=0; i<n ; i++) {
   if(a[i] == key)
    cnt++;
  }
  return cnt;
 }

 public static void reverse(int a[],int n){
  for (int i=0; i<n/2; i++) {
   int temp = a[i];
   a[i] = a[n-i-1];
   a[n-i-1] = temp;
  }
 }


}