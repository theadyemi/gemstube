package africa.semicolon.gemstube.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //Coz it's going to the database
@Table(name = "users")
@Setter
@Getter
public class User {
    @Id
    //Use Generated Value if something will be giving the ids. Don't use this if you're adding id manually or you have a method that adds it manually, checks the last one and suggest the next with that details.
    //There's Generator, and there's strategy property - strategy tells how the id will be generated. AUTO tells hibernate to choose the one that is most fitting.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
}
