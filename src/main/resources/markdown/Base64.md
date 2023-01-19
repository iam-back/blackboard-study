# BASE64

---

> ***Trigger*** <br>
> 블로그 포트폴리오를 만들던 중, 사용하던 에디터 라이브러리가 image 를 BASE64 방식으로 인코딩하여 저장하는 것을 보고 작성하게 되었다. 

***Objectives***

0. 문자 부호 체계에 대해 알아본다
1. BASE64 에 대해 알아본다
2. 문자열을 BASE64 로 인코딩해본다
3. image file 을 Base64 로 인코딩해본다

## 문자 부호 체계

컴퓨터는 모든 데이터를 이진수로 저장하여 처리한다. 이는 프로그래밍 언어에서 접하게 되는 모든 타입에 대해서도 동일하다. 다시 말하면, 문자 또한 이진수로 저장하게 된다. <br>
이러한 문자들을 숫자와 매핑되도록 약속한 것이 문자 부호 체계라 한다. 문자 부호 체계는 ASCII, UNICODE, EUC-KR 등 여러 종류가 존재한다.

## BASE64

특정 문자 부호 체계에 영향을 받지 않고, ASCII 문자로 표현하기 위한 64진법으로 변환한 문자 부호 체계. 즉, 한 문자는 6비트 메모리 공간을 갖게 된다
ASCII 문자는 8비트(1byte) 단위로 표현되며, 이를 BASE64 로 변환하게 되면, 8비트와 6비트의 최소공배수인 24비트 단위로 묶어 변환한다.

```java
package base64;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class EncodingBase64 {


    public static void main(String[] args) {

        String str = "toy";

        System.out.printf("String::%s%n",str);

        byte[] strToByte = str.getBytes(StandardCharsets.UTF_8);

        System.out.printf("String to Byte UTF-8::%s%n",Arrays.toString(strToByte));

        byte[] strToBase64 = Base64.getEncoder().encode(strToByte);

        System.out.printf("String To Byte Base64::%s%n",Arrays.toString(strToBase64));
    }
}
```