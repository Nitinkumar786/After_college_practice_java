package javaprogram;

public class wrapper {

	public static void main(String[] args) {
		Integer i1=100; 
		Integer a=200;
		Integer c= i1+a;
		System.out.println(c);
		//byte-1,short-2,int-4,long-8,float-4,double-8,char-2,boolean-1 bit
		//Byte,Short,Integer,Long,Float,Double,Character,Boolean
		Integer i2=100;
		Integer i3=500;
		Integer i4=new Integer(100);
		Integer i5=new Integer(100);
		System.out.println("i1 = "+i1 +" , memory address: "+System.identityHashCode(i1));
		System.out.println("i2 = "+i2 +" , memory address: "+System.identityHashCode(i2));
	    System.out.println("i3 = "+i3 +" , memory address: "+System.identityHashCode(i3));
        System.out.println("i4 = "+i4 +" , memory address: "+System.identityHashCode(i4));
        System.out.println("i5 = "+i5 +" , memory address: "+System.identityHashCode(i5));
        System.out.println("(i1==i2)  : "+(i1==i2));
        System.out.println("(i1==i4)  : "+(i1==i4));
        
        System.out.println("i1.equals(i2) : "+(i1.equals(i2)));
        System.out.println("i1.equals(i4) : "+(i1.equals(i4)));
        
        int x=1000;
        i1=x;
        System.out.println("i1 : "+i1);
        
        i1=19999;
        x = i1;
        System.out.println(" x = " + x);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        Float f=10000.00f;
    
        String s="990900";
        Integer j=Integer.parseInt(s);
        //all wrapper class except character will have this method
        //wrapper.parseWrapper(stringobject)
        
        System.out.println("j = "+j);
        
        j=98989;
        //s=j.toString();//wrapper into string
        s=j+"";
        System.out.println(s);
        
        
        Float f1=i1.floatValue();
        Double d12=i1.doubleValue();
        
        Double d=20000.00d;
        Integer i7=5;
        //Integer i6=d.IntValue(); wrong syntax
        System.out.println("f = "+f);
        System.out.println("i7.compareTo(5) = "+ i7.compareTo(5));
        System.out.println("i7.compareTo(2) = "+ i7.compareTo(2));
        
        String s1="100";
        Float f12=Float.parseFloat(s1);  //syntax for converting one wrappers into another
        System.out.println(f12);
        Integer i12=Integer.parseInt(s1);//convert string into wrapper(all)
        System.out.println(i12);
        
       
        //1).task convert all wrappers into string
        //2).convert one wrapper to another float<-> integer
        //3).convert string into wrappers
        
        
        
	}

}

