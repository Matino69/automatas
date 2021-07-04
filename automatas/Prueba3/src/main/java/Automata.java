
public class Automata {
	int c;
	char [] palabre;
	boolean aceptado;
	
	
	public static  void main( String[] args) {
		Automata bb = new Automata();
		String cadena = "aaaabaababaa";
		bb.palabre = cadena.toCharArray();
		bb.inicio();
	}
	
	public void inicio() {
		c=0;
		aceptado=false;
		q0();
		
	}
	public void q0() {
		System.out.println("q0");
		if (c<palabre.length) {
			if (palabre[c]=='a') {
				c++;
				q0();
			}
			else if (palabre[c]=='b') {
				c++;
				q1();
			}
		}
	}
	public void q1() {
		System.out.println("q1");
		if (c<palabre.length) {
			if (palabre[c]=='a') {
				c++;
				q1();
			}
			else if (palabre[c]=='b') {
				c++;
				q2();
			}
		}
	}
	public void q2() {
		System.out.println("q2");
		if (c<palabre.length) {
			if (palabre[c]=='a') {
				c++;
				q2();
			}
			else if (palabre[c]=='b') {
				c++;
				q3();
			}
		}
	}
	public void q3() {
		System.out.println("q3");
		aceptado=true;
		if (c<palabre.length) {
			if (palabre[c]=='a') {
				c++;
				q3();
			}
			else if (palabre[c]=='b') {
				c++;
				qError();
			}
		}
	}
	public void qError() {
		System.out.println("Error");
		aceptado=false;
		return;
	}
		

}
