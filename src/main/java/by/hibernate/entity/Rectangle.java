package by.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Figure {

    @Column(name = "side_a")
    private int a;

    @Column(name = "side_b")
    private int b;

    @Override
    public double getSquare() {
        return 0;
    }
}
