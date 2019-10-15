package Sep5th;

import java.io.File;
import java.io.IOException;

public class TestTom {
	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd", "/C","start", "startup.bat");
			File dir = new File("C:\\Soft\\115943_Pega7.4 - Copy\\apache-tomcat-7.0.82\\bin");
			pb.directory(dir);
			Process p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");

	}
}
