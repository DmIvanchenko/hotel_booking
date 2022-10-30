package com.hotel.service;

import com.hotel.model.Room;
import com.hotel.model.RoomDirection;
import com.hotel.model.Room_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.List;


@Repository
@Transactional
@Service("roomService")
public class RoomServiceImpl implements RoomService {
    private RoomRepository roomRepository;

    @Autowired
    public void setRoomRepositoryRepository(RoomRepository roomRepositoryRepository) {
        this.roomRepository = roomRepositoryRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public List<Room> findAllByCriteria(String number, Double price, String roomFloorType, String customersNumber,
                                        String roomViewType, String roomQualityType,
                                        RoomDirection direction) {
        return roomRepository.findAll(Specifications.where(getSpecification(number, price, roomFloorType, customersNumber,
                roomViewType, roomQualityType, direction)),
                new Sort(Sort.Direction.ASC, "number"));
    }

    @Override
    public Room findOne(Long id) {
        return roomRepository.findOne(id);
    }

    /* Generate criteria query */
    private Specification<Room> getSpecification(final String number, final Double price, final String roomFloorType,
                                                 final String roomCustomersNumber, final String roomViewType, final String roomQualityType,
                                                 final RoomDirection direction) {
        return new Specification<Room>() {
            @Override
            public Predicate toPredicate(Root<Room> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                root.fetch(Room_.reservations, JoinType.LEFT);
                Predicate predicate = criteriaBuilder.conjunction();
                if (number != null && !number.isEmpty()) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.number),
                            number);
                    predicate = criteriaBuilder.and(predicate, p);
                }
                if (price != null ) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.price),
                            price);
                    predicate = criteriaBuilder.and(predicate, p);
                }

                if (roomFloorType != null && !String.valueOf(roomFloorType).isEmpty() && !roomFloorType.equals("Усі")) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.roomFloorType),
                            roomFloorType);
                    predicate = criteriaBuilder.and(predicate, p);
                }

                if (roomCustomersNumber != null && !String.valueOf(roomCustomersNumber).isEmpty() && !roomCustomersNumber.equals("Усі")) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.roomCustomersNumber),
                            roomCustomersNumber);
                    predicate = criteriaBuilder.and(predicate, p);
                }

                if (roomViewType != null && !String.valueOf(roomViewType).isEmpty() && !roomViewType.equals("Усі")) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.roomViewType),
                            roomViewType);
                    predicate = criteriaBuilder.and(predicate, p);
                }

                if (roomQualityType != null && !String.valueOf(roomQualityType).isEmpty() && !roomQualityType.equals("Усі")) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.roomQualityType),
                            roomQualityType);
                    predicate = criteriaBuilder.and(predicate, p);
                }



                if (direction != null && !direction.equals(RoomDirection.ALL)) {
                    Predicate p = criteriaBuilder.equal(root.get(Room_.direction),
                            direction);
                    predicate = criteriaBuilder.and(predicate, p);
                }
                return predicate;
            }
        };
    }

    @Override
    public Room findByNumber(String number) {
        return roomRepository.findByNumber(number);
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void delete(Long id) {
        roomRepository.delete(id);
    }
}
