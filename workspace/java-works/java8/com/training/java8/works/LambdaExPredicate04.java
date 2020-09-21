package com.training.java8.works;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExPredicate04 {
	public static void main(String[] args) {
		List<Account> accountList = Arrays.asList(

				new Account(101, "Harry", 3434, "male"), new Account(55, "Chandan", 2233, "male"),
				new Account(45, "SaiTeja", 1234, "male"), new Account(77, "Dada", 4321, "male"),
				new Account(50, "Isika", 3434, "female"), new Account(60, "Pranavika", 3434, "female"),
				new Account(10, "Shashank", 6655, "male"), new Account(89, "Shruth", 7676, "male"), 
				
				new Account(200, "Kanchan", 8000, "female")
				);

		List<Account> onlyMaleList = AccountPredicate.filterAccounts(accountList, AccountPredicate.onlyMale());

		onlyMaleList.forEach(System.out :: println);
		
		System.out.println("--------- min 4000---------");
		List<Account> onBalanceCheck = AccountPredicate.filterAccounts(accountList, AccountPredicate.onBalaceCheck(4000)); 
		onBalanceCheck.forEach(System.out ::println);
		
		// chain the predicates 
		System.out.println("-------- only male and balance more than 4000-------------");
		
		Predicate<Account> maleAndBalanceCheck =
					AccountPredicate.onlyMale().and(AccountPredicate.onBalaceCheck(4000));
		
		List<Account> maleAndBalanceList = AccountPredicate.filterAccounts(accountList, maleAndBalanceCheck); 
		
		maleAndBalanceList.forEach(System.out :: println);
		// only females from negate of males 
		System.out.println("------------ only female-------------");
		
		Predicate<Account> onlyFemalesPredicate = AccountPredicate.onlyMale().negate(); 
 
		List<Account> onlyFemalesList = AccountPredicate.filterAccounts(accountList, onlyFemalesPredicate); 
		onlyFemalesList.forEach(System.out :: println);

		// show sorted list 
		System.out.println("---- acounts sorted in descending order of balance ---------");
		accountList.sort(Comparator.comparing(Account:: getBalance).reversed());
		accountList.forEach(System.out :: println);

		
		// another way 
		System.out.println("---- acounts sorted in ascending order of balance(another way ) ---------");
		accountList.sort(Comparator.comparing(acc -> acc.getBalance())); 
		accountList.forEach(System.out ::println);
	
		// sex and balance (ascending) 
		Comparator<Account>  orderBySexAndBalance = 
				Comparator.comparing(Account :: getSex)
						.thenComparing(Account:: getBalance); 
		
		System.out.println("************* sorted by sex and balance (ascending) **************");
		accountList.sort(orderBySexAndBalance); 
		
		accountList.forEach(System.out :: println);
		

	}

	
	
	
	
	
	
	
	
	static class AccountPredicate {
		public static Predicate<Account> onlyMale() {
			return p -> p.getSex().equals("male");
		}

		public static Predicate<Account> onBalaceCheck(double balance) {
			return p -> p.getBalance() > balance;
		}

		public static List<Account> filterAccounts(List<Account> accounts, Predicate<Account> predicate) {
			return accounts.stream().filter(predicate).collect(Collectors.toList());
		}

	}

}








