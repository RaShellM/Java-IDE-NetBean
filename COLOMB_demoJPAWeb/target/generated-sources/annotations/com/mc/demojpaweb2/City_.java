package com.mc.demojpaweb2;

import com.mc.demojpaweb2.Country;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-06T19:39:53")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, Country> countryCode;
    public static volatile SingularAttribute<City, String> district;
    public static volatile SingularAttribute<City, String> name;
    public static volatile SingularAttribute<City, Integer> id;
    public static volatile SingularAttribute<City, Integer> population;

}