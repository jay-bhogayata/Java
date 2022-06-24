class Box{
    
        
        double width,height,depth;
        
        Box(double w , double h , double d){
            width = w ;
            height= h ;
            depth = d;
        }

        Box()
        {
            width=height=depth = 0;
        }

        Box(double len){
            width=height=depth = len;
        }

        double volume(){
            return width*height*depth;
        }
    
}

class Demo{

    public static void main(String[] args) {
        
        Box b1 = new Box(10,12.5,20);

        Box b2 = new Box();

        Box b3 = new Box(25);

        double vol;

        vol = b1.volume();
        System.out.println("value of cube 1 is :" + vol);
        
        vol = b2.volume();
        System.out.println("value of cube 2 is :" + vol);
        
        vol = b3.volume();
        System.out.println("value of cube 3 is :" + vol);


    }

}
