import java.io.*;
class monoalphabetic
{
public static char normalchar[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
public static char codedchar[]={'P','Q','R','S','T','A','B','C','D','V','W','X','Y','Z','L','M','N','O','E','F','G','H','I','K','J','U'};
public static String stringEncryption(String s)
{
String encryptedString="";
for(int i=0;i<s.length();i++)
{
for(int j=0;j<26;j++)
{
if(s.charAt(i)==normalchar[j])
{
encryptedString+=codedchar[j];
break;
}
if(s.charAt(i)<'a'||s.charAt(i)>'z')
{
encryptedString+=s.charAt(i);
break;
}
}
}
return encryptedString;
}
public static String stringDecryption(String s)
{
String decryptedString="";
for(int i=0;i<s.length();i++)
{
for(int j=0;j<26;j++)
{
if(s.charAt(i)==codedchar[j])
{
decryptedString+=normalchar[j];
break;
}
if(s.charAt(i)<'A'||s.charAt(i)>'Z')
{
decryptedString+=s.charAt(i);
break;
}
}
}
return decryptedString;
}
public static void main(String[]args)
{
String str="Hello";
System.out.println("plain text:"+str);
String encryptedString=stringEncryption(str.toLowerCase());
System.out.println("encrypted message:"+encryptedString);
System.out.println("decrypted message:"+stringDecryption(encryptedString));
}
}
