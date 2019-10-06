package com.zyb.abstractfactory;

import com.zyb.abstractfactory.dao.Green;
import com.zyb.abstractfactory.dao.IColor;
import com.zyb.abstractfactory.dao.Red;

public class ColorFactory {
    public IColor create(String type){
        IColor color = null;
        switch (type.toUpperCase()){
            case "RED":
                color = new Red();
                break;
            case "GREEN":
                color = new Green();
                break;
            default:
                break;
        }
        return color;
    }
}
