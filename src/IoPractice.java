import java.io.*;
import java.util.Scanner;

public class IoPractice {
    public static void main(String[] args) throws IOException{
        String inputFile = "./JamesArthurGosling.txt";
        String outputFile = "./JamesArthurGosling_edit.txt";

        // 찾을 단어 / 변경 단어 입력 받기=
        System.out.println("찾을 단어: ");
        Scanner sc = new Scanner(System.in);
        String find = sc.nextLine();
        System.out.println("변경 단어: ");
        String to = sc.nextLine();


        // 파일 읽기, 변경 및 저장
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        FileWriter fw = new FileWriter(outputFile);

        while (true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            String newLine = line.replace(find, to);
            fw.write(newLine + '\n');
        }

        br.close();
        fw.close();
    }

}
