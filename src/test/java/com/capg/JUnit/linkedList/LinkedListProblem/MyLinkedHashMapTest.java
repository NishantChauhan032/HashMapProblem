package com.capg.JUnit.linkedList.LinkedListProblem;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_whenWordsAreAddedToList_shouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  myLinkedHashMap.get(word);
			if(value == null)
				value = 1;
			else 
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}
	@Test
	public void givenASentence_whenEnteredAWord_shouldRemoveThatWordFromTheHashTable() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value =  myLinkedHashMap.get(word);
			if(value == null)
				value = 1;
			else 
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		String remove = myLinkedHashMap.remove("avoidable");
		System.out.println(myLinkedHashMap);		
		Assert.assertEquals("avoidable", remove);
	}
}
