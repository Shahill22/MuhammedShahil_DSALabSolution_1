package com.learning.main;

import com.learning.logic.BalancingBracket;

public class DriverClass {

	public static void main(String[] args) {
		String bracketExp= "(([]))";
		boolean result;
		BalancingBracket b = new BalancingBracket();
		result = b.balanceBracketCheck(bracketExp);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered String has Unbalanced Brackets");
		}
	}
}
