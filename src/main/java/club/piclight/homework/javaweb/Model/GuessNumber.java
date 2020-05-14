package club.piclight.homework.javaweb.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias(value = "GuessNumber")
@Data
@AllArgsConstructor
public class GuessNumber {
    private String jSession;
    private Integer number;
}
