package service;

import model.Circle;
import model.Triangle;

/**
 * Created by Tomek on 2016-06-06.
 */

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public ShapeService setCircle(Circle circle) {
        this.circle = circle;
        return this;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public ShapeService setTriangle(Triangle triangle) {
        this.triangle = triangle;
        return this;
    }
}
