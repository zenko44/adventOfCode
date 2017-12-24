package adventOfCode;

import java.util.ArrayList;

public class dayTwo {

	public String input = inputLoader.getInput("day2.txt");

	public static void main(String[] args) {
		dayTwo day = new dayTwo();

		System.out.println("part 1 " + day.partOne(day.input));

		System.out.println("part 2 " + day.partTwo(day.input));

	}

	public String partOne(String input) {
		ArrayList<Integer> checksums = new ArrayList<>();
		for (String line : input.split("\n")) {
			line = line.trim().replaceAll(" +", " ");
			ArrayList<Integer> nums = new ArrayList<>();
			while (!line.trim().isEmpty()) {
				nums.add(Integer.parseInt(line.substring(0, line.indexOf("	"))));
				line = line.substring(line.indexOf("	")).trim() + "	";
			}

			int highest = nums.get(0), lowest = nums.get(0);
			for (int num : nums) {
				if (num > highest)
					highest = num;
				else if (num < lowest)
					lowest = num;

			}
			checksums.add(highest - lowest);
		}

		int total = 0;
		for (int checksum : checksums)
			total += checksum;
		return String.valueOf(total);
	}

	public String partTwo(String input) {
		int total = 0;
		for (String line : input.split("\n")) {
			line = line.trim().replaceAll(" +", " ");
			ArrayList<Integer> nums = new ArrayList<>();
			while (!line.trim().isEmpty()) {
				nums.add(Integer.parseInt(line.substring(0, line.indexOf("	"))));
				line = line.substring(line.indexOf("	")).trim() + "	";
			}

			for (int i = 0; i < nums.size() - 1; i++) {
				for (int j = i + 1; j < nums.size(); j++) {
					int a = nums.get(i), b = nums.get(j);
					if (a > b) {
						if (a % b == 0) {
							total += a / b;
						}
					} else if (b > a) {
						if (b % a == 0) {
							total += b / a;
						}
					}
				}
			}
		}

		return String.valueOf(total);
	}

}