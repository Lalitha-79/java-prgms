package assignment3;
		import java.io.*;
		import java.util.*;


		public class HashTable
		{

				public static void main(String args[])
				{
				
					Hashtable<Integer, String> ht1 = new Hashtable<>();
					Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

			
					ht1.put(11, "Vijaya");
					ht1.put(24, "Pappu");
					ht1.put(33, "Satya");

					ht2.put(40, "Lilly");
					ht2.put(05, "Maahi");
					ht2.put(16, "Buddi");

					
					System.out.println("Student ID with Names : " + ht1);
					System.out.println("Student ID with Names : " + ht2);
				}
		}
	
