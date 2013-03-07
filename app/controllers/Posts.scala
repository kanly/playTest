package controllers

import play.api.mvc._
import models.Post

object Posts extends Controller {

  val posts=(List(Post("titolo", "body", 12), Post("titolo2", "body2", 13)) map { t:Post => (t.id, t)}).toMap


  def list(userName: String, category: String = "all") = Action {
    Ok(views.html.post.list(posts map (_._2) toList))
  }

  def post(postId: Long) = Action {
    Ok(views.html.post.detail(posts(postId)))
  }

  def comments(postId: Long) = TODO
}
