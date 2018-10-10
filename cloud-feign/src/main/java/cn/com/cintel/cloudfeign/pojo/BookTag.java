package cn.com.cintel.cloudfeign.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: BookTag
 * @Description: 书本标签实体类
 * @Auther: 49092
 * @CreateDate: 2018/10/10 21:06
 * @Version: 1.0
 * @UpdateDate:
 */
@ApiModel(value = "BookTag",description = "书本标签实体")
@Data
public class BookTag {

    @ApiModelProperty(value = "作者",required = false)
    private String author;

    @ApiModelProperty(value = "书本分类",required = true)
    private String category;

}
