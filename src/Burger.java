public class Burger {

    public String bun;
    public String meat;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, null);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean doubleMeat) {
        this(bun, doubleMeat ? "подвійне мясо середньої прожарки" : meat, cheese, greens, mayonnaise);
    }

    @Override
    public String toString() {
        return ": " +
                "bun= " + bun + ' ' +
                ", meat= " + meat + ' ' +
                ", cheese= " + cheese + ' ' +
                ", greens= " + greens + ' ' +
                (mayonnaise != null ? ", mayonnaise= " + mayonnaise + ' ' : "") +
                ';';
    }
}
