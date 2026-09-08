package string_Programs;

public class reverse_particular_word {

	public static void main(String[] args) {

		        String s = "I am Om and Good Student also";
		        String[] a = s.split(" ");
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < a.length; i++) {
	
		            if (a[i].equals("and")) {
		            	StringBuilder sb1 =new StringBuilder(a[i]);
		                result.append(sb1.reverse());
		            } else {
		                result.append(a[i]);
		            }
		            result.append(" ");
		        }
		        System.out.println(result.toString().trim());
		    
		

	}

}
