package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSV {
	public static List<String[]> get(String filename)
	{
		List <String[]> data =new ArrayList<String[]>();
		String testrow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(filename));
			while ((testrow=br.readLine()) != null )
			{
				String[] line =testrow.split(",");
				data.add(line);
				
			}

		}
		return(data);	
	}
		
	}

}
