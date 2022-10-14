import java.util.Scanner;
public class CeasarCipher
{
public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";
public static String encrypt(String plainText,int ShiftKey)
{
plainText=plainText.toLowerCase();
String cipherText="";
for(int i=0;i<plainText.length();i++)
{
int charPosition=ALPHABET.indexOf(plainText.charAt(i));
int KeyVal=(ShiftKey+charPosition)%26;
char replaceVal=ALPHABET.charAt(KeyVal);
cipherText+=replaceVal;
}
return cipherText;
}
public static String decrypt(String cipherText,int ShiftKey)
{
cipherText=cipherText.toLowerCase();
String plainText="";
for(int i=0;i<cipherText.length();i++)
{
int charPosition=ALPHABET.indexOf(cipherText.charAt(i));
int KeyVal=(charPosition-ShiftKey)%26;
if(KeyVal<0)
{
KeyVal=ALPHABET.length()+KeyVal;
}
char replaceVal=ALPHABET.charAt(KeyVal);
plainText+=replaceVal;
}
return plainText;
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String for Encryption:");
String message=new String();
message=sc.next();
System.out.println("Encrypted text is:"+encrypt(message,3));
System.out.println("Decrypted text is:"+decrypt(encrypt(message,3),3));
sc.close();
}
}
