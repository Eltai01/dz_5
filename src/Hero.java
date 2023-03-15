public class Hero {
   p
    private int Healths;
    private int Damage;
    private String SuperPower;

    private Hero (int Healths,int Damage){

    }

    public void setHealths(int healths) {
        Healths = healths;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public void setSuperPower(String superPower) {
        SuperPower = superPower;
    }

    public int getHealths() {
        return this.Healths;
    }

    public int getDamage() {
        return this.Damage;
    }

    public String getSuperPower() {
        return this.SuperPower;
    }

    public Hero(int healths, int damage, String superPower) {
        Healths = healths;
        Damage = damage;
        SuperPower = superPower;
    }
//    public Hero( int HeroHealths, int HeroDamage, String HeroSuperPower)//      Healths = HeroHealths;
//        Damage = HeroDamage;
//        SuperPower = HeroSuperPower;
//    }

}
