import java.security.*;
import java.util.Base64.*;
import javax.crypto.*;
import sun.misc.BASE64Encoder;
import java.security.spec.*;
import javax.crypto.spec.*;
public class DES{
Cipher ecipher;
Cipher dcipher;
public DES(SecretKey key,String algorithm){
try{
ecipher=Cipher.getInstance(algorithm);
dcipher=Cipher.getInstance(algorithm);
ecipher.init(Cipher.ENCRYPT_MODE,key);
dcipher.init(Cipher.DECRYPT_MODE,key);
}
catch(Exception e)
{
e.printStackTrace();
}
}
public String encrypt(String str)
{
try{
byte[] utf8=str.getBytes("UTF-8");
byte[] enc=ecipher.doFinal(utf8);
return new sun.misc.BASE64Encoder().encode(enc);
}
catch(Exception e)
{
e.printStackTrace();
}
return null;
}
public String decrypt(String str)
{
try{
byte[]dec=new misc.BASE64(str);
byte[]u=dcipher.doFinal(dec);
return new String(u,"UTF8");
}
catch(Exception e)
{
e.printStackTrace();
}
return null;
}
public static void testUsingSecretKey()
{
try{
System.out.println("");
String SecretString="Anusha";
SecretKey deskey=KeyGenerator.getInstance("DES").generateKey();
DES desEncrypter=new DES(deskey,deskey.getAlgorithm());
String desEncrypted=desEncrypter.encrypt(SecretString);
String desDecrypted=desEncrypter.decrypt(desEncrypted);
System.out.println("");
System.out.println("");
System.out.println("Encrypted String:"+desEncrypted);
System.out.println("");
System.out.println("Length of String:"+desEncrypted.length());
System.out.println("");
System.out.println("Decrypted String:"+desDecrypted);
System.out.println("");
}
catch(NoSuchAlgorithmException e)
{
e.printStackTrace();
}
}
public static void main(String args[])
{
testUsingSecretKey();
}
}
