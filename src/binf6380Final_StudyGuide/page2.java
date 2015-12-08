package binf6380Final_StudyGuide;

import java.util.Map;
import java.util.TreeMap;

//fixed code
public class page2 
{
	public static void main(String[] args) throws Exception
	{
		String s = "Here is a string";
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for( char c : s.toCharArray() )
		{
			int val = 0;
			if( map.get(c) != null )
			{
				val = map.get(c);
				val++;
			}
			else
			{
				val = 1;
			}
			map.put(c, val);
		}
	
		for( Character c : map.keySet() )
		{
			System.out.println(c + " " + map.get(c));
		}
		
		
	}
}
