package com.hotel.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Room.class)
public abstract class Room_ {

	public static volatile SingularAttribute<Room, RoomFloorType> roomFloorType;
	public static volatile SingularAttribute<Room, RoomCustomersNumber> roomCustomersNumber;
	public static volatile SingularAttribute<Room, RoomViewType> roomViewType;
	public static volatile SingularAttribute<Room, String> roomQualityType;

	public static volatile SingularAttribute<Room, Double> price;
	public static volatile SingularAttribute<Room, String> number;
	public static volatile SetAttribute<Room, Reservation> reservations;
	public static volatile SingularAttribute<Room, Long> id;

	public static volatile SingularAttribute<Room, Breakfast> breakfast;
	public static volatile SingularAttribute<Room, RoomDirection> direction;

}

