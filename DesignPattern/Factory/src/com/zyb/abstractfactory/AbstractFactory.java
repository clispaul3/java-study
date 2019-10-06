package com.zyb.abstractfactory;

import com.zyb.abstractfactory.dao.IColor;
import com.zyb.abstractfactory.dao.IShape;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactory {
    public Map create(String shapeType,String colorType){
         IShape shape = this.createShape(shapeType);
         IColor color = this.createColor(colorType);
         Map result = new HashMap();
         result.put("shape",shape);
         result.put("color",color);
         return result;
    }

    private IShape createShape(String shape) {
        return new ShapeFactory().create(shape);
    }

    private IColor createColor(String color) {
        return new ColorFactory().create(color);
    }
}
