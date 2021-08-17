class arraycopy {
	public static void main(String[] args) {
		 int arr1[] = new int[]{1,2,3};
         int arr2[] = new int[]{4,5,6};

         System.arraycopy(arr1, 1, arr2, 1, 2);

         for(int i=0; i<arr2.length; i++){
         System.out.println(arr2[i]);
        }
    }
}
