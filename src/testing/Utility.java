package testing;
import java.io.IOException;
public class Utility {
	private Utility() {}
	public static String read(String message) {
		try {
			int k;
			String out="";
			System.out.print(message);
			do {
				k = System.in.read();
				if(k!=10 && k!=13) { out = out + (char)k; }
			}while(k!=10);
			return out;
		} catch (IOException e) {
			return "";
		}
	}
}
