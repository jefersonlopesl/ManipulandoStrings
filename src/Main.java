public class Main {
    public static void main(String[] args) {
        String x = "ola mundo, esse é o novo mundo.";
        System.out.println(x.length());
        System.out.println(x+"concatenada");
        System.out.println(x.contains("novo"));
        System.out.println(x.indexOf("mundo"));
        System.out.println(x.lastIndexOf("mundo"));
        System.out.println(x.toUpperCase());
        System.out.println(x.substring(9));
        System.out.println(x.equals("ola"));
    }
}