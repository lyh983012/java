package problem2;

import java.util.HashMap;

public class StringEncryptor {

	StringBuffer encoded;
	StringBuffer decoded;
	
	static public void main(String args[]) {
	HashMap<Character, Character> kv= new HashMap<Character, Character>();	
	kv.put('a', 'v');
	kv.put('b', 'e');
	kv.put('c', 'k');
	kv.put('d', 'n');
	kv.put('e', 'o');
	kv.put('f', 'h');
	kv.put('g', 'z');
	kv.put('h', 'f');
	kv.put('i', '_');
	kv.put('j', 'i');
	kv.put('k', 'l');
	kv.put('l', 'j');
	kv.put('m', 'x');
	kv.put('n', 'd');
	kv.put('o', 'm');
	kv.put('p', 'y');
	kv.put('q', 'g');
	kv.put('r', 'b');
	kv.put('s', 'r');
	kv.put('t', 'c');
	kv.put('u', 's');
	kv.put('v', 'w');
	kv.put('w', 'q');
	kv.put('x', 'u');
	kv.put('y', 'p');
	kv.put('z', 't');
	kv.put('_', 'a');
	StringEncryptor r= new StringEncryptor();
	r.encode("we_will_break_the_prison_at_dawn",kv);
	r.decode(r.encoded.toString(),kv);
	}
	
	public void encode(String input,HashMap kv) {
		StringBuffer unencoded;
		StringBuffer encoded;
		unencoded=new StringBuffer(input);
		encoded=new StringBuffer(unencoded.length());
		for(int i=0;i<=unencoded.length()-1;i++) {
			if(('a'<=unencoded.charAt(i) && unencoded.charAt(i)<='z')|| unencoded.charAt(i)=='_'){
				encoded.insert(i, kv.get(unencoded.charAt(i)));
			}else {
				System.out.println("a character in index="+i+"is in wrong format");
			}
		}
		System.out.println(encoded);
		this.encoded=new StringBuffer(encoded);
	}
	
	public void decode(String input,HashMap kv) {
		StringBuffer encoded;
		StringBuffer decoded;
		encoded=new StringBuffer(input);
		decoded=new StringBuffer(encoded.length());
		for(int i=0;i<=encoded.length()-1;i++) {
			for(int j=0;j<=25;j++) {
				if(encoded.charAt(i)==(char)kv.get(new Character((char) ('a'+j)))) {
					decoded.append((char)('a'+j));
					break;
				}else if(encoded.charAt(i)==(char)kv.get(new Character((char) ('_')))) {
					decoded.append('_');
					break;
				}
			}
		}
		System.out.println(decoded.toString());
		this.decoded=new StringBuffer(decoded);
	}
}
/*
使用 HashMap 类重新实现实验四的字符串加密问题，不再使用 switch 或者 if-else 的方法实
21
现，使用 HashMap 来保存密码字典。原题如下:实现 encode, decode 方法给字符串加密。打 印输出原始字符串，加密后的字符串和解密后的字符串。测试字符串”We will break out of prison at dawn”。
按照下表对字符串进行替换加密。包括大小写字母。„_‟代表空格。
abcdefgh ijklmnopqrstuvwxyz„_‟ v e k n o h z f „_‟ i l j x d m y g b r c s w q u p t a
*/