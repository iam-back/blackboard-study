package file_io;

import java.io.*;

public class Serialization {

    public void serializeUser(User user,String fileName) throws IOException{

        File file = getFile(fileName);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public User deserializeUser(File file){

        User user = null;

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            user = (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return user;
    }

    public File getFile(String name){
        String prefix = "C:\\Users\\user\\BACK\\2023\\lab\\blackboard\\src\\main\\resources\\";
        String suffix = ".txt";

        return new File(prefix + name + suffix);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serialization serialization = new Serialization();
        User user = new User();
        User user2;
        user.setName("lim ki back");
        user.setPassword("123456");
        user.setEmail("lullaby2537@naver.com");

        serialization.serializeUser(user,"user");
        user2 = serialization.deserializeUser(serialization.getFile("user"));

        System.out.println(user2.toString());

    }
}
