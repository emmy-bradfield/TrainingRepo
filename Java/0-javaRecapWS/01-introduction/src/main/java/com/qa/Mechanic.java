package main.java.com.qa;

public class Mechanic {
    private Long skill;
    private Double rate;

    public Mechanic(){};

    public Mechanic(Long skill) {
        this.skill = skill;
        this.rate = (skill*Math.random());
    }

    public Double getInvoice(Car car){
        Double wheelCost = car.getWheelScore()*this.rate;
        Double breakCost = car.getBreakScore()*this.rate;
        Double engineCost = car.getBreakScore()*this.rate;
        Double labour = (car.getAge() > 10 || car.getMilage() > 50000) ? this.rate*100 : this.rate*200;
        Double invoice = wheelCost + breakCost + engineCost + labour;
        return invoice;
    };

    public Double fixCar(Car car){
        Double invoice = getInvoice(car);
        car.setWheelScore((car.getWheelScore() + skill <= 10) ? car.getWheelScore() + skill : 10);
        car.setBreakScore((car.getBreakScore() + skill <= 10) ? car.getBreakScore() + skill : 10);
        car.setEngineScore((car.getEngineScore() + skill <= 10) ? car.getEngineScore() + skill : 10);
        System.out.println("Daisy fixed your car!");
        System.out.println("Wheel health is now " + (car.getWheelScore())*10 + "%");
        System.out.println("Break health is now " + (car.getBreakScore())*10 + "%");
        System.out.println("Engine health is now " + (car.getEngineScore())*10 + "%");
        return invoice;
    };

    public Long getSkill(){
        return skill;
    }

    public void setSkill(Long skill){
        this.skill = skill;
    };

    public Double getRate(){
        return rate;
    };

}
