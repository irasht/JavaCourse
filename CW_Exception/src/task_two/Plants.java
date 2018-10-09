package task_two;

public class Plants {
    private int size;
    private Color color;
    private Type type;

    public Plants(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        this.color = colorConvert(color);
        this.type = typeConvert(type);
    }

    private Color colorConvert(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            case "pink":
                return Color.PINK;
            default:
                throw new ColorException("Input only color blue, red, white or pink");
        }
    }

    private Type typeConvert(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "cornflower":
                return Type.CORNFLOWER;
            case "rose":
                return Type.ROSE;
            case "daisy":
                return Type.DAISY;
            case "peony":
                return Type.PEONY;
            default:
                throw new TypeException("Input only type cornflower, rose, daisy or peon");
        }
    }

    @Override
    public String toString() {
        return "Plants size is " + size + ", color " + color.toString().toLowerCase() + ", type " + type.toString().toLowerCase();
    }
}