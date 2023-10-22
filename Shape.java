package package2;

public abstract class Shape {
    private String shapeName;

    public Shape(String shapename) {
        this.shapeName = shapename;
    }

    public abstract double area();

    public String toString() {
        String Result = "Shape Name " + this.shapeName;
        return Result;
    }

}
