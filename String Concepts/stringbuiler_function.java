public class stringbuiler_function{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Java programming");
		System.out.println("Length: "+ s.length());
		s.append("!!!");
		System.out.println("Modified String: "+s);
		s.insert(5,"Hello ");
		System.out.println("Insert: "+s);
		System.out.println(s.length());
		s.replace(11, 22, "code");
		System.out.println("Replace :"+s);
		s.delete(5, 11);
		System.out.println("Delete: "+s);
		s.reverse();
		System.out.println("Reverse: " +s);
		System.out.println("Capacity: "+ s.capacity());
		System.out.println("Char at: "+ s.charAt(4));
		s.setCharAt(4, 'e');
		System.out.println("Set character: "+ s);
		System.out.println("Substring: " + s.substring(5));
		String c=s.toString();
		System.out.println("Converted to String: "+c);
		
	}
}