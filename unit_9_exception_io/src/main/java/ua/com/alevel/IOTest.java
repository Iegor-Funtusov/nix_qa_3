package ua.com.alevel;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOTest {

    private static final String PATH_TO_FILE = "text.txt";
    private static final String PATH_TO_DIR = "dir";
    private static final String PATH_TO_DIRS = "dir/dir1/dir2";

    public void test() {
        try {
//            createFile();
//            createDir();
//            createDirs();
//            removeDirs();
            readWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readWrite() throws IOException {
//        Reader reader;
//        Writer writer;
//
//        InputStream inputStream;
//        OutputStream outputStream;

        FileOutputStream fileOutputStream = new FileOutputStream(PATH_TO_FILE);
        byte[] hello = new byte[]{ 104, 101, 108, 108, 111 };
        fileOutputStream.write(hello);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(PATH_TO_FILE);
        byte[] bytes = fileInputStream.readAllBytes();
        for (byte aByte : bytes) {
            System.out.println("aByte = " + aByte);
            System.out.println("aByte = " + (char) aByte);
        }
        fileInputStream.close();

//        BufferedReader bufferedReader = new BufferedReader(
//                new InputStreamReader(System.in));

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(PATH_TO_FILE);
            bufferedReader = new BufferedReader(fileReader);
            String helloString = bufferedReader.readLine();
            System.out.println("helloString = " + helloString);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

        try(BufferedReader bufferedReader1 = new BufferedReader(new FileReader(PATH_TO_FILE))) {
            String helloString = bufferedReader1.readLine();
            System.out.println("helloString = " + helloString);
        } catch (Exception e) { }


//        BufferedReader bufferedReader = new BufferedReader(
//                new FileReader(PATH_TO_FILE));
        String helloString = bufferedReader.readLine();
        System.out.println("helloString = " + helloString);
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter(PATH_TO_FILE, true);
        fileWriter.write(" world");
        fileWriter.close();

        fileWriter = new FileWriter(PATH_TO_FILE, true);
        fileWriter.write("\n");
        fileWriter.write("test");
        fileWriter.close();
    }

    private void createFile() throws IOException {
        File file = new File(PATH_TO_FILE);
        String absolutePath = file.getAbsolutePath();
        String path = file.getPath();
        System.out.println("absolutePath = " + absolutePath);
        System.out.println("path = " + path);
        file.createNewFile();
    }

    private void createDir() throws IOException {
        File file = new File(PATH_TO_DIR);
        file.mkdir();
    }

    private void createDirs() throws IOException {
        File file = new File(PATH_TO_DIRS);
        file.mkdirs();
    }

    private void removeDirs() throws IOException {
        System.out.println("start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File dir = new File(PATH_TO_DIR);
        FileUtils.deleteDirectory(dir);
//        removeDirs(file);
        System.out.println("finish");
    }

//    private void removeDirs(File dir) throws IOException {
//        File[] files = dir.listFiles();
//        if (files != null && files.length != 0) {
//            for (File file : files) {
//                if (file.isFile()) {
//                    file.delete();
//                } else {
//                    removeDirs(file);
//                }
//            }
//        } else {
//            dir.delete();
//        }
//    }
}
