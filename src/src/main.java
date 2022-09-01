public class main {
    public static void main (String[]args){
            Bottle b1 = new Bottle();//water bottle
            Bottle b2 = new Bottle(1000, "steel"); //yeti
            Bottle b3 = new Bottle(-1000, "dark matter");//thanos bottle

            System.out.println("Water bottle volume:   " + b1.volume);
            System.out.println("Water bottle material: " + b1.material);

            System.out.println("Water bottle volume:   " + b2.volume);
            System.out.println("Water bottle material: " + b2.material);

            System.out.println("Water bottle volume:   " + b3.volume);
            System.out.println("Water bottle material: " + b3.material);

    }//main
}//class
