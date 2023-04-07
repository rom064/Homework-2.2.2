public class ServicedEquipment {
    private String modelName;
    private int wheelsCount;

    public ServicedEquipment(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку " + getWheelsCount() + " раз(а) ");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель "+ getWheelsCount() + " раз(а) ");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп " + getWheelsCount() + " раз(а) ");
    }
}
