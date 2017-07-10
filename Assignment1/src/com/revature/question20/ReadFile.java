package com.revature.question20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {

	private  static List<Person> list = new ArrayList<>();

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("src/Data.txt"))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				//creating a object for class person
				Person p = new Person();
				// splits to new variable once colon is reached
				String[] data = sCurrentLine.split(":");

				//Assignment
				p.setFirstName(data[0]);
				p.setLastName(data[1]);
				p.setAge(Integer.parseInt(data[2]));
				p.setState(data[3]);

				//Adding all set variables to a list of information(Person)
				list.add(p);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).toString());
			System.out.println();

		}
	}//end of main
}//end of readfile class