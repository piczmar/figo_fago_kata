package org.ff;

import java.util.ArrayList;
import java.util.List;

public class Arabic2Roman {

	public String transform(int i) {
		String res = "";

		List<Symbol> symbols = new ArrayList<Symbol>();
		symbols.add(new Symbol(40, "XL"));
		symbols.add(new Symbol(10, "X"));
		symbols.add(new Symbol(9, "IX"));
		symbols.add(new Symbol(5, "V"));
		symbols.add(new Symbol(4, "IV"));
		symbols.add(new Symbol(1, "I"));

		int zz = 0;
		while(zz < symbols.size()){
			if( i >= symbols.get(zz).arabic){
				i -= symbols.get(zz).arabic;
				res += symbols.get(zz).roman;
			}
			else if(i < symbols.get(zz).arabic){
				zz++;
			}
		}

		return res;

	}

	public class Symbol{
		public int arabic;
		public String roman;

		public Symbol(int arabic, String roman) {
			this.arabic = arabic;
			this.roman = roman;
		}
	}

}
