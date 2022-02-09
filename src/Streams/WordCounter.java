package Streams;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

	public static void main(String[] args) {
		String str ="vaibhav abc pqr pqr vaibhav";
		List<String> strList = Stream
				.of(str)
				.map(w -> w.split(" "))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList());
		Map<String, Integer> wordCounter = new HashMap<>();
		for(String word: strList) {
			if(wordCounter.containsKey(word)) {
				wordCounter.put(word,wordCounter.get(word)+1);
				
			}
			else {
				wordCounter.put(word,1);
			}
		}
		System.out.println(wordCounter);
		
	}

}
