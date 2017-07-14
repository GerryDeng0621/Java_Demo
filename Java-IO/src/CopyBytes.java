import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        File f=new File("c:/aaa.txt");
		//f.createNewFile();
        try {
            in = new FileInputStream(f);
            out = new FileOutputStream("c:/outagain.txt");
            int c;
            while ((c = in.read()) != -1) {
               System.out.println(c);
            	out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
