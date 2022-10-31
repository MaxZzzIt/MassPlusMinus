package by.home.maxzzzit;

// Напишите класс, который создает серию из 20 случайных чисел из диапазона 30... 49.
// Числа в серии следует вывести на экран в одну строку следующим образом:
// • перед значениями, которые меньше первого в серии, вывести знак «минус»;
// • перед значениями, которые больше первого в серии, вывести знак «ПЛЮС».
public class MassPlusMinus {

	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i = 0; i <= 19; i++) {
			array[i] = (int) (30 + Math.random() * 20);
//				System.out.print(array[i]+" ");
			if (array[0] > array[i]) {
				System.out.print("-" + array[i] + " ");
			} else if (array[0] < array[i]) {
				System.out.print("+" + array[i] + " ");
			} else if (array[0] == array[i]) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.print("\nСравниваем с числом: " + array[0]);
	}
}
