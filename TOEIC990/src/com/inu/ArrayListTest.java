package com.inu;

import java.util.*;

public class ArrayListTest
{
	
	public static void main(String[] args)
	{
		ArrayList<String> newFriendsList = new ArrayList<>();
		
		newFriendsList.add("Sammy");
		newFriendsList.add("Juile");
		
		for (int i = 0; i < newFriendsList.size(); i++)
		{
			System.out.println(newFriendsList.get(i));
		}
	}

}
