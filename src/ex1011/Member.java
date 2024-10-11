package ex1011;
//객체 동등비교
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				System.out.println("id= "+id+" member.id="+member.id);
				return true;
			}else {
				System.out.println("id="+id+" member.id="+member.id);
			}
		}
		return false;		
	}
}
