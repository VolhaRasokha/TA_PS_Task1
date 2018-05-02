/*Sort list or array by count of vowels in string 
(Отсортировать список по количеству гласных встроке)*/

package by.epam.ta.ps.task1_1.sort;

public class SortByCountVowels {

	public static void main(String[] args) {

		String[] myList = { "Minsk", "manyVowelsaaaEEYYy", "testA u", "Tallin"};
		sortArray(myList);

		for (int j = 0; j < myList.length; j++) {
			System.out.println(myList[j]);
		}
	}

	private static void sortArray(String[] myList) {
		int result;
		do {
			result = 0;
			for (int i = 0; i < myList.length - 1; i++) {
				int count1 = calcVowels(myList[i]);
				int count2 = calcVowels(myList[i + 1]);

				if (count1 > count2) {
					String elem2 = myList[i + 1];
					String elem1 = myList[i];

					myList[i] = elem2;
					myList[i + 1] = elem1;

					result = 1;
				}
			}
		} while (result > 0);
	}

	private static int calcVowels(String str) {
		int tempCount = 0;
		String vowels = "eEuUiIoOaAyY";
		char[] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length; i++) {
			if (vowels.indexOf(chArray[i]) != -1) {
				tempCount = tempCount + 1;
			}
		}
		return tempCount;
	}

}
