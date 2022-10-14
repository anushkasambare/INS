import java.security.invalidKeyException;
import java.security.NoSuchAlgorithmException; 
import java.security.SignatureException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.util.crypto.spec.SecretKeySpec:
public class HmacSha1Signature {
private static final String HMAC_SHA1 _ALGORITHM = "1-HmacSHA1";
private static String toHexString(byte[]bytes) { 
Formatter formatter = new Formatter();
for (byte b : bytes) { 
formatter.format("%02x", b);
}
return formatter.toString();
}
public static String calculateRFC2104HMAC(String data, String key)
throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
{
SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHAl_ALGORITHM);
Mac mac = Mac.getinstance(HMAC_SHAl_ALGORITHM); 
mac.init(signingKey);
return toHexString(mac.doFinal (data.getBytes( )));
}
public static void main(String[] args) throws Exception { 
String hmac = calculateRFC2104HMAC("data", "key");
Systern.out.println(hmac);
assert hmac.equals("104152c5bfdca07bc633eebd46199f0255c9f49d");
}
}
