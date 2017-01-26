package string;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 * @author Administrator
 *
 */
public class WordLengthOfLast {

	public static void main(String[] args) {
		System.out.println("请输入一个字符串,每个单词中间用空格隔开: ");
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()){
			String str = input.nextLine();
			int length = getLength(str);
			System.out.println("字符串最后一个单词的长度为: " + length);
		}
	}
	
	public static int getLength(String str) {
		int length = 0;
		
		if(str != null && str.length() > 1) {
			String[] arr = str.split(" ");
			length = arr[arr.length - 1].length();
		}else{
			length = 0;
		}

		return length;
	}
}
