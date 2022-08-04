package pl.coderslab.springboottest.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Data {
    @Id
    @GeneratedValue
    private Long id;
    private String dataName;
    private String dataContent;

    public Data(String dataName, String dataContent) {
        this.dataName = dataName;
        this.dataContent = dataContent;
    }
}
