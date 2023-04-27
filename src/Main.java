public class Main {
    public static void main(String[] args) {
        Modules mod = new Modules();

        float val = mod.promptFloat("Введите число с плавающей точкой: ");
        System.out.println(val);

        mod.task2();

        mod.task3();
    }
}
