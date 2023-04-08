public abstract class OverallTransport extends ServicedEquipment {
    public OverallTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
