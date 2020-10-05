package chap5;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// 1번
				// 내가 짠것
//				int[] num = new int[3];
//				for (int i = 0; i < num.length; i++) {
//				      num[i]= (int) (Math.random() * 10);
//				     for(int j=0;j<i;j++) {
//				    	 if(num[i]==num[j]) {
//					    	  i--;
//					      }
//				     }
//				System.out.print(num[i] + " ");
//				}
//				System.out.println();
//				
//				System.out.println("번호 정렬");
//				for (int i = 0; i < num.length; i++) {
//					boolean b = false;
//					for (int j = 0; j < num.length - i - 1; j++) {
//						if (num[j] > num[j + 1]) {
//							int tmp = num[j];
//							num[j] = num[j + 1];
//							num[j + 1] = tmp;
//							b = true;
//						}
//					}
//					if (!b)
//						break;
//				}
//				for (int l : num)
//					System.out.print(l + " ");
//				System.out.println();

				// 강사님
//				int[] arr1 = {1,2,3,4,5,6,7,8,9};
//				int[] arr2 = new int[3];
//				for (int i = 0; i <1000; i++) {
//					int f = (int)(Math.random() * arr1.length);
//					int t = (int)(Math.random() * arr1.length);
//					int tmp = arr1[f];
//					arr1[f] = arr1[t];
//					arr1[t] = tmp;
//				}
//				for(int i=0;i<arr2.length;i++) {
//					arr2[i]=arr1[i];
//				}
//				Arrays.sort(arr2);//배열정령 메소드
//				for(int a : arr2) {
//					System.out.print(a);
//				}

				// 2번
//				int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; 
//				int[][] result = new int[6][4];
//				
//				for (int i = 0; i < score.length; i++) {	
//					for (int j = 0; j < score[i].length; j++) {
//						result[i][j] = score[i][j];
//					    result[i][3]+= score[i][j];
//						result[5][j]+= score[i][j];
//						}	
//					result[5][3]+=result[i][3];
//				}
//				for(int i=0;i<result.length;i++) {
//					for ( int j=0;j<result[i].length;j++) {
//						System.out.print(result[i][j] + "\t");
//					}
//					System.out.println();
//				}

				// 강사님
//				int[][] score = { { 90, 80, 70 }, { 95, 85, 75 }, { 70, 80, 75 }, { 75, 70, 85 }, { 70, 75, 80 } };
//				int[][] result = new int[score.length + 1][score[0].length + 1];
//				for (int i = 0; i < score.length; i++) {
//					for (int j = 0; j < score[i].length; j++) {
//						result[i][j] = score[i][j];
//						result[i][score[i].length] += score[i][j];
//						result[score.length][j] += score[i][j];
//						result[score.length][score[i].length] += score[i][j];
//					}
//				}
//				for (int i = 0; i < result.length; i++) {
//					for (int j = 0; j < result[i].length; j++) {
//						System.out.printf("%5d", result[i][j]);
//					}
//					System.out.println();
//				}

				// 3번
//				Scanner scan = new Scanner(System.in);
//				System.out.println("배열의 크기를 홀수로 입력해주세요");
//				int h = scan.nextInt();
//				int[][] arr= new int[h][h];
//				int[][] arr1= new int[h][h];
//				
//				for (int i = 0; i <= arr.length/2; i++) {  
//					for (int j = 0; j<arr.length-i; j++) {
//						if (j <i) {
//							System.out.print(" ");
//						} else {
//							System.out.print("*");
//						}
//					}
//					System.out.println(" ");
//				}
//				for (int i = arr1.length/2+1; i < arr1.length; i++) {  
//					for (int j = 0; j <=i; j++) {
//						if (j>=arr1[i].length-i-1&&j<=i) {
//							System.out.print("*");
//						} else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println(" ");
//				}
				// 강사님
				// 배열안에 먼저 for구문으로 별표를 넣고 배열을 찍어내서 출력
//				Scanner scan = new Scanner(System.in);
//				System.out.println("배열의 크기를 홀수로 입력해주세요");
//				int num = scan.nextInt();
//				char[][] arr = new char[num][num];
//				for (int i = 0; i <=arr.length / 2; i++) {
//					for (int j = i; j < arr.length - i; j++) {
//						arr[i][j] = '*';
//					}
//				}
//				for (int i = arr.length / 2 + 1; i <arr.length; i++) {
//					for (int j = arr.length - i - 1; j <= i; j++) {
//						arr[i][j] = '*';
//					}
//				}
//				for (int i = 0; i < arr.length; i++) {
//					for (int j = 0; j < arr[i].length; j++) {
//						System.out.print(arr[i][j]);
//					}
//					System.out.println();
//				}

				// 4번 아예 못했음 시간에
				// 강사님
//				Scanner scan = new Scanner(System.in);
//				System.out.println("길이를 홀수로 입력해주세요");
//				int num = scan.nextInt();
//				int[][] matrix = new int[num][num];
//				int sum = 0;
//				for (int i = 1; i <= num; i += 2)
//					sum += i;
//				int data = sum * 2 - 1; //시작되는 숫자값
//				for (int i = 0; i <= matrix.length / 2; i++) {
//					for (int j = i; j < matrix.length - i; j++) {
//						matrix[i][j] = data--;
//					}
//				}
//				for (int i = matrix.length / 2 + 1; i < matrix.length; i++) {
//					for (int j = matrix.length - i - 1; j <= i; j++) {
//						matrix[i][j] = data--;
//					}
//				}
//				for (int i = 0; i < matrix.length; i++) {
//					for (int j = 0; j < matrix[i].length; j++) {
//						if (matrix[i][j] == 0) {
//							System.out.print("    ");
//						} else {
//							System.out.printf("%4d", matrix[i][j]);
//						}
//					}
//					System.out.println();
//				}

				// 5번
//				if (args.length == 0) {
//					System.out.println("java Test5 10의 약수 구하기");
//					return;
//				}
//				int num = Integer.parseInt(args[0]);
//				System.out.print(num + "의 약수: ");
//				for (int i = 1; i < num + 1; i++) {
//					if (num % i == 0) {
//						System.out.print(i + " ");
//					}
//				}

				// 강사님
//				if (args.length == 0) {
//					System.out.println("Command 라인에 파라미터를 입력하세요");
//					System.out.println("java Test5 10의 약수 구하기");
//					return;
//				}
//				for (String a : args) { // 원하는 배열로 숫자를 넣는만큼 돌아감
//					int num = Integer.parseInt(a); //문자열을 정수로 바꿔주는 구문
//					System.out.print(num + "의 약수: ");
//					for (int i = 1; i <= num; i++) {
//						if (num % i == 0) {
//							System.out.print(i + " ");
//						}
//					}
//				}

				// 6번 못건드림   //깃허브 볼것
				// 강사님
				if (args.length!= 2) {
					System.out.println("Command 라인에 두개의 파라미터를 입력하세요");
					System.out.println("java Test6 10 20");
					return;
				}
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				System.out.println(num1 + "과" + num2 + "의 공약수 : ");
				
				
			}
		}
