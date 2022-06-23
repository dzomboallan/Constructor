package Constructor;

public class Volume {
    double width, height, depth;

    Volume(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Volume(){
        width = height = depth = 0;
    }

    Volume(double len){
        width = height = depth = len;
    }

    double Box(){
        return width * height * depth;
    }
}
class Test{
    public static void main(String [] args){
        Volume mybox1 = new Volume(10, 20, 15);
        Volume mybox2 = new Volume();
        Volume mycube = new Volume(7);

        System.out.println("Volume for box1 is " + mybox1.Box());
        System.out.println("Volume for box2 is " + mybox2.Box());
        System.out.println("Volume for cube is " + mycube.Box());
    }

}
