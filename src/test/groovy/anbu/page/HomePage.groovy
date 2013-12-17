package anbu.page

import anbu.path.PathPresentation

class HomePage extends BasePage {

  static url = PathPresentation.BASE
  static at = { title == "Welcome to anbu presentation" }

  static content = {
    items { $('.item') }
  }
}
