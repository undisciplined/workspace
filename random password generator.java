package undisciplined ;

public class random_password_generator {

	public static void main(String[] args) {
		
		double minimo_caracter_imprimible_ascii = 32 , maximo_caracter_imprimible_ascii = 126 ;
		
		int caracteres_numericos ;
		
		int longitud_contraseña = 10000 ;
		
		String password = "" ;
		
		for (int i = 0; i < longitud_contraseña; i++) {
			
			caracteres_numericos = (int)(Math.random() * (maximo_caracter_imprimible_ascii - minimo_caracter_imprimible_ascii) + (minimo_caracter_imprimible_ascii)) ;
			
			char caracteres = (char)caracteres_numericos ;
			
			password = password + caracteres ;
			
			
		}
		
		System.out.println(password);
		
	}

}

