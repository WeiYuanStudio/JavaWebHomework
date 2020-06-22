package club.piclight.homework.javaweb.Model;

public class Book {
    private Long id;
    private String name;
    private String coverLink;
    private Double price;
    private Integer num;

    public Book(Long id, String name, String coverLink, Double price, Integer num) {
        this.id = id;
        this.name = name;
        this.coverLink = coverLink;
        this.price = price;
        this.num = num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverLink() {
        return coverLink;
    }

    public void setCoverLink(String coverLink) {
        this.coverLink = coverLink;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void addNum() {
        this.num = ++num;
    }

    public void removeNum() {
        this.num = --num;
    }
}
