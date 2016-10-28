import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class StudentScoresOut {
	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("E:\\Workspace\\StringsExcercises\\+"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();}
		sf.close();
		FileWriter fw = new FileWriter("E:\\Workspace\\StringsExcercises\\+.out");
		PrintWriter output = new PrintWriter(fw);
		int total;
		int num;
		double average;
		String result = "";
		for (int n = 0; n <= maxIndx; n++){
			total = 0;
			num = 0;
			result = "";
			Scanner b = new Scanner(a[n]);
			result = result + b.next() + ", average = ";
			while (b.hasNextInt()){
				total += b.nextInt();
				num++;}
			average = (double)total / num;
			result = result + average;
			output.println(result);
		}
		output.close();
		fw.close();}}
