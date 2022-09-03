package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCars(int count) {
        List<Car> list; {
            list = new ArrayList<>();
            list.add(new Car("Car1", "01", "Red"));
            list.add(new Car("Car2", "02", "Blue"));
            list.add(new Car("Car3", "03", "Yellow"));
            list.add(new Car("Car4", "04", "Green"));
            list.add(new Car("Car5", "05", "Black"));
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}

