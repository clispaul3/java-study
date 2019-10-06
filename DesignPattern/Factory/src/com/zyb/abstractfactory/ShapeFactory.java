package com.zyb.abstractfactory;

import com.zyb.abstractfactory.dao.Circle;
import com.zyb.abstractfactory.dao.IShape;
import com.zyb.abstractfactory.dao.Square;

public class ShapeFactory {
    public IShape create(String type){
        IShape shape = null;
        switch (type.toUpperCase()){
            case "CIRCLE":
                shape = new Circle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }
}
