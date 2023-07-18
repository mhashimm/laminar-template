package namespace

import scala.scalajs.js
import scala.scalajs.js.JSConverters.*

import com.raquo.laminar.api.L.{*, given}

import org.scalajs.dom

object Main:
  def main(args: Array[String]) = 
    val appElement = div(
      h1("Hello World!")
    )
    renderOnDomContentLoaded(dom.document.querySelector("#app"), appElement)
