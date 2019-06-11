package shard.jdbc.common.entity;

public class TableOne {
    private Integer id;

    private String phone;

    private String backOne;

    private String backTwo;

    private String backThree;

    @Override
    public String toString() {
        return "TableOne{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", backOne='" + backOne + '\'' +
                ", backTwo='" + backTwo + '\'' +
                ", backThree='" + backThree + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBackOne() {
        return backOne;
    }

    public void setBackOne(String backOne) {
        this.backOne = backOne == null ? null : backOne.trim();
    }

    public String getBackTwo() {
        return backTwo;
    }

    public void setBackTwo(String backTwo) {
        this.backTwo = backTwo == null ? null : backTwo.trim();
    }

    public String getBackThree() {
        return backThree;
    }

    public void setBackThree(String backThree) {
        this.backThree = backThree == null ? null : backThree.trim();
    }
}