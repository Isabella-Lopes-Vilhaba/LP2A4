package calculo;

public class Soma {
	
	private Long num1;
	private Long num2;
	private Long result;
	
	public Long getNum1() {
		return num1;
	}
	
	public void setNum1(Long num1) {
		this.num1 = num1;
	}
	
	public Long getNum2() {
		return num2;
	}
	
	public void setNum2(Long num2) {
		this.num2 = num2;
	}
	
	public Long getResult() {
		result = this.num1 + this.num2;
		return result;
	}
	
}
