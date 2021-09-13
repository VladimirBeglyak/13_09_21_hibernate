package by.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "circles")
public class Circle extends Figure{

    @Column(name = "radius")
    private int r;

    @Enumerated(EnumType.STRING)
    @Column(length = 8)
    private Status status;

    public Circle() {
    }

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public double getSquare() {
        return 3.14*r*r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
