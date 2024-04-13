class frequencyOFchar 
{
	public static String remDuplicate(String str)
	{
		String res="";
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (!(res.contains(ch+"")))
			{
				res=res+ch;
			}
		}
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args) 
	{
		String str1="aabbbaaabcccbb";
		String result=remDuplicate(str1);
		System.out.println(result);
		int count2=str1.length();
		String min="";
		String max="";
		int count3=0;
		for (int i=0;i<result.length() ;i++ )
		{
			int count=0;
			char ch=result.charAt(i);
			for (int j=0;j<str1.length() ;j++ )
			{
				char ch1=str1.charAt(j);
				if (ch==ch1)
				{
					count++;
				}
			}
			System.out.println("The frequency of the character "+ch+" is :"+count);
			if (count<count2)
			{
				count2=count;
				min=ch+"";
			}
			if (count>count3)
			{
				count3=count;
				max=ch+"";
			}
		}
		System.out.println("Min occurence character is :"+min);
		System.out.println("Max occurence character is :"+max);
	}
}
