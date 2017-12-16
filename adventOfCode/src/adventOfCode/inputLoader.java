package adventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class inputLoader {
	
	public static String getInput(String filename) {
		try {
			File f = new File("src" + File.separator + "adventOfCode" + File.separator + "resources" + File.separator + filename);
			BufferedReader br = new BufferedReader(new FileReader(f));
			StringBuilder data = new StringBuilder();
			String line;
			
			while ((line = br.readLine()) != null)
				data.append(line).append('\n');
			
			return data.toString();
		}catch (Exception e) {
			e.printStackTrace();
			return"";
		}
	}
	
}
