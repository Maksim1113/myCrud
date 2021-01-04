package web.models;

public class CarModel {
    private int id;
    private String models;
    private String number;

    public CarModel(int id, String models, String number) {
        this.id = id;
        this.models = models;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
