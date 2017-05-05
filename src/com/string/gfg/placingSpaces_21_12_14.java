package com.string.gfg;

import java.util.*;
import java.io.*;

public class placingSpaces_21_12_14 {

	public static void main(String[] args) {

		String str = ("ABCDE");
		char[] str1 = str.toCharArray();
		char[] buffer = new char[2 * str.length()];
		buffer[0] = str1[0];
		spaceFun(str1, buffer, 1, 1, str.length());

	}

	public static void spaceFun(char[] str, char[] buffer, int i, int j, int len) {

		if (len == i) {
			while (j < buffer.length) {
				buffer[j] = ' ';
				j++;
			}
			System.out.println(buffer);
			return;
		}

		buffer[j] = str[i];
		spaceFun(str, buffer, i + 1, j + 1, len);

		buffer[j] = ' ';
		buffer[j + 1] = str[i];
		spaceFun(str, buffer, i + 1, j + 2, len);
	}

}
