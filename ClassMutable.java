
public final class ClassMutable {
	private final int id;
	private final String str;
	public int getId() {
		return id;
	}
	public String getStr() {
		return str;
	}
	public ClassMutable(int id,String st) 
	{
		this.id=id;
		this.str=st;
	}
	public void set(int id,String st)
	{
		this.id=id;
		this.str=st;
	}
	public static void main(String str[])
	{
		ClassMutable cm=new ClassMutable(100,"Aniket");
		int i=cm.getId();
		String stt=cm.getStr();
		System.out.println(i);
		System.out.println(stt);
		cm.set(276,"hello");
	}

}
