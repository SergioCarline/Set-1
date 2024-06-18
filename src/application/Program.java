package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<LogEntry> set = new HashSet<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String user = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(user,moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			br.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
