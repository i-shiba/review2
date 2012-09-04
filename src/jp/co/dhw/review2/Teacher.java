package jp.co.dhw.review2;

public class Teacher extends User{
	public String subject = null;
	public Teacher(Integer id, String firstName, String lastName, String subject){
		super(id,firstName,lastName);
		this.subject   = subject;
	}
	public String getSubject(){
		return this.subject;
	}
	public void showSubject(){
		System.out.println("教師" + this.subject);
	}
//showメソッドのオーバーライド
	public	void	show(){
		super.show();
		showSubject();
	}

}
