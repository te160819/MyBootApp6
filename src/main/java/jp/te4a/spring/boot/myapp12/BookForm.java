package jp.te4a.spring.boot.myapp12;
import jp.te4a.spring.boot.myapp12.Writter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class BookForm {
  private Integer id ;
  private String title;
  @Writter(ok = "東北タロウ")
  private String writter;
  private String publisher;
  private Integer price;
}