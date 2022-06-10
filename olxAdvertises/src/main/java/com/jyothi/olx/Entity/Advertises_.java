package com.jyothi.olx.Entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;



@StaticMetamodel(Advertises.class)
public class Advertises_ {

public static volatile SingularAttribute<Advertises, String> title;
public static volatile SingularAttribute<Advertises,String> category;
public static volatile SingularAttribute<Advertises,String> username;
public static volatile SingularAttribute<Advertises,Double> price;
}