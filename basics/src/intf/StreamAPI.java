package intf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		// Stream : on demand data structure
		// one time use data structure
		// lazy operations + joint operations 
		// nothing is executed till terminal operations
		List<Integer> list = new ArrayList<>(); //control + shift + O, control + 1
		list.add(34); list.add(64); list.add(40); list.add(34); list.add(83);
		list.add(33); list.add(876);
//		 find the max element of the list
		Integer max = Collections.max(list); System.out.println(max);
		Stream<Integer> stream = list.stream();
		Optional<Integer> max2 = stream.max((a,b)-> a-b );
		System.out.println(max2.get());
		
		Optional<Integer> min = list.stream().min((a,b)-> a-b);
		System.out.println(min.get());
			
		
//		 check whether all the numbers are divisible by 2 or not (returns boolean)
		boolean flag = true;
		for(int x : list)
		{
			if(x % 2 == 0)
				;
			else { flag = false ; break; }
		}
		System.out.println("all even " + flag);
		boolean allMatch = list.stream().allMatch(t -> t %2 == 0);
		System.out.println(allMatch);
		//check whether all stuents have passed or not (passing marks 40)
		boolean allpassed = list.stream().allMatch(t -> t >= 40);
		System.out.println(allpassed);
		list.stream().allMatch(t -> { if(t >= 40 ) return true; else return false;});
		
//		 check is there any number divisible by 5 or not (returns boolean)
		flag = false;
		for(int x : list)
		{
			if(x % 5 == 0)
			{
				flag = true; break;
			}
		}
		System.out.println("any one divisible by 5 :  " + flag);
		boolean anyMatch = list.stream().anyMatch(t -> t%5 == 0);
		System.out.println(anyMatch);
		
//		 create a new list of all the elements less than 50
		List<Integer> newList = new ArrayList<>();
		for (int x : list)
		{
			if(x < 50) newList.add(x);
		}
		System.out.println(newList);
		List<Integer> collect = list.stream().filter(t -> t<50).collect(Collectors.toList());
		System.out.println(collect);
		
//		find the max marks out of failed students (passing maks = 50)
		Optional<Integer> max3 = list.stream().filter(t -> t < 50).max((a,b) -> a-b);
		System.out.println(max3.get());
		
		
//		remove all the elements less than 50
		list.removeIf(x -> x < 50);
		
		
	}

}










