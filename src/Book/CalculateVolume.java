package Book;
import java.io.File;
import java.io.*;
import java.util.*;
public class CalculateVolume {
    public static void main(String args[]) throws IOException {
        File fRead = new File("C:\\Users\\lenovo\\Documents\\Tencent Files\\2716030624\\FileRecv\\goods.txt");
        File fWrite = new File("goodsVolume.txt");
        try {
            Writer out = new FileWriter(fWrite, true);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            while ((str = bufferRead.readLine()) != null) {
                double s = Jisuan.getVo1ume(str);
                str = str + "体积" + s + "cm3";
                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferRead.close();
            bufferWrite.close();
        }
        catch(IOException e){
            System.out.println(e. toString());
        }
    }

}
