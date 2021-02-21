import java.io.*;

public class Beolvaso {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		PrintWriter pw = new PrintWriter("b.txt");
		String line = br.readLine();
		String secret = "";
		for (int i=0;i<line.length();i++) 
			{
				char c = line.charAt(i);
				c++;
				secret = secret + c; 
			}
		pw.println(secret);
		pw.flush();
		br.close();
		pw.close();
	}

}
