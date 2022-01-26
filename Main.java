import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
		PrintWriter lower = new PrintWriter(new File("Lower.txt"));
		for (int i = 0; i <1000; i++)
		{
			lower.print((int)(97 + (Math.random()*26)) + " ");
		}

		lower.close();

		PrintWriter upper = new PrintWriter(new File("Upper.txt"));
		for (int i = 0; i <1000; i++)
		{
			upper.print((int)(65 + (Math.random()*26)) + " ");
		}

		upper.close();

		PrintWriter upperLower = new PrintWriter(new File("Mixed_letters.txt"));
		for (int i = 0; i <500; i++)
		{
			upperLower.print((int)(65 + (Math.random()*26)) + " ");
			upperLower.print((int)(97 + (Math.random()*26)) + " ");
		}

		upperLower.close();

		PrintWriter upperLowerNumbers = new PrintWriter(new File("Mixed_letters_numbers.txt"));
		for (int i = 0; i <333; i++)
		{
			upperLowerNumbers.print((int)(48 + (Math.random()*11)) + " ");
			upperLowerNumbers.print((int)(65 + (Math.random()*26)) + " ");
			upperLowerNumbers.print((int)(97 + (Math.random()*26)) + " ");
		}

			upperLowerNumbers.print((int)(48 + (Math.random()*11)) + " ");
			upperLowerNumbers.close();

		PrintWriter allChar = new PrintWriter(new File("Mixed_chars.txt"));
		for (int i = 0; i <1000; i++)
		{
			allChar.print((int)(33 + (Math.random()*94)) + " ");
		}

		allChar.close();

		int[] upperInts = new int[1000];
		int[] lowerInts = new int[1000];
		int[] mixedLetInts = new int[1000];
		int[] mixedLetNumInts = new int[1000];
		int[] allCharsInts = new int[1000];

		File first = new File("Lower.txt");
		Scanner scan1 = new Scanner(first);
		int index = 0;
		while (scan1.hasNextInt())
		{
			lowerInts[index] = scan1.nextInt();
			index++;
		}

		scan1.close();

		File second = new File("Upper.txt");
		Scanner scan2 = new Scanner(second);
		index = 0;
		while (scan2.hasNextInt())
		{
			upperInts[index] = scan2.nextInt();
			index++;
		}

		scan2.close();

		File third = new File("Mixed_letters.txt");
		Scanner scan3 = new Scanner(third);
		index = 0;
		while (scan3.hasNextInt())
		{
			mixedLetInts[index] = scan3.nextInt();
			index++;
		}

		scan3.close();

		File fourth = new File("Mixed_letters_numbers.txt");
		Scanner scan4 = new Scanner(fourth);
		index = 0;
		while (scan4.hasNextInt())
		{
			mixedLetNumInts[index] = scan4.nextInt();
			index++;
		}

		scan4.close();

		File fifth = new File("Mixed_chars.txt");
		Scanner scan5 = new Scanner(fifth);
		index = 0;
		while (scan5.hasNextInt())
		{
			allCharsInts[index] = scan5.nextInt();
			index++;
		}

		scan5.close();


		char[] upperL = new char[1000];
		char[] lowerL = new char[1000];
		char[] mixed = new char[1000];
		char[] mixedNums = new char[1000];
		char[] allChars = new char[1000];

		for (int i = 0; i < 1000; i ++)
		{
			upperL[i] = (char)upperInts[i];
		}

		for (int i = 0; i < 1000; i ++)
		{
			lowerL[i] = (char)lowerInts[i];
		}

		for (int i = 0; i < 1000; i ++)
		{
			mixed[i] = (char)mixedLetInts[i];
		}

		for (int i = 0; i < 1000; i ++)
		{
			mixedNums[i] = (char)mixedLetNumInts[i];
		}

		for (int i = 0; i < 1000; i ++)
		{
			allChars[i] = (char)allCharsInts[i];
		}

		System.out.println("Welcome to the Password Generator!\n");
		
		int go = 1;
		int selection = 0;
while (go != 0)
	{
		
		System.out.println("Please select the type of password you would like to generate!\n");
		System.out.println("1. Lowercase Letters\n2. Uppercase Letters\n3. Uppercase and Lowercase Letters\n4. Uppercase, Lowercase, and Numbers\n5. Uppercase, Lowercase, Numbers and Symbols\n0. Exit\n");

		System.out.println("Enter Selection by typing numbers 1,2,3,4,5 or 0 to exit\n");
		Scanner scan = new Scanner(System.in);
		selection = scan.nextInt();

		System.out.println();

			

		if (selection >= 0 && selection <= 5)
		{
				if (selection == 1)
				{
					File firstFilePW = new File ("Lowerpw.txt");
					PrintWriter firstPW = new PrintWriter(firstFilePW);
							for (int i = 1; i <= 1000; i++)
							{
								firstPW.print(lowerL[i-1]);
								if (i%8 == 0)
								{
									firstPW.print(" ");
								}
							}
								
						System.out.println("Successfully printed Lowercase Letter Passwords!\n");
						firstPW.close();
				}
				else if (selection == 2)
				{
					File secondFilePW = new File ("Upperpw.txt");
					PrintWriter secondPW = new PrintWriter(secondFilePW);
							for (int i = 1; i <= 1000; i++)
							{
								secondPW.print(upperL[i-1]);
								if (i%8 == 0)
								{
									secondPW.print(" ");
								}
							}
								
						System.out.println("Successfully printed Uppercase Letter Passwords!\n");
						secondPW.close();
				}
				else if (selection == 3)
				{
					File thirdFilePW = new File ("Mixedpw.txt");
					PrintWriter thirdPW = new PrintWriter(thirdFilePW);
							for (int i = 1; i <= 1000; i++)
							{
								thirdPW.print(mixed[i-1]);
								if (i%8 == 0)
								{
									thirdPW.print(" ");
								}
							}
								
						System.out.println("Successfully printed Uppercase and Lowercase Letter Passwords!\n");
						thirdPW.close();
				}
				else if (selection == 4)
				{
					File fourthFilePW = new File ("MixedNumpw.txt");
					PrintWriter fourthPW = new PrintWriter(fourthFilePW);
							for (int i = 1; i <= 1000; i++)
							{
								fourthPW.print(mixedNums[i-1]);
								if (i%8 == 0)
								{
									fourthPW.print(" ");
								}
							}
								
						System.out.println("Successfully printed Mixed Letters and Numbers passwords!\n");
						fourthPW.close();
				}
				else if (selection == 5)
				{
					File fifthFilePW = new File ("AllCharspw.txt");
					PrintWriter fifthPW = new PrintWriter(fifthFilePW);
							for (int i = 1; i <= 1000; i++)
							{
								fifthPW.print(allChars[i-1]);
								if (i%8 == 0)
								{
									fifthPW.print(" ");
								}
							}
								
						System.out.println("Successfully printed all character passwords!!\n");
						fifthPW.close();
				}
				else if (selection == 0)
				{
					System.out.print("Thank you for using Password Generator!");
					break;
				}

			}
		else
		{
			System.out.println("Not a Valid Selection, please try again\n");
		}

				System.out.println("Would you like to continue? (Select any number for 'yes', or 0 to exit)\n");
				go = scan.nextInt();

				if (go == 0)
				{
					System.out.println("\nThank you for using Password Generator!");
				}
				
			}


  }
}