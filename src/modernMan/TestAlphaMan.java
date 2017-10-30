package modernMan;

public class TestAlphaMan {
    public static void main(String[] args) {
        AlphaMan shidurBaba = new AlphaMan();
        shidurBaba.setAlphaManNAme("ShidurBaba");
        String name = shidurBaba.getAlphaManNAme();
        System.out.println("Our alpha man's name is " + name);
        shidurBaba.alphaManWalks();
    }

}
