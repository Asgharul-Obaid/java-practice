package Test;

public class Sahil {
    int id=1;
    public static int id1=1;
	public static void main(String[] args) {
		Sahil s = new Sahil();
		for (int i = 0; i < 2; i++) {
			s.id +=i;
			Sahil.id1 +=i;	
		}
		System.out.println(s.id+ " "+Sahil.id1);	
		
		Sahil s1 = new Sahil();
		for (int i = 0; i < 2; i++) {
			s1.id +=i;//1+0=1,1+1=2
			Sahil.id1 +=i;//2+0=2,2+1=3	
		}
		System.out.println(s.id+ " "+Sahil.id1);
	}
}
