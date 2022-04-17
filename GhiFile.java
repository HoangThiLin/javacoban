import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile {
	 public static void main(String args[]) throws IOException {
	        FileOutputStream fout = null;
	        try {
	            fout = new FileOutputStream("E:\\testout.txt");
	            fout.write(65);
	            fout.close();
	            System.out.println("success...");
	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            // close file output stream
	            fout.close();
	        }
	    }
}
