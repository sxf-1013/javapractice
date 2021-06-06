package Book;

import java.io.*;

public class AnalysisResult {
        public static void main(String args[]){
            File fRead=new File("C:\\Users\\lenovo\\Documents\\Tencent Files\\2716030624\\FileRecv\\score.txt");
            File fWrite=new File("scoreAnalyze.txt");
            try {Writer out = new FileWriter(fWrite, true);
                BufferedWriter bufferWrite = new BufferedWriter(out);
                Reader in = new FileReader(fRead);
                BufferedReader bufferRead = new BufferedReader(in);
                String str = null;
                while ((str = bufferRead.readLine()) != null) {
                    double totalScore=Fenxi.getTotalScore(str);
                        double average=Fenxi.getTotalScore(str);
                        average=totalScore/3;
                         str=str+"平均成绩："+average;
                    str=str+"总分：" +totalScore;
                    System.out.println(str);
                    bufferWrite.write(str);
                    bufferWrite.newLine();
                }
                bufferRead.close();
                bufferWrite.close();        }
            catch(IOException e){
                System.out.println(e. toString());
            }
        }
}

