package basic.question04;

import java.io.IOException;

/**
 * 第7章 配列
 */

public class Question04_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		int[] ageGroupe = new int[5];

		ageGroupe[0] = 12;
		ageGroupe[1] = 18;
		ageGroupe[2] = 24;
		ageGroupe[3] = 19;
		ageGroupe[4] = 20;

		System.out.println("３番目の人の年齢は" + ageGroupe[2] + "歳です");

	}

}
