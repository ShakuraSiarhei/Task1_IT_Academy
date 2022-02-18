package by.training.simpleapp.main;

import java.util.Random;

public class Homework {
	public static void main(String[] args) {
		task1(2342);
		task2(3.0, 3.0, 3.0);
		task3(3, 4);
		task4(-3, 1);
		task5(-3, 3, 4);
		task6(5, -55, 555);
		task7(0, 10, 1);
		task8(30, 20);
		task9(5, 5, 2);
		task10(12);
	}

	public static void task1(int a) {
		System.out.println("1. Сумма двух первых цифр заданного четырехзначного числа\r\n"
				+ "равна сумме двух его последних цифр.\n");
		
		int b;
		int c;
		
		b = a % 10 + (a / 10) % 10;
		c = a / 1000 + (a / 100) % 10;
		
		System.out.println("Ответ " + (b == c) + " для числа " + a + ".\n");
	}

	public static void task2(double a, double b, double c) {
		System.out.println("2. Вычислить значение выражения по формуле.\n");
		
		double result;
		
		result = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("При а = " + a + " b = " + b + " и c = " + c + " значение функции равно = " + result + ".\n");
	}

	public static void task3(double a, double b) {
		System.out.println("3.Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.\n");
		
		double c;
		double perimeter;
		double area;
		
		c = Math.sqrt(a * a + b * b);
		perimeter = a + b + c;
		area = a * b / 2;
		
		System.out.println("Для треугольника со сторонами " + a + " и " + b + " Периметр = " + perimeter + ". Площадь = "
				+ area + "\n");
	}

	public static void task4(int x, int y) {
		System.out.println("4. Принадлежит ли точка заданной области.\n");
		
		if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
			System.out.println("Ответ " + true + " для точки с x = " + x + " y = " + y + ".\n");
		} else {
			System.out.println("Ответ " + false + " для точки с x = " + x + ", y = " + y + ".\n");
		}
	}

	public static void task5(double a, double b, double c) {
		System.out.println("5.Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,\n"
						+ "и в четвертую степень — отрицательные.\n");
		
		double a2;
		double b2;
		double c2;
		
		if (a > 0) {
			a2 = Math.pow(a, 2);
		} else {
			a2 = Math.pow(a, 4);
		}
		
		if (b > 0) {
			b2 = Math.pow(b, 2);
		} else {
			b2 = Math.pow(b, 4);
		}
		
		if (c > 0) {
			c2 = Math.pow(c, 2);
		} else {
			c2 = Math.pow(c, 4);
		}
		
		System.out.println("Результатом возведения чисел" + " (" + a + ", " + b + ", " + c + ") в степени будет: " + a2
				+ ", " + b2 + ", " + c2 + "\n");
	}

	public static void task6(int a, int b, int c) {
		System.out.println("6.Написать программу нахождения суммы большего и меньшего из трех чисел.\n");
		
		int max = a;
		int min = a;
		
		if (b > a) {
			max = b;
		} else {
			min = b;
		}
		
		if (c > b) {
			max = c;
		} else if (c < a) {
			min = c;
		}
		
		System.out.println("Из чисел " + a + ", " + b + ", " + c + " максимальное - " + max + " минимальное - " + min + ".\n");
	}

	public static void task7(int a, int b, int h) {
		System.out.println("7. Программа для вычисления значений функции на участке.\n");
		
		double x = a;
		double result;
		
		System.out.println("+-----------------------+-------------------+");
		System.out.println("|   Значение аргумента." + " | " + "Значение функции. |");
		System.out.println("+-----------------------+-------------------+");
		
		while (x <= b) {
			result = Math.pow(Math.sin(Math.toRadians(x)), 2) - Math.cos(2 * Math.toRadians(x));
			
			System.out.printf("| \t[%4.2f]\t\t|\t[%4.2f]\t    |\n", x, result);
			System.out.println("+-----------------------+-------------------+");
			
			x += h;
		}
	}

	public static void task8(int n, int k) {
		System.out.println("8. Найти сумму тех элементов массива, которые кратны данному k.");
		
		Random rand = new Random();
		int[] arr = new int[n];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(1000);
		}
		
		System.out.print("Для массива: ");
		for (int i : arr) {
			System.out.printf(" %d", i);
			
			if (i % k == 0) {
				sum += i;
			}
		}
		
		System.out.println();
		System.out.printf("Сумма элементов массива, кратных %d, равна %d.\n", k, sum);
	}

	public static void task9(int n1, int n2, int k) {
		System.out.println("9. Объединить два массива в один, включив второй массив между k-м и (k+1) - м элементами первого");
		
		Random rand = new Random();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int[] resultArr = new int[n1 + n2];
		int count = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (i == (k)) {			
				for (int j : arr2) {
					resultArr[count] = j;
					count++;
				}
				resultArr[count] = arr1[i];
				count++;
			} else {
				resultArr[count] = arr1[i];
				count++;
			}
		}
		
		System.out.print("Исходные массивы:");
		for (int i : arr1) {
			System.out.printf(" %d", i);
		}
		System.out.println("");
		System.out.print("\t\t ");
		for (int i : arr2) {
			System.out.printf(" %d", i);
		}
		System.out.println();
		
		System.out.print("Объединенный массив:");
		for (int i : resultArr) {
			System.out.printf(" %d", i);
		}
		System.out.println();
	}

	public static void task10(int n) {
		System.out.println("10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
		
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
			i++;
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr.length - j - 1;
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}
	}
}