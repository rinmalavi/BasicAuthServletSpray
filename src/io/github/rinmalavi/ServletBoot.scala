package io.github.rinmalavi

import akka.actor.{Props, ActorSystem}
import spray.servlet.WebBoot

class ServletBoot extends WebBoot {

  val system = ActorSystem("pingers")

  val serviceActor = system.actorOf(Props[MyPing], "ping")
}
