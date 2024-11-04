public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        System.out.print(data.getDia()+ "/");
        System.out.print(data.getMes()+ "/");
        System.out.println(data.getAno());

        data.setData(21,6,2024);

        System.out.print(data.getDia()+ "/");
        System.out.print(data.getMes()+ "/");
        System.out.println(data.getAno());
    }
}
