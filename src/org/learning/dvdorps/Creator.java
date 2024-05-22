package org.learning.dvdorps;

public final class Creator {
    public Object create (String type){
        if(type.equals("playstation")){
            return new Playstation();
        } else if (type.equals("dvd")) {
            return new Dvd();
        }else {
            return null;
        }
    }
}
