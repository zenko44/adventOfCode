package adventOfCode;

import java.util.ArrayList;

public class dayTwo {
	
	public String input = "day2.txt";
	
	public static void main(String[] args) {
			dayTwo day = new dayTwo();
			
			System.out.println("part 1" + day.partOne(day.input));
			
			//System.out.println("part 2 "+ day.partTwo(day.input));
			
	}
	
	public String partOne(String input) {
		ArrayList<Integer> checksums = new ArrayList();
		for(String line : input.split("\n")) {
			line = line.trim().replaceAll("+", " ");
			ArrayList<Integer> nums = new ArrayList<>();
			while(!line.trim().isEmpty()) {
				nums.add(Integer.parseInt(line.substring(0, line.indexOf(" "))));
				line = line.substring(line.indexOf(" ")).trim() + " ";
			}
			int highest = nums.get(0), lowest = nums.get(0);
			for(int num:nums) {
				if(num > highest) highest = num;
				else if (num < lowest) lowest = num;
			}
			checksums.add(highest - lowest);
		}
		int total = 0;
		for (int checksum : checksums) {
			total += checksum;
		}return String.valueOf(total);
	}

}
