public class Hero {
     private int heroHealth;
    private int heroDamage;
    private String heroDefence;



    public Hero(int heroHealth,int heroDamage,String heroDefence){
        this.heroHealth=heroHealth;
        this.heroDamage=heroDamage;
        this.heroDefence=heroDefence;
    }

    public Hero(int heroHealth,int heroDamage){
        this.heroHealth=heroHealth;
        this.heroDamage=heroDamage;
    }
    public int getHeroHealth(){
        return this.heroHealth;
    }
    public int getHeroDamage(){
        return this.heroDamage;
    }

    public String getHeroDefence() {
        return heroDefence;
    }
}

