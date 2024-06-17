package com.te.string;

public class FirstNonRepeatingCharacterInString {
	public static void main(String[] args) {
		String s = "abcab";
		Character character = s.chars().mapToObj(e -> (char)e)
				.filter(e -> s.indexOf(e)==s.lastIndexOf(e)).findFirst().get();
		System.out.println(character);
	}

}
