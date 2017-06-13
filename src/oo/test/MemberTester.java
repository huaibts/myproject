package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member member = new Member("Joan");
		member.setAge(-8);
		System.out.println(member.getAge());

		//PhoneMember
		PhoneMember member2 = new PhoneMember();
		PhoneMember member3 = new PhoneMember("Tom");
		
	}

}
