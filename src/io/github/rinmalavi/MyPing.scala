package io.github.rinmalavi

import akka.actor.Actor
import spray.routing.HttpService

class MyPing extends Actor with PingService {
  def actorRefFactory = context

  def receive = runRoute(folder)
}

trait PingService extends HttpService {
  val folder = detach() {
    path("ping") {
      complete ("you pinged")
    }
  }
}
