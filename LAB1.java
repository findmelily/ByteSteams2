package bytestreams2;

public class LAB1 {

    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
        
    }

}
