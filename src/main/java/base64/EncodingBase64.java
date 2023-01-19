package base64;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class EncodingBase64 {

    public static void main(String[] args) {

        String str = "lullaby2537@naver.com";
        byte[] strToByte = str.getBytes(StandardCharsets.UTF_8);
        byte[] strToBase64 = Base64.getEncoder().encode(strToByte);
        byte[] decodedStr = Base64.getDecoder().decode(strToBase64);
        String base64 = new String(strToBase64);
        String utf8 = new String(decodedStr);

        System.out.printf("String::%s%n",str);
        System.out.printf("String to Byte UTF-8::%s%n",Arrays.toString(strToByte));
        System.out.printf("String To Byte Base64::%s%n",Arrays.toString(strToBase64));
        System.out.printf("String To Decode UTF8::%s%n",Arrays.toString(decodedStr));
        System.out.printf("UTF8 String::%s%n",utf8);
        System.out.printf("Base64 String::%s%n",base64);
    }
}
