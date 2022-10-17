package cn.itfish;

/**
 * @auther:果宁
 * @Date 2022/10/14 23:25
 * @since 1.0.0
 */
public class Students { ;
    private String name;
    private String gender;
    private String weight;
    private String higher;
    private String hobby;

    public Students() {
    }

    public Students(String name, String gender, String weight, String higher, String hobby) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.higher = higher;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHigher() {
        return higher;
    }

    public void setHigher(String higher) {
        this.higher = higher;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", higher=" + higher +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
