
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "東京都";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		taro.talk();
		taro.walk();
		taro.run();

		
		//演習2-1
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "111-1111-1111";
		jiro.address = "大阪府";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		
		
		//演習2-2
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "222-2222-2222";
		hanako.address = "京都府";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		
		
		//演習2-3
		Person kanata = new Person();
		kanata.name = "Shibata Kanata";
		kanata.age = 23;
		kanata.phoneNumber = "333-3333-3333";
		kanata.address = "千葉県";
		
		System.out.println(kanata.name);
		System.out.println(kanata.age);
		System.out.println(kanata.phoneNumber);
		System.out.println(kanata.address);
		
		//演習8
		Robot aibo = new Robot();
		aibo.name = "aibo";
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
