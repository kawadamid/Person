
public class Test {
	public static void main(String[]args) {
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="111111";
		taro.address="東京";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="222222";
		jiro.address="世田谷";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="3333333";
		hanako.address="練馬";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		
		Person midori=new Person();
		midori.name="川田碧";
		midori.age=28;
		midori.phoneNumber="444444";
		midori.address="千代田";
		
		System.out.println(midori.name);
		System.out.println(midori.age);
		System.out.println(midori.phoneNumber);
		System.out.println(midori.address);
		
		
		//ここからロボット
		
		Robot aibo=new Robot();
		aibo.name="アイボ";
		
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot ashimo=new Robot();
		ashimo.name="アシモ";
		
		ashimo.talk();
		ashimo.walk();
		ashimo.run();
		
		Robot pepper=new Robot();
		pepper.name="ペッパー君";
		
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		
	}
	

}
