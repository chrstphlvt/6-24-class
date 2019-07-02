package com.revature.driver;

import com.revature.prompts.Prompt;

public class ProblemsDriver {
	public static void main(String[] args) {
		Prompt currentPrompt = null;
		while(true) {
			currentPrompt = currentPrompt.run();
		}
	}
}
