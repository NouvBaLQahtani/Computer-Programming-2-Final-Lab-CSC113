package FinalLab;

public class InvalidUniversity extends RuntimeException {
	public InvalidUniversity() {
		super("InvalidUniversity") ; 
		
		
	} 
	public InvalidUniversity(String str ) {
		super(str) ; 
	} 
}
