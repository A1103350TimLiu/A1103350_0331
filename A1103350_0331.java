import java.util.*;

 class Animal{
    String name;  
    double height;
    int weight;
    double speed;
    
    public Animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    double distance(int x){  
        double d= x*this.speed;  
        return d;  
    }

    double distance(int x, double y){  
        double d= x*y*this.speed;  
        return d;  
    }

    void show(){
        System.out.println("姓名:" + this.name + ", 身高:" + this.height + "公尺, 體重:" + this.weight + "公斤, 速度:" + this.speed + "公尺/分鐘");
    }

    static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
  }

     class Human extends Animal{
        String gender;
        public Human(String name, double height, int weight, int speed, String gender) {
            super(name, height, weight, speed);
            this.gender = gender;
        }

        @Override
        void show(){
            System.out.println("姓名:" + this.name + ", 身高:" + this.height + "公尺, 體重:" + this.weight + "公斤, 速度:" + this.speed + "公尺/分鐘, " + "性別:" + this.gender );
        }
    }

     class Snow extends Human{
        String ice;
        public Snow(String name, double height, int weight, int speed, String gender, String ice) {
            super(name, height, weight, speed, gender);
            this.ice = ice;
        }

        @Override
        void show(){
            System.out.println("姓名:" + this.name + ", 身高:" + this.height + "公尺, 體重:" + this.weight + "公斤, 速度:" + this.speed + "公尺/分鐘, " + "性別:" + this.gender +", "+ "技能:" + this.ice);
        }

        @Override
        double distance(int x){  
            double d= x*this.speed*2;  
            return d;  
        }
    
        @Override
        double distance(int x, double y){  
            double d= x*y*this.speed*2;  
            return d;  
        }

        
    }

  public class A1103350_0331 {
    public static void main(String []args){
        
        
        Animal animal0= new Animal("雪寶", 1.1, 52, 100);
        
 
        Animal animal1 = new Animal("驢子", 1.5, 99, 200);
        
        Human human0 = new Human("阿克", 1.9, 80, 150, "男");

        Human human1 = new Human("漢斯", 1.8, 78, 130, "男");

        Human human2 = new Human("安那", 1.7, 48, 120, "女");
        
        Snow snow0 = new Snow("愛沙", 1.7, 50, 120, "女", "yes");

        Animal.showinfo(); 
        animal0.show();
        animal1.show();
        human0.show();
        human1.show();
        human2.show();
        snow0.show();

        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入"+animal0.name+"的時間: ");
        x=input.nextInt();
        if(x<=0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+animal0.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(animal0.name+"的距離為: "+ animal0.distance(x));
        }else{
            System.out.println(animal0.name+"的距離為: "+animal0.distance(x, y));
        }
      
        System.out.print("請輸入"+animal1.name+"的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+animal1.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(animal1.name+"的距離為: "+ animal1.distance(x));
        }else{
            System.out.println(animal1.name+"的距離為: "+animal1.distance(x, y));
        }

        System.out.print("請輸入"+human0.name+"的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.println("輸入錯誤");
            return;
        }
        System.out.print("請輸入"+human0.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.println(human0.name+"的距離為: "+ human0.distance(x));
        }else{
            System.out.println(human0.name+"的距離為: "+human0.distance(x, y));
        }

        System.out.print("請輸入"+human1.name+"的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.println("error");
            return;
        }
        System.out.print("請輸入"+human1.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.println(human1.name+"的距離為: "+ human1.distance(x));
        }else{
            System.out.println(human1.name+"的距離為: "+human1.distance(x, y));
        }

        System.out.print("請輸入"+human2.name+"的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+human2.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.println(human2.name+"的距離為: "+ human2.distance(x));
        }else{
            System.out.println(human2.name+"的距離為: "+human2.distance(x, y));
        }

        System.out.print("請輸入"+snow0.name+"的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+snow0.name+"的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.println(snow0.name+"的距離為: "+ snow0.distance(x));
        }else{
            System.out.println(snow0.name+"的距離為: "+snow0.distance(x, y));
        }
    }
  }