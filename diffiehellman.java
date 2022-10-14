import java.util.*;
class Diffie_Hellman{
public static void main(String args [])
{
Scanner sc= new scanner(System.in)
System.out.println("Enter 1st prime no n=");
int n = sc.nextInt();
System.out.println("Enter 2nd prime no g=");
int g = sc.nextInt();
System.out.println("Enter random number chosen by sender x=");
int x= sc.nextInt();
int A=(int)Math.pow(g,x)%n;
System.out.println("Enter random number chosen by reciever y=")
int y=sc.nextInt();
int B=(int)Math.pow(g, y)%n;
int k1=(int)Math.pow(B, x)%n;
int k2=(int)Math.pow(A, y)%n;
if(k1==k2){
System.out.println("Sender and Reciever can communicate with each other!!!!");
System.out.println("They share a secret key="+k1);
}
else{
System.out.println("Sender and Reciever cannot communicate with each other!!!!");
}
}
}
