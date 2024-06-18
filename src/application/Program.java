package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		System.out.println("How many students for course A? ");
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			A.add(sc.nextInt());
		}
		
		System.out.println("How many students for course B? ");
		int b = sc.nextInt();
		for(int i=0; i<b; i++) {
			B.add(sc.nextInt());
		}
		
		System.out.println("How many students for course C? ");
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			C.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}

}
