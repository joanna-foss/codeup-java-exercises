public class SuperHero extends Person{
    private String alterego;

    public static void main(String[] args) {
        SuperHero manOfSteel = new SuperHero("Clark Kent", "Superman");
        System.out.println("manOfSteel.getName() = " + manOfSteel.getName());
        System.out.println("manOfSteel.getSecretIdentity() = " + manOfSteel.getSecretIdentity());
    }

    public SuperHero(String birthName, String alterEgo){
        super(birthName);
        this.alterego = alterEgo;
    }

    public String getName(){
        return alterego;
    }
    
    public String getSecretIdentity(){
        return super.getName();
    }
}
