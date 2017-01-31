class Max {
	public static void main (String [] arg){
		int max = 0;
		int numb1 =100;
		int numb2 =129;
		int numb3 =132;

		max = numb1 >= max ? numb1 : max;
		max = numb2 >= max ? numb2 : max;	
		max = numb3 >= max ? numb3 : max;

		System.out.println("nilai max "+ max );



	}


}