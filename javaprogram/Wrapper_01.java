package javaprogram;

public class Wrapper_01 {
		//byte-1,short-2,int-4,long-8,float-4,double-8,char-2,boolean-1 bit
				//Byte,Short,Integer,Long,Float,Double,Character,Boolean


	              //1).task convert all wrappers into string
	        //2).convert one wrapper to another float<-> integer
	        //3).convert string into wrappers
	        
		public static void main(String[] args)
	     {
		    String i1 = "100";
		     Byte x = Byte.parseByte(i1); 
		      System.out.println("x = "+"Byte " +x);

	         Short  c = Short.parseShort(i1);
	          System.out.println("c = "+"Short " +c);

	           Integer q = Integer.parseInt(i1);
	           System.out.println("q = "+"Intager "+q);

	           Long cb = Long.parseLong(i1);
	           System.out.println("cb = "+"Long " +cb);

	           Float n = Float.parseFloat(i1);
	           System.out.println("n ="+"Float " +n);

	           Double nm = Double.parseDouble(i1);
	           System.out.println("nm = "+"Double "+nm);

	           String i1qString = new String("112");
	           System.out.println("i1qString = "+"String " +i1qString);

	           Boolean bg = Boolean.parseBoolean(i1qString);
	           System.out.println("bg = "+"Boolean " +bg);
	           System.out.println("------------------------");


		}
		
	}