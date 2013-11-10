package anbu.page

import anbu.page.module.TableModule
import anbu.path.PathPresentation

class StatusPage extends BasePage {
  static url = PathPresentation.STATUS

  static at = {
    title == "anbu Presentation Admin"
    header.text() == "anbu Presentation Status"
  }

  static content = {
    header { $("h2") }

    status(required: false) { name -> module TableModule, $(".$name")}
  }
}
