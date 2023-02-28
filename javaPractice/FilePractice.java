package javaPractice;

import java.io.*;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        File fle  = new File("C:\\Users\\welcome\\Desktop\\naruto_copy.jpg");
        FileInputStream fileread = new FileInputStream(fle);
        byte[] byteCode = new byte[fileread.available()];
        fileread.read(byteCode);

        FileOutputStream fileWrite = new FileOutputStream("C:\\Users\\welcome\\Desktop\\meta\\naruto_copy1.jpg");
        fileWrite.write(byteCode);
        fileWrite.close();
    }
}
