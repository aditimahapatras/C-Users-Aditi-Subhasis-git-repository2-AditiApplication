package com.studyopedia;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
	int[] array = {1,1,2,2,3,4,5,5,6,6};
	List<Integer> var= findNonRepeatedElements(array);
}
public static List<Integer> findNonRepeatedElements(int [] array){
Map<Integer, Integer> countMap = new HashMap<>(); 
for (int num : array) { 
countMap.put(num, countMap.getOrDefault(num, 0) + 1); 
} 
List<Integer>nonRepeatedElements = new ArrayList<>();
for (Map.Entry<Integer, Integer> entry : 
countMap.entrySet()) { 
if (entry.getValue() == 1) { 
nonRepeatedElements.add(entry.getKey()); 
} 
} 
return nonRepeatedElements; 
}
}

