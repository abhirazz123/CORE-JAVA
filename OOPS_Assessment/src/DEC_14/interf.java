package DEC_14;

  interface interf {
	  public void m1();

}
  class test2{
	  int x = 10;
	  public void m2() {
		  int y = 20;
		  interf  i = ()->{
			  System.out.println(x);
			  System.out.println(y);
		  };
		  i.m1();
	  }
	  public static void main(String[] args) {
		test2 t = new test2();
		t.m2();
	}
  }
