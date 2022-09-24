public class Main {
    public static void main(String[] args) {
        int numbers = gather(10,3);
        System.out.println(numbers);
        String cities = giveCity();
        System.out.println(cities);

        int total = gather(2,9,11,35);
        System.out.print(gather(3,9,5,6));
    }

    public static void add(){
        System.out.println("Eklendi");
    }

    public static void delete(){
        System.out.println("Silindi");
    }

    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int gather(int number_1, int number_2){
        return number_1 + number_2;
    }

    public static String giveCity(){
        return "İstanbul";
    }

    public static int gather(int... numbers){
        int total = 0;
        for (int number: numbers){
            total += number;
        }
        return total;
    }
}