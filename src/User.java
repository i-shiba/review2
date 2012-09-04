//packege jp.co.dhw.review2;

public class User{
	public Integer id        = null;
	public String  firstName = null;
	public String  lastName  = null;

	public User(Integer id, String firstName, String lastName){
		this.id        = id;
		this.firstName = firstName;
		this.lastName  = lastName;
	}
	public void showId(){
		System.out.println(this.id);
	}
	public void showName(){
		System.out.println(this.firstName + ":" + this.lastName);
	}

/* 縺薙％縺九ｉ蜈医��斐〒縺ｮ蝗樒ｭ斐〒縺吶�
	public static void main(String args[]){
		User user01 = new User(1,"豁ｦ逕ｰ","諞ｲ髫��);
		User user02 = new User(2,"莉顔伐","蟆ｭ窶�;
		User user03 = new User(3,"驟定ｦ�,"諷主誓窶�;
		User user04 = new User(4,"蜀�陸","蛻晉ｾ寂�);
		User user05 = new User(5,"髟ｷ蟆ｾ","譛牙ｸ悟ｭ絶�);
		User user06 = new User(6,"讎取椌","螟ｧ謔溪�);
		User user07 = new User(7,"豁ｦ譛ｫ","諞ｲ蜥娯�);
		User user08 = new User(8,"蜴溽伐","貂�昇窶�;
		User user09 = new User(9,"鬮俶惠","鬥吮�);
		User user10 = new User(10,"豌ｸ驥�,"菫ｮ蟷ｳ窶�;

		user01.showId();
		user01.showName();
		user02.showId();
		user02.showName();
		user03.showId();
		user03.showName();
		user04.showId();
		user04.showName();
		user05.showId();
		user05.showName();
		user06.showId();
		user06.showName();
		user07.showId();
		user07.showName();
		user08.showId();
		user08.showName();
		user09.showId();
		user09.showName();
		user10.showId();
		user10.showName();
	}
*/
// 縺薙％縺九ｉ蜈医��励〒縺ｮ蝗樒ｭ斐〒縺吶�
	public static void main(String[] args){
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
	}
}