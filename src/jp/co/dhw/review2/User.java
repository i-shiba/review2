package jp.co.dhw.review2;

public class User{
	public	Integer	id			=	null;
	public	String	firstName	=	null;
	public	String	lastName	=	null;

	public	User(Integer	id,	String	firstName,	String	lastName){
		this.id			=	id;
		this.firstName	=	firstName;
		this.lastName	=	lastName;
	}
	public	void	showId(){
		System.out.println(this.id);
	}
	public	void	showName(){
		System.out.println(this.firstName + ":" + this.lastName);
	}
	public	void	show(){
		System.out.println("ID --> " + this.id);
		System.out.println("氏名--> " + this.firstName + this.lastName);
	}

/* 縺薙％縺九ｉ蜈医��斐〒縺ｮ蝗樒ｭ斐〒縺吶�
*/
	public	static	void	main(String	args[]){
		User	user01	=	new	User(1,"武田","憲隆");
		User	user02	=	new	User(2,"高木","香");
		User	user03	=	new	User(3,"柴田","伊織");
		User	user04	=	new	User(4,"長尾","有希子");
		User	user05	=	new	User(5,"酒見","真悟");
		User	user06	=	new	User(6,"武末","憲和");
		User	user07	=	new	User(7,"國崎","宏治");
		User	user08	=	new	User(8,"割鞘","洋介");
		User	user09	=	new	User(9,"榎枝","大悟");
		User	user10	=	new	User(10,"今田","尭");
		user01.show();
		user02.show();
		user03.show();
		user04.show();
		user05.show();
		user06.show();
		user07.show();
		user08.show();
		user09.show();
		user10.show();
		
//コードを圧縮するには？→配列を使いましょう！
/*
		User[] users = new User[10];
		users[0] = user01;
		users[1] = user02;
		users[2] = user03;
		users[3] = user04;
		users[4] = user05;
		users[5] = user06;
		users[6] = user07;
		users[7] = user08;
		users[8] = user09;
		users[9] = user10;
*/
		User[]	users	=	{new User(1,"武田","憲隆")
							,new User(2,"高木","香")
							,new User(3,"柴田","伊織")
							,new User(4,"長尾","有希子")
							,new User(5,"酒見","真悟")
							,new User(6,"武末","憲和")
							,new User(7,"國崎","宏治")
							,new User(8,"割鞘","洋介")
							,new User(9,"榎枝","大悟")
							,new User(10,"今田","尭")};
		for(User	u	:	users){
			u.show();
		}
//
		Student student01 = new Student(101,"武田","憲隆");
		Student student02 = new Student(102,"高木","香");
		Student student03 = new Student(103,"柴田","伊織");
		Student student04 = new Student(104,"長尾","有希子");
		Student student05 = new Student(105,"酒見","真悟");
		Student student06 = new Student(106,"武末","憲和");
		Student student07 = new Student(107,"國崎","宏治");
		Student student08 = new Student(108,"割鞘","洋介");
		Student student09 = new Student(109,"榎枝","大悟");
		Student student10 = new Student(110,"今田","尭");
		Student student11 = new Student(111,"松隈","恭子");
		Student student12 = new Student(112,"花田","恒一");
		Student student13 = new Student(113,"内藤","初美");
		Student student14 = new Student(114,"原田","清司");
		Student student15 = new Student(115,"永野","修平");
		Student student16 = new Student(116,"奈木野","純一");
		Student student17 = new Student(117,"山之内","洋平");
		Student student18 = new Student(118,"鐘ヶ江","耕治");
		Student student19 = new Student(119,"野口","龍真");
		Student student20 = new Student(120,"山野","兼治");
		Student student21 = new Student(121,"皆川","洋介");
		Teacher teacher01 = new Teacher(1,"長澤","大輔","デザイン");
		Teacher teacher02 = new Teacher(2,"ラディ","ジェイソン","デザイン");
		Teacher teacher03 = new Teacher(3,"薄井","隆","Web/アプリ");
		Teacher teacher04 = new Teacher(4,"山本","浩司","3DCG");
		Teacher teacher05 = new Teacher(5,"ハナブサ","ノブユキ","デザイン");
		Teacher teacher06 = new Teacher(6,"コヌマ","ヨシツグ","Web/アプリ");
		Teacher teacher07 = new Teacher(7,"渡部","昇治","Web/アプリ");

 		student01.showName();
		student02.showName();
		student03.showName();
		student04.showName();
		student05.showName();
		student06.showName();
		student07.showName();
		student08.showName();
		student09.showName();
		student10.showName();
		student11.showName();
		student12.showName();
		student13.showName();
		student14.showName();
		student15.showName();
		student16.showName();
		student17.showName();
		student18.showName();
		student19.showName();
		student20.showName();
		student21.showName();
		teacher01.showName();
		teacher01.showSubject();
		teacher02.showName();
		teacher02.showSubject();
		teacher03.showName();
		teacher03.showSubject();
		teacher04.showName();
		teacher04.showSubject();
		teacher05.showName();
		teacher05.showSubject();
		teacher06.showName();
		teacher06.showSubject();
		teacher07.showName();
		teacher07.showSubject();
		
		Student[]	students	=	{new Student(101,"武田","憲隆")
									,new Student(102,"高木","香")
									,new Student(103,"柴田","伊織")
									,new Student(104,"長尾","有希子")
									,new Student(105,"酒見","真悟")
									,new Student(106,"武末","憲和")
									,new Student(107,"國崎","宏治")
									,new Student(108,"割鞘","洋介")
									,new Student(109,"榎枝","大悟")
									,new Student(110,"今田","尭")
									,new Student(111,"松隈","恭子")
									,new Student(112,"花田","恒一")
									,new Student(113,"内藤","初美")
									,new Student(114,"原田","清司")
									,new Student(115,"永野","修平")
									,new Student(116,"奈木野","純一")
									,new Student(117,"山之内","洋平")
									,new Student(118,"鐘ヶ江","耕治")
									,new Student(119,"野口","龍真")
									,new Student(120,"山野","兼治")
									,new Student(121,"皆川","洋介")};
		Teacher[]	teachers	=	{new Teacher(1,"長澤","大輔","デザイン")
									,new Teacher(2,"ラディ","ジェイソン","デザイン")
									,new Teacher(3,"薄井","隆","Web/アプリ")
									,new Teacher(4,"山本","浩司","3DCG")
									,new Teacher(5,"ハナブサ","ノブユキ","デザイン")
									,new Teacher(6,"コヌマ","ヨシツグ","Web/アプリ")
									,new Teacher(7,"渡部","昇治","Web/アプリ")};
		for(Student	s	:	students){
			s.show();
		}
		for(Teacher	t	:	teachers){
			t.show();
		}
		
//継承機能を使ってさらに簡略化させるには？		

		User[]	userse			=	{new Student(101,"武田","憲隆")
									,new Student(102,"高木","香")
									,new Student(103,"柴田","伊織")
									,new Student(104,"長尾","有希子")
									,new Student(105,"酒見","真悟")
									,new Student(106,"武末","憲和")
									,new Student(107,"國崎","宏治")
									,new Student(108,"割鞘","洋介")
									,new Student(109,"榎枝","大悟")
									,new Student(110,"今田","尭")
									,new Student(111,"松隈","恭子")
									,new Student(112,"花田","恒一")
									,new Student(113,"内藤","初美")
									,new Student(114,"原田","清司")
									,new Student(115,"永野","修平")
									,new Student(116,"奈木野","純一")
									,new Student(117,"山之内","洋平")
									,new Student(118,"鐘ヶ江","耕治")
									,new Student(119,"野口","龍真")
									,new Student(120,"山野","兼治")
									,new Student(121,"皆川","洋介")
									,new Teacher(1,"長澤","大輔","デザイン")
									,new Teacher(2,"ラディ","ジェイソン","デザイン")
									,new Teacher(3,"薄井","隆","Web/アプリ")
									,new Teacher(4,"山本","浩司","3DCG")
									,new Teacher(5,"ハナブサ","ノブユキ","デザイン")
									,new Teacher(6,"コヌマ","ヨシツグ","Web/アプリ")
									,new Teacher(7,"渡部","昇治","Web/アプリ")};
		for(User	u	:	userse){
			u.show();
//下のようにもできるが、オーバーライドを使用してもっと綺麗に記述できる！
/*			if(u	instanceof	Teacher){
				Teacher	t	=	(Teacher)u;
				System.out.println("教科："	+	t.getSubject());
			}
*/

		}
		
	}
}