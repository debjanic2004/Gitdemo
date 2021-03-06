package sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void BubbleSort() {
		int n[] = { 11, -8, 20, -22, 18, -14, -28 };
		for (int i = 0; i < n.length; i++) {
			int temp = 0;
			boolean swp = false;
			for (int j = 0; j < n.length - i - 1; j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
					swp = true;
				}
			}
			if (swp = false)
				break;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	@Test
	public void uniqueNumbersList() {
		List<Integer>lst=Arrays.asList(2,4,8,1,2,1,8,5,10,10);
		System.out.println(lst.stream().distinct().sorted().collect(Collectors.toList()));
	}
	
	@Test
	public void isPalindrime() {
		String str="madam";
		boolean chck=false;
		int i=0;int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				
				break;
			}
			chck=true;
			i++;
			j--;
		}
		if(chck) System.out.println("It's Palindrome");
		else System.out.println("It's not Palindrome");
		
	}
	@ Test
	public void countNumbersOfLetters() {
		int ct=0;
		String str=" hello    welcome   ";
		for(int i=0;i<str.length();i++) {
			if(((str.charAt(0)==' ' ||str.charAt(0)!=' ') && str.charAt(i)!=' ')||(str.charAt(i)!=' ' && str.charAt(i-1)==' ')) {
				ct++;
			}
		}
		System.out.println("The number of letters in the string :::: "+ct);
	}
	@Test
	public void removeJunkCharacters() {
		String str="abj%^i5612wey#@";
		System.out.println(str.replaceAll("[^1-9,a-z,A-Z]",""));
		
	}
	@Test
	public void printPatten() {
		int ct=0;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				ct++;
				System.out.print(ct+" ");
			}
			System.out.println("\n");
		}
		
	}
	@Test
	public void printPrimeNumbers() {
		for(int i=2;i<=100;i++) {
			int ct=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					ct++;
				}
			}
			if(ct==2) {
				System.out.print(i+"  ");
			}
		}
		System.out.println("\n");
	}
	
	

}
