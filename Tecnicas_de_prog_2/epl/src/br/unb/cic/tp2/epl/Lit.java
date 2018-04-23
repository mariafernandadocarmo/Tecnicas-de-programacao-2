package br.unb.cic.tp2.epl;

/**
 * The most simple type of expression... just an 
 * int literal! 
 * 
 * @author rbonifacio
 */
public class Lit implements Exp {
	private Integer value;
	
	public Lit(Integer value) {
		this.value = value; 
	}
	
	public int eval() {
		return value;
	}
	
	public String print() {
		return value.toString();
	}
}