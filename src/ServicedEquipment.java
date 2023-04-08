public abstract class ServicedEquipment implements Diagnostics {
    private final String modelName;
    private final int wheelsCount;

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

    private void updateTyre() {
        System.out.println("Меняем покрышку ");
    }

    private void updateTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }


    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        updateTyres();
    }
}
