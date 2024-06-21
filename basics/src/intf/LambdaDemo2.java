package intf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo2 {
	public static void main(String[] args) {
		List<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(10000, 12, "sbin0001234"));
		list.add(new BankAccount(5000,12 , "sbin0001234"));
		list.add(new BankAccount(210000, 13, "sbin0001235"));
		list.add(new BankAccount(656521,13 , "sbin0001235"));
		list.add(new BankAccount(8000,14 , "sbin0001234"));
		list.add(new BankAccount(52000,15 , "sbin0001234"));
		list.add(new BankAccount(60000, 16, "sbin0001234"));
		list.add(new BankAccount(18000,17 , "sbin0001234"));
		
		Consumer<BankAccount> consumer = new Consumer<BankAccount>() {
			@Override
			public void accept(BankAccount t) {
				System.out.println(t.getAcno() + ":" + t.getBalance());
			}};
		list.forEach(consumer);
		list.forEach(t -> System.out.println(t.getAcno() + ":" + t.getBalance()) );
		Predicate<BankAccount> predicate = new Predicate<BankAccount>() {
			@Override
			public boolean test(BankAccount t) {
				if(t.getBalance()<10000) return true;
				return false;
			} }; 
		list.removeIf(predicate);
		list.removeIf(t -> t.getBalance()<10000); 
		
		list.forEach(t -> System.out.println(t.getAcno() + ":" + t.getBalance()) );
		
		// remove all accounts that are not from ifsc sbin00001234 
		// keep only the accounts of ifsc sbin0001234
		list.removeIf(t -> ! t.getIfsc().equalsIgnoreCase("sbin0001234"));
		System.out.println();
		
		list.forEach(System.out::println);
		
		list.sort( (a, b) -> { 
			if(a.getCustid() < b.getCustid()) return -1;
			else if(a.getCustid() > b.getCustid()) return 1;
			return 0;
		}); //sort using custid
		
		list.forEach(t -> System.out.println(t.getCustid() + ":" + t.getBalance()));
//		list.sort();//sort using balance 
		list.sort((a,b) -> { if (a.getBalance() < b.getBalance()) return -1;
		else if(a.getBalance() > b.getBalance()) return 1;
		return 0;
		});
		list.forEach(t -> System.out.println(t.getCustid() + ":" + t.getBalance()));
		
		
	}

}














