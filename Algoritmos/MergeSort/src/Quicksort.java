public class Quicksort {
	
	public static void quickSort(int[] enteros){
	
		rec_QuickSort(enteros, 0, enteros.length-1);
	}

	
	private static void rec_QuickSort(int[] enteros, int min, int max) {
		//System.out.println( "QuickSort "+"min:"+min+ " max:"+ max);
		int piv= min;
		int rmin=min;
		int rmax=max;
		
		
		
		
			
			if(min >= max)
				return;
			
			if(min != max){	
				
				while(min != max){
					
				
					while((enteros[max] >= enteros[piv]) && (min < max))
						max--;
									
						while((enteros[min] < enteros[piv]) && (min < max))
							min++;
					
						
					if(max != min){
							
						int swap= enteros[max];
						enteros[max]= enteros[min];
						enteros[min]= swap;
							
						}
						
					if (min == max){
						rec_QuickSort(enteros, rmin, min-1);
						rec_QuickSort(enteros, min+1, rmax);
							
					}
				}
			}
					else
							return;
						
	
	}
				
	
	private static void ImprimeArreglo(int[] enteros){
		for(int i=0; i< enteros.length;i++){
			System.out.print(enteros[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] entero= {15,5,20, 1, 8,20,25,30,4,0};
		
		ImprimeArreglo(entero);
		System.out.println(" ");
		quickSort(entero);
		System.out.println(" ");
		ImprimeArreglo(entero);
		
	}

}
