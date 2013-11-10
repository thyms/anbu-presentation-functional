package anbu.spec

import anbu.page.HomePage
import anbu.path.PathFixture

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    given:
      presentation.get(path: PathFixture.RESET)

    when:
      to HomePage

    then:
      at HomePage
  }
}
