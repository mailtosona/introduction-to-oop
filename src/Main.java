public class Main {
    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();

        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot parru = new Parrot("parru", "Green");
        parru.speak();
        parru.fly();

        parru.spin();
        parru.doTheCaterpillar();
        parru.jump();
    }


}
