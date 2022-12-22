package com.repsonsibility.single;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class WordChanger {
	private String word;

	public void addWord(String word) {
		this.word = this.word.concat(word);
	}

	public void replaceFirstWord(String word, String anotherWord) {
		if (this.word.indexOf(word) > -1) {
			this.word = this.word.replace(word, anotherWord);
		}
	}

	public void deleteFirstWord(String word) {
		if (this.word.indexOf(word) > -1) {
			this.word = this.word.replace(word, "");
		}
	}
}
