package csd;

public class InnermostParrenthesis {

	public static void main(String[] args) {
		TestParenthesis.run();
	}

}
class TestParenthesis {
	public static void run()
	{
		UtilParenthesis.getSentenceIn("Bur örnek { aslýnda {hi{ç zo}r}} deðil.");
	}
}
class UtilParenthesis {
	public static int leftParenthesis(String s)
	{
		int i, indexBegin = 0;
		int len = s.length();
		for(i = 0; i < len && s.charAt(i) != '}'; ++i)
		{
			if(s.charAt(i) == '{')
				indexBegin = i;
			;
		}
			return indexBegin;
	}
	public static int rightParenthesis(String s)
	{
		int i, indexLast = 0;
		int len = s.length();
		//döngü gereksiz dönmesin diye ikinci koþul olarak != '{' bunu ekledim.
		//Parantezlerin index numaralarýný tuttum.
		for(i = len - 1 ; i >= 0 && s.charAt(i) != '{'; --i)
		{
			if(s.charAt(i) == '}')
				indexLast = i;
			;
		}
			return indexLast;
	}
	public static void getSentenceIn(String s)
	{
		int begin = leftParenthesis(s);
		int last = rightParenthesis(s);
		System.out.println(s.substring(begin + 1, last));
	}
}