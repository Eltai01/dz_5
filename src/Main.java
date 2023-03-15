public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setDefence("Magic");
        boss.setHealths(700);
        System.out.println("Boss Healths " + boss.getHealths());
        System.out.println("Boss Defence " + boss.getDefence());
        System.out.println("Boss Damage " + boss.getDamage());
        for (int i = 0; i < CreateHeroes().length; i++) {
            System.out.println(CreateHeroes()[i].getHealths() + " " +
                   CreateHeroes()[i].getDamage() + " " +
                    CreateHeroes()[i].getSuperPower());

        }

    }
    public  static  Hero[] CreateHeroes(){

        Hero Jacs = new Hero(300,50,"Magic");
        Hero Doc = new Hero(250,20,"Мечник");
        Hero Cot = new Hero(200,20,"Целитель");
        Hero[] allHeroes = new Hero[]{Jacs, Doc, Cot };
        return allHeroes;


    }


    }



