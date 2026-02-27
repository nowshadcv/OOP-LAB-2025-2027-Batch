package OOPLAB;
public class StrManipulation
{
	public static void main(String[] args) {
		char arrSample[]= {'R','O','S','E'};
		String strSample1=new String(arrSample);
		System.out.println(strSample1+"\t");
		System.out.println("length of " + strSample1 + " is:"+ strSample1.length());
		byte ascii[]= {65,66,67,68,69,70};
		String strSample2=new String(ascii);
		System.out.println(strSample2+"\t");
		String strSample3=strSample1.concat(strSample2);
		System.out.println(strSample3+"\t");
		String strSample4=strSample1+strSample2;
		System.out.println(strSample4+"\t");
		System.out.println("3rd char of " +strSample4+" is "+strSample4.charAt(2));
		char buf[]=new char[3];
		strSample4.getChars(2, 5, buf, 0);
		System.out.println("Extracted chars:"+strSample4+""+new String(buf));
		String strSample="RockStar";
		System.out.println(strSample.compareTo("ROCKSTAR")+"\t");
		System.out.println(strSample.compareToIgnoreCase("ROCKSTAR")+"\t");
		System.out.println(strSample.equals("ROCKSTAR")+"\t");
		System.out.println(strSample.equalsIgnoreCase("ROCKSTAR")+"\t");
		System.out.println("Rockstar starts with 'RO' :"+strSample.startsWith("Ro"));
		System.out.println("Rockstar ends with 'star' :"+strSample.endsWith("Star"));
		System.out.println("Rockstar contains 'tar' :"+strSample.contains("tar"));
		System.out.println("Index of 't'  :"+strSample.indexOf("t"));
		System.out.println("Index of 'star'  :"+strSample.indexOf("Star"));
		System.out.println("All caps-Rockstar:"+strSample.toUpperCase());
		System.out.println("All small-Rockstar:"+strSample.toLowerCase());
		System.out.println("Replace star with et:"+strSample.replace("Star","et"));
		String dval="3.456";
		String ival="6";
		System.out.println("Double value of dval is:"+Double.valueOf(dval));
		System.out.println("Integer value of ival is :"+Integer.valueOf(ival));
		double a=Double.valueOf(dval);
		int b=Integer.valueOf(ival);
		System.out.println(a+b);}}
		
		
		
		
		

	
