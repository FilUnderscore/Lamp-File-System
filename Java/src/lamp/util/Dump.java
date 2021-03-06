package lamp.util;

import javax.xml.bind.DatatypeConverter;

/**
 * 
 * @author Filip Jerkovic
 */
public final class Dump 
{
	/**
	 * 
	 * @param data
	 * @return
	 */
	public static String printHex(byte[] data)
	{
		String str = DatatypeConverter.printHexBinary(data);
		
		StringBuilder res = new StringBuilder();
		
		for(int i = 1; i <= str.length(); i++)
		{
			res.append(str.charAt((i - 1)));
			
			if(i % 2 == 0)
			{
				res.append(" ");
			}
		}
		
		return res.toString();
	}
}