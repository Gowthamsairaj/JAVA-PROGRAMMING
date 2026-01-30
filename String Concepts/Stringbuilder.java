class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);
        sb.insert(0, "Java ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        
    }
}
