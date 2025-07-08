package homework.task2;

public class task2 {
    public static void main(String[] args) {
        TextProcessor tp =new TextProcessor( "Anton", "Atamanov");


        tp.printFormats(); // тепер з маленької
        tp.createEmail();
        System.out.println("довжина повного імені:"+tp.getFullNameLength());

    }
}
