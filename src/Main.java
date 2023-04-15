public class Main {
    public static void main(String[] args) {
        Boss heroes=new Boss();
        heroes.setBossDefence("Magic");
        heroes.setBossHealth(200);
        heroes.setBossDamage(30);
        System.out.println("Суперспособность:"+ heroes.getBossDefence() + " Здоровье:"+ heroes.getBossHealth()
        + " Урон: "+ heroes.getBossDamage());

    }
}