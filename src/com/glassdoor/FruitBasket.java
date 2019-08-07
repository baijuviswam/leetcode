package com.glassdoor;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket {

	static Map<String, Integer> fruitMap = new HashMap<String, Integer>();

	public FruitBasket() {
		fruitMap.put("Apple", 1);
		fruitMap.put("Orange", 6);
		fruitMap.put("Banana", 3);
		fruitMap.put("Cherry", 2);
		fruitMap.put("Pinaple", 4);
		fruitMap.put("WMelon", 5);
		fruitMap.put("Plum", 2);
		fruitMap.put("Grape", 10);
	}

	public static void main(String[] args) {
		FruitBasket fb = new FruitBasket();
		int amount = 1000000;
		System.out.println(fb.getFruitBasket(amount));
		
		/*
		int total = 0;
		System.out.println("-------------------------------");
		System.out.println("         Bill of Sale          ");
		System.out.println("-------------------------------");

		for (Entry<String, Integer> map : fb.getFruitBasket(amount).entrySet()) {
			int quantity = map.getValue();
			int itemValue = fruitMap.get(map.getKey());
			int price = quantity * itemValue;
			System.out.println(map.getKey() + "    " + quantity + " X $" + itemValue + "=" + price);
			total = total + price;
		}
		System.out.println("-------------------------------");
		System.out.println("          Total" + " $" + total);
		System.out.println("-------------------------------");
		*/

	}

	public Map<String, Integer> getFruitBasket(int amount) {
		Map<String, Integer> fruitBas = new HashMap<String, Integer>();
		int netbal = 0;
		while (netbal != amount) {
			for (String fruit : fruitMap.keySet()) {
				int value = fruitMap.get(fruit);
				if (value <= (amount - netbal)) {
					netbal = netbal + value;
					if (!fruitBas.containsKey(fruit))
						fruitBas.put(fruit, 1);
					else {
						fruitBas.put(fruit, fruitBas.get(fruit) + 1);
					}
				} else {
					continue;
				}
			}
		}
		return fruitBas;
	}
}
