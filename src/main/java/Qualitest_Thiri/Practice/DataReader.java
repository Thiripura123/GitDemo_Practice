package Qualitest_Thiri.Practice;

import java.util.List;

public class DataReader {

	public static void main(String[] args) {
		readCSV();
			}
	public static void readCSV()
	{
		String filename ="C:\\Users\\thiripura.sundari\\Desktop\\New folder\\UserAccount.csv";
		List <string[]> records = Utilities.CSV.get(filename);
		for (String[] record : records)
		{
			for (String field : record)
			{
				System.out.println(field);
			}
		}
	}

}
