package biz;

import java.util.List;
import java.util.Map;

import entity.Comment;

public interface ICommentBiz {
	  public int add(Integer id ,Integer uid,String content,Integer praise);
	  public List<Comment> findAllComment(Integer computerID, String sortType);
	  public int praise(Integer id);
}
