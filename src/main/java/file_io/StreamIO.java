package file_io;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamIO {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\BACK\\2023\\lab\\blackboard\\src\\main\\resources\\html.txt");
        FileInputStream inputStream = new FileInputStream(file);

        byte[] bytes = new byte[1024];

        /*inputStream.read(bytes);
        System.out.println(new String(bytes));
        inputStream.close();*/

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        int length = bufferedInputStream.read(bytes);
        System.out.printf("Length:%d%n",length);
        System.out.println(new String(bytes));

        bufferedInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\BACK\\2023\\lab\\blackboard\\src\\main\\resources\\io2.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String out = "난 할 수 있다. 독하게 한다.";

        bufferedOutputStream.write(out.getBytes(StandardCharsets.UTF_8));

        bufferedOutputStream.close();



    }
}
