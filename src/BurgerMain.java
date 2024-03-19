public class BurgerMain {
    public static void main(String[] args) {
        Burger usualBurger = new Burger("булочка з кунжутом", "середньої прожарки", "чедр",
                "салат", "натуральний");
        Burger dietBurger = new Burger("цільнозернова булочка", "середньої прожарки",
                "низкожирний сир", "орегано");
        Burger doubleMeatBurger = new Burger("чорна булочка", "well done", "чедр", "огірки",
                "провонсаль", true);

        System.out.println("This is contain of an usual burger " + usualBurger);
        System.out.println("This is contain of a diet burger " + dietBurger);
        System.out.println("This is contain of a double-meat burger " + doubleMeatBurger);
    }
}
