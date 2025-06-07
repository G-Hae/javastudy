package gemini.day04;

class Car {
    private String color;
    private String model;
    private int maxSpeed;

    public Car(String color, String model, int maxSpeed){
        this.color = color;
        this.model = model;
        if(maxSpeed>0 && maxSpeed<=300){
            this.maxSpeed = maxSpeed;
        } else{
            this.maxSpeed = 180;
        }
    }

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setColor(String color){
        this.color = color;
    }
    
    public void setMaxSpped(int maxSpeed){
        if(maxSpeed > 0 && maxSpeed<=300){
            this.maxSpeed = maxSpeed;
        }else{
            System.out.println("maxSpeed should be 0 to 300");
        }
    }
    public void drive(){
        System.out.println(model + "is driving with " + maxSpeed + "km");
    }
    public void showInfo(){
        System.out.println(model + "has color" + color + "max speed: " + maxSpeed + "km");
    }

}
