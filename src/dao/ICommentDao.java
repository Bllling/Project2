package dao;

import java.util.List;
import java.util.Map;

import dao.impl.CommentDaoImpl;
import entity.Comment;

public interface ICommentDao {
  public int add(Integer id ,Integer uid,String content,Integer praise);
  
  public int praise(Integer id);
  
  public List<Comment> findAllComment(Integer computerID, String sortType);
}
