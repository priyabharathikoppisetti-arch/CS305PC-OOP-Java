class Lab1P1{
	public static void main(String...args){
	        System.out.println("---------------BYTES-----------");
		byte b = 5;
		Byte bb = b;  //AutoBoxing
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(bb.SIZE);
		System.out.println(bb.TYPE);
		System.out.println(bb.BYTES);
		
		
		System.out.println("---------------SHORT-----------");
		
		short s= 5;
		Short ss = s;  //AutoBoxing
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(ss.SIZE);
		System.out.println(ss.TYPE);
		System.out.println(ss.BYTES);
		
		System.out.println("---------------INTEGERS-----------");
		
		int i = 5;
		Integer ii = i;  //AutoBoxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(ii.SIZE);
		System.out.println(ii.TYPE);
		System.out.println(ii.BYTES);
		
		System.out.println("---------------LONG-----------");
		
		long l = 5;
		Long ll = l;  //AutoBoxing
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(ll.MIN_VALUE);
		System.out.println(ll.SIZE);
		System.out.println(ll.TYPE);
		System.out.println(ll.BYTES);
		
		System.out.println("---------------DOUBLE-----------");
		
		double d = 5;
		Double dd = d;  //AutoBoxing
		
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(dd.SIZE);
		System.out.println(dd.TYPE);
		System.out.println(Double.BYTES);
		
		System.out.println("---------------FLOAT-----------");
		
		float f = 5;
		Float ff = f;  //AutoBoxing
		
		System.out.println(ff.MAX_VALUE);
		System.out.println(ff.MIN_VALUE);
		System.out.println(ff.SIZE);
		System.out.println(ff.TYPE);
		System.out.println(Float.BYTES);
		
		System.out.println("---------------BOOLEAN-----------");
		boolean x = true;
		Boolean xx = x;
		//System.out.println(xx.MAX_VALUE);
		//System.out.println(xx.MIN_VALUE);
		//System.out.println(xx.SIZE);
		System.out.println(xx.TYPE);
		//System.out.println(xx.BYTES);
		 

		
	}
}
