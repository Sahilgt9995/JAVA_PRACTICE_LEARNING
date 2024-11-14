package Inputandoutputs;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriting {
    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(System.in);
        String name = n.next();
        String msg = n.next();
        FileWriter fwrite = new FileWriter("./abcd.txt");
        fwrite.write("A named location used to store related information is referred to as a File.");
        fwrite.close();


    }
}































//        try {
//
//            // writing the content into the FileOperationExample.txt file
//
//
//            // Closing the stream
//            fwrite.close();
//            System.out.println("Content is successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("Unexpected error occurred");
//            e.printStackTrace();
//        } }