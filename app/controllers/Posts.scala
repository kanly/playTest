package controllers

import play.api.mvc._
import models.Post

object Posts extends Controller {
  def list(userName: String, category: String = "all") = Action {
    Ok(views.html.post.list(List(Post("titolo", "body", 12), Post("titolo2", "body2", 13))))
  }

  def post(postId: Long) = TODO

  def comments(postId: Long) = TODO
}
