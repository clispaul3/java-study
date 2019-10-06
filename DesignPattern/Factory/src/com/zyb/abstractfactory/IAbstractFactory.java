package com.zyb.abstractfactory;

import com.zyb.abstractfactory.dao.IColor;
import com.zyb.abstractfactory.dao.IShape;

public interface IAbstractFactory {
    IShape createShape(String shape);
    IColor createColor(String color);
}
