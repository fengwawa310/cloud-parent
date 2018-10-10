package cn.com.cintel.cloudfeign.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Book
 * @Description: 书本类实体
 * @Auther: 49092
 * @CreateDate: 2018/10/10 20:42
 * @Version: 1.0
 * @UpdateDate:
 */
@ApiModel(value = "Book",description = "书本实体")
@Data
public class Book {

    @ApiModelProperty(value = "书本名",required = true)
    private String bookName;
    @ApiModelProperty(value = "价格",required = true)
    private String price;
    @ApiModelProperty(value = "书本标签",required = true)
    private BookTag bookTag;

}
