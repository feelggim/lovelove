package Day05.clss;

public class jiwoo {

	public static void main(String[] args) {
		
		// 객체 생성
		// - 클래스타입 객체명 = new 클래스명();
			Pikabhu pikachu = new Pikabhu();
			
			//pikachu.energy = 100;
			//pikachu.type = "전기";
			
			
			
			System.out.println("######피카"
					+ "츄######");
			System.out.println("에너지:"+pikachu.energy);
			System.out.println("에너지:"+pikachu.type);
			System.out.println("공격 A:"+ pikachu.aAttack());
			System.out.println("공격 B:"+ pikachu.bAttack());
			
			Pikabhu pikachu20 = new Pikabhu(150,"진화");
			System.out.println("######피카츄######");
			System.out.println("에너지:"+pikachu20.energy);
			System.out.println("에너지:"+pikachu20.type);
			System.out.println("공격 A:"+ pikachu20.aAttack());
			System.out.println("공격 B:"+ pikachu20.bAttack());
			
			Richu richu = new Richu();
			System.out.println("###### 라이츄 ######");
			System.out.println("에너지:"+richu.energy);
			System.out.println("에너지:"+richu.type);
			System.out.println("공격 A:"+ richu.aAttack());
			System.out.println("공격 B:"+ richu.bAttack());
			
			
//			Richu richu40 = new Richu(300, "슈퍼전기");
//			System.out.println("###### 라이츄(Lv.40) ######");
//			System.out.println("에너지:"+richu40.energy);
//			System.out.println("에너지:"+richu40.type);
//			System.out.println("공격 A:"+ richu40.aAttack());
//			System.out.println("공격 B:"+ richu40.bAttack());
//			System.out.println("공격 C:"+ richu40.cAttack());
//			System.out.println();

	}

}
