import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //writeFileByFileOutputStream("fileOut.txt", readFileByFileInputStream("file.txt"));
        //writeFileByBufferedOutputStream("fileOut.txt", readFileByBufferedInputStream("file.txt"));
        writeFileByStrings("fileOut.txt", sortStrings(readFileByStrings("file.txt")));
    }

    public static List<Integer> readFileByFileInputStream(String fileName) {
        List<Integer> list = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(fileName)) {
            int i;
            while ((i = fileIn.read()) != -1) {
                list.add(i);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }

    public static void writeFileByFileOutputStream(String outPutFileName, List<Integer> file) {
        try (FileOutputStream fileOut = new FileOutputStream(outPutFileName)) {
            for (int i = 0; i < file.size(); i++) {
                fileOut.write(file.get(i));
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static List<Integer> readFileByBufferedInputStream(String fileName) {
        List<Integer> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int i;
            while ((i = bis.read()) != -1) {
                list.add(i);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }

    public static void writeFileByBufferedOutputStream(String outPutFileName, List<Integer> file) {
        byte[] arr = new byte[file.size()];
        for (int i = 0; i < file.size(); i++) {
            arr[i] = file.get(i).byteValue();
        }

        try (FileOutputStream fos = new FileOutputStream(outPutFileName);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(arr, 0, arr.length);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static List<String> readFileByStrings(String fileName) {
        ArrayList<String> list = new ArrayList<String>();
        String a;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Scanner sc = new Scanner(br);
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return list;
    }

    public static List<String> sortStrings(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static void writeFileByStrings(String fileName, List<String> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i)+ "\n");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
