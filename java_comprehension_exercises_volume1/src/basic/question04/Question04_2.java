package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] ageGroupe = { 23, 33, 26, 21, 25, 22 };

		System.out.println("４番目の人の年齢を入力してください。");

		String str = reader.readLine();
		int temporaryAge = Integer.parseInt(str);

		ageGroupe[3] = temporaryAge;

		System.out.println("4 番目の人の年齢は" + ageGroupe[3] + "歳です");
		System.out.println("人数は" + ageGroupe.length + "人です。");

	}

}
