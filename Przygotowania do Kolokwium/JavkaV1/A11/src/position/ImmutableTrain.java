package position;

public final class ImmutableTrain {
    private final double speed;
    private  final String model;
    private  final int carriageCount;

    public ImmutableTrain(double speed, String model, int carriageCount) {
        this.speed = speed;
        this.model = model;
        this.carriageCount = carriageCount;
    }

    public double getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public ImmutableTrain move(double speedChange, String modelSuffix, int carriageCountChange){
        return new ImmutableTrain(speed + speedChange, model + modelSuffix, carriageCount + carriageCountChange);
    }

    @Override
    public String toString() {
        return "Speed: " + getSpeed() + "\nModel: " + getModel() + "\nLiczba wagonów: " + getCarriageCount();
    }

}
